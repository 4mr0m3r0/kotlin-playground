package designpattern.state.variantA

class TCPConnectionContext {
    private var state: TCPState? = null
    init {
        state = TCPClosed()
    }
    fun changeState(state: TCPState) {
        this.state = state
        println("State has changed: $state")
    }
    fun activeOpen() {
        state?.activeOpen(this)
    }
    fun passiveOpen() {
        state?.passiveOpen(this)
    }
    fun close() {
        state?.close(this)
    }
    fun acknowledge() {
        state?.acknowledge(this)
    }
    fun synchronize() {
        state?.synchronize(this)
    }
    fun processOctet(tcpOctetStream: TCPOctetStream) {}
}