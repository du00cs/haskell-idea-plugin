package org.jetbrains.yesod.hamlet.parser

/**
 * @author Leyla H
 */

import com.intellij.lexer.FlexAdapter
import java.io.Reader

class HamletLexer : FlexAdapter(_HamletLexer(null as Reader?))