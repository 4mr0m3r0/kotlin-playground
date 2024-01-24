package designpattern.state.variantA

class TCPClosed : TCPState {

    override fun activeOpen(t: TCPConnectionContext) {
        println("TCPClosed -> activeOpen -> TCPEstablished")
        changeState(t, TCPEstablished())
    }

    override fun passiveOpen(t: TCPConnectionContext) {
        println("TCPClosed -> passiveOpen -> TCPListen")
        changeState(t, TCPListen())
    }
}