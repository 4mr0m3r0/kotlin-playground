package designpattern.chainofresponsibility

class ConcreteHandlerA(private val successor: Handler) : Handler {
    override fun handleRequest(request: Request) {
        when(request) {
            Request.Help -> println("Concrete Handler A -> Help")
            else -> successor.handleRequest(request)
        }
    }
}