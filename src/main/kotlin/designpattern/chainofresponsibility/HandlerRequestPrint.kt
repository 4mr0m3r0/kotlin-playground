package designpattern.chainofresponsibility

class HandlerRequestPrint : HandlerRequest() {
    override fun handleRequest(request: Request) {
        when(request) {
            is Request.Print -> println("Handle -> Print")
            else -> super.handleRequest(request)
        }
    }
}