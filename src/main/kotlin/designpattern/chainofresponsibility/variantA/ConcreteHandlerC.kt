package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

class ConcreteHandlerC(private val successor: Handler) : Handler {
    override fun handleRequest(request: Request) {
        if (request is Request.Preview) {
            println("Concrete Handler C -> Preview with params ${request.param1} and ${request.param2}")
        } else {
            successor.handleRequest(request)
        }
    }
}