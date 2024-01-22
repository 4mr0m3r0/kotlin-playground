package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

class ConcreteHandlerB : Handler {
    private var successor: Handler? = null

    override fun setSuccessor(handler: Handler) {
        successor = handler
    }

    override fun handleRequest(request: Request) {
        if (request is Request.Print) {
            println("Concrete Handler B -> Print")
        } else {
            successor?.handleRequest(request)
        }
    }
}