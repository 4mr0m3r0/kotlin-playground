package designpattern.state.variantA

class TCPEstablished : TCPState {
    override fun transmit(t: TCPConnectionContext, tcpOctetStream: TCPOctetStream) {
        println("TCPEstablished -> transmit -> processOctet")
        t.processOctet(tcpOctetStream)
    }

    override fun close(t: TCPConnectionContext) {
        println("TCPEstablished -> close -> TCPListen")
        changeState(t, TCPListen.getInstance())
    }

    companion object {
        private var instance: TCPState? = null

        fun getInstance(): TCPState = instance ?: TCPEstablished().also { instance = it }
    }
}