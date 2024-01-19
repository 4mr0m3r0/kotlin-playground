package designpattern.chainofresponsibility

class HandlerRequestHelp : HandlerRequest() {
    override fun handleRequest(request: Request) {
        when(request) {
            is Request.Help -> println("Handle -> Help")
            else -> super.handleRequest(request)
        }
    }
}