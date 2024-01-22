package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

class ConcreteHandlerA : Handler {
    private var successor: Handler? = null

    override fun setSuccessor(handler: Handler) {
        successor = handler
    }

    override fun handleRequest(request: Request) {
        if (request is Request.Help) {
            println("Concrete Handler A -> Help")
        } else {
            successor?.handleRequest(request)
        }
    }
}