package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

class ConcreteHandlerB(private val successor: Handler) : Handler {
    override fun handleRequest(request: Request) {
        if (request is Request.Print) {
            println("Concrete Handler B -> Print")
        } else {
            successor.handleRequest(request)
        }
    }
}