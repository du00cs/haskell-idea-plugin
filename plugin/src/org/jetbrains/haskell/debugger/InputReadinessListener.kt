package org.jetbrains.haskell.debugger

import java.net.ServerSocket
import java.net.Socket
import java.net.SocketException

/**
 * Created by vlad on 7/16/14.
 */

public class InputReadinessListener(val debugProcess: GHCiDebugProcess) : Runnable {

    class object {
        private val OUTPUT_ACCEPTED_BYTE: Int = 0
    }

    private var running = true
    public var connected: Boolean = false
        private set

    private val serverSocket: ServerSocket = ServerSocket(GHCiDebugProcess.INPUT_READINESS_PORT)

    override fun run() {

        var socket: Socket? = null
        try {
            while (running) {
                /*
                 * Need to always reopen connection (not because of hClose command in ghci)
                 */
                socket = serverSocket.accept()
                connected = true
                val b = socket!!.getInputStream()!!.read()
                if (b == OUTPUT_ACCEPTED_BYTE) {
                    debugProcess.allOutputAccepted.set(true)
                } else {
                    debugProcess.getSession()?.stop()
                    running = false
                }
                socket!!.close()
                connected = false
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            running = false
            connected = false
            socket?.close()
            serverSocket.close()
        }
    }

    public fun start() {
        Thread(this).start()
    }

    public fun stop() {
        running = false
        serverSocket.close()
    }

}
