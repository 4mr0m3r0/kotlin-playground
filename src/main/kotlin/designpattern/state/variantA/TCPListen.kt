package designpattern.state.variantA

class TCPListen : TCPState {
    override fun send(t: TCPConnectionContext) {
        println("TCPListen -> send -> TCPEstablished")
        changeState(t, TCPEstablished())
    }
}