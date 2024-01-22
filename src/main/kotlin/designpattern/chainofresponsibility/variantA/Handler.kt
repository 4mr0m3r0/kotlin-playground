package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

interface Handler {
    fun setSuccessor(handler: Handler)
    fun handleRequest(request: Request)
}

