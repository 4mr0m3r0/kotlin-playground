package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

class ConcreteHandlerC : Handler {
    private var successor: Handler? = null

    override fun setSuccessor(handler: Handler) {
        successor = handler
    }

    override fun handleRequest(request: Request) {
        if (request is Request.Preview) {
            println("Concrete Handler C -> Preview with params ${request.param1} and ${request.param2}")
        } else {
            println("Accepted Requests to handle:")
            println("\t(1) ${Request.Help}")
            println("\t(2) ${Request.Print}")
            println("\t(2) ${Request.Preview("param1", "param2")}")
        }
    }
}