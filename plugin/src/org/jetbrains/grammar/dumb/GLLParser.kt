package org.jetbrains.grammar.dumb

import org.jetbrains.haskell.parser.lexer.HaskellLexer
import com.intellij.psi.tree.IElementType
import java.util.ArrayList
import java.util.HashSet
import java.util.HashMap

/**
 * Created by atsky on 11/17/14.
 */
class GLLParser(val grammar: Map<String, Rule>, val tokens: List<IElementType>) {

    fun parse(): NonTerminalTree? {
        val rule = grammar["module"]!!

        var states = ArrayList<ParserState>();

        for (variant in rule.variants) {
            states.add(ParserState(rule, variant, 0, 0, listOf(), listOf()))
        }

        val rules = HashMap<Int, Map<String, List<ParserState>>>()

        @main_loop
        while (states.notEmpty) {
            val newStates = HashSet<ParserState>();

            for (state in states) {
                if (state.variant.terms.size == state.ruleIndex) {
                    val tree = NonTerminalTree(state.rule.name, state.trees)
                    for (left in state.rule.left) {
                        newStates.add(ParserState(state.rule, left, 1, state.termIndex, listOf(tree), state.parents))
                    }
                    val parents = state.parents
                    if (!parents.empty) {
                        for (parent in parents) {
                            newStates.add(parent.next(state.termIndex, tree));
                            //println("done ${state.termIndex}, stack = ${state.getStack()}")
                        }
                    } else {
                        return tree;
                    }
                } else {
                    val term = state.variant.terms[state.ruleIndex]

                    when (term) {
                        is Terminal -> {
                            if (state.termIndex < tokens.size) {
                                addTerm(newStates, state, term)
                            }
                        }

                        is NotTerminal ->
                            addNonTerminal(term, state, rules)
                    }
                }
            }
            for (m in rules.values()) {
                for ((ruleName, prevStates) in m) {
                    val statesSet = HashSet(prevStates)

                    val state = prevStates[0]
                    val nextRule = grammar[ruleName]!!
                    for (variant in nextRule.variants) {
                        val nextState = ParserState(nextRule, variant, 0, state.termIndex, listOf(), ArrayList(statesSet))
                        newStates.add(nextState)
                    }

                }
            }
            rules.clear();
            states = ArrayList(newStates)
            //System.out.println("-----${states.size}-----")
        }
        return null;
    }

    private fun addTerm(newStates: HashSet<ParserState>,
                        state: ParserState,
                        term: Terminal) {
        val currentType = tokens[state.termIndex]
        if (currentType == term.tokenType) {
            newStates.add(state.nextToken());
        } else {
            //println("index=${state.termIndex}, [${currentType}] != [${term.tokenType}], stack = ${state.getStack()}")
        }
    }

    private fun addNonTerminal(term: NotTerminal,
                               state: ParserState,
                               rules: HashMap<Int, Map<String, List<ParserState>>>) {
        val ruleName = term.rule
        val nextRule = grammar[ruleName]
        if (nextRule != null) {
            val map = HashMap(rules[state.termIndex] ?: HashMap<String, List<ParserState>>())
            val list = ArrayList(map[ruleName] ?: listOf())
            list.add(state)
            map[ruleName] = list
            rules[state.termIndex] = map;
        } else {
            //println("index=${state.termIndex} no rule ${ruleName}");
        }
    }
}