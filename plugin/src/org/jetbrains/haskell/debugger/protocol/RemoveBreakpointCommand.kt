package org.jetbrains.haskell.debugger.protocol

import org.jetbrains.haskell.debugger.GHCiDebugProcess
import java.util.Deque

/**
 * @author Habibullin Marat
 */

public class RemoveBreakpointCommand(val lineNumber: Int) : AbstractCommand() {
    override fun getBytes(): ByteArray {
        return ":delete $lineNumber\n".toByteArray()
    }

    override fun handleOutput(output: Deque<String?>, debugProcess: GHCiDebugProcess) {
    }
}
