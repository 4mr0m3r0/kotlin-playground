package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

class ConcreteHandlerA(private val successor: Handler) : Handler {
    override fun handleRequest(request: Request) {
        if (request is Request.Help) {
            println("Concrete Handler A -> Help")
        } else {
            successor.handleRequest(request)
        }
    }
}