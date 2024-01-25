package designpattern.state.variantA

class TCPConnectionContext {
    var state: TCPState? = null
        private set
    init {
        state = TCPClosed.getInstance()
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