package designpattern.state.variantA

class TCPListen : TCPState {
    override fun send(t: TCPConnectionContext) {
        println("TCPListen -> send -> TCPEstablished")
        changeState(t, TCPEstablished.getInstance())
    }

    companion object {
        private var instance: TCPState? = null

        fun getInstance(): TCPState = instance ?: TCPListen().also { instance = it }
    }
}