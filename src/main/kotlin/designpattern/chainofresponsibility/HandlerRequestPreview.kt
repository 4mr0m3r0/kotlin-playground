package designpattern.chainofresponsibility

class HandlerRequestPreview : HandlerRequest() {
    override fun handleRequest(request: Request) {
        when(request) {
            is Request.Preview -> println("Handle -> Preview")
            else -> super.handleRequest(request)
        }
    }
}