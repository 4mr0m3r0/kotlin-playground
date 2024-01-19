package designpattern.chainofresponsibility

fun main() {
    val application: Handler = Application()
    val handlerA: Handler = ConcreteHandlerA(successor = application)
    val handlerB: Handler = ConcreteHandlerB(successor = handlerA)
    val handlerC: Handler = ConcreteHandlerC(successor = handlerB)

    handlerC.handleRequest(Request.Help)
    handlerC.handleRequest(Request.Print)
    handlerC.handleRequest(Request.Preview(param1 = "1", param2 = "2"))
    handlerC.handleRequest(Request.Random)
}