package designpattern.chainofresponsibility

class ConcreteHandlerC(private val successor: Handler) : Handler {
    override fun handleRequest(request: Request) {
        when(request) {
            is Request.Preview -> println("Concrete Handler C -> Preview with params ${request.param1} and ${request.param2}")
            else -> successor.handleRequest(request)
        }
    }
}