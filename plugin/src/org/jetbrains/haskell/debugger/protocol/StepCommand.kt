package org.jetbrains.haskell.debugger.protocol

import org.jetbrains.haskell.debugger.GHCiDebugProcess
import com.intellij.xdebugger.frame.XSuspendContext
import org.jetbrains.haskell.debugger.parser.Parser
import java.util.Deque

/**
 * Created by vlad on 7/17/14.
 */

public abstract class StepCommand : AbstractCommand() {


    override fun handleOutput(output: Deque<String?>, debugProcess: GHCiDebugProcess) {
        val filePosition = Parser.tryParseStoppedAt(output)
        if (filePosition != null) {
            val context = object : XSuspendContext() {}
            debugProcess.getSession()!!.positionReached(context)
        }
    }
}
