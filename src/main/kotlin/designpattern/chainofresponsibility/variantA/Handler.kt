package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

interface Handler {
    fun handleRequest(request: Request)
}

