package designpattern.state.variantA

class TCPClosed : TCPState {

    override fun activeOpen(t: TCPConnectionContext) {
        println("TCPClosed -> activeOpen -> TCPEstablished")
        changeState(t, TCPEstablished.getInstance())
    }

    override fun passiveOpen(t: TCPConnectionContext) {
        println("TCPClosed -> passiveOpen -> TCPListen")
        changeState(t, TCPListen.getInstance())
    }

    companion object {
        private var instance: TCPState? = null

        fun getInstance(): TCPState = instance ?: TCPClosed().also { instance = it }
    }
}