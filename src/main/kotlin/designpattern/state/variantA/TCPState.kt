package designpattern.state.variantA

interface TCPState {
    fun transmit(t: TCPConnectionContext, tcpOctetStream: TCPOctetStream) {}
    fun activeOpen(t: TCPConnectionContext) {}
    fun passiveOpen(t: TCPConnectionContext) {}
    fun close(t: TCPConnectionContext) {}
    fun synchronize(t: TCPConnectionContext) {}
    fun acknowledge(t: TCPConnectionContext) {}
    fun send(t: TCPConnectionContext) {}
    fun changeState(t: TCPConnectionContext, state: TCPState){
        t.changeState(state)
    }
}