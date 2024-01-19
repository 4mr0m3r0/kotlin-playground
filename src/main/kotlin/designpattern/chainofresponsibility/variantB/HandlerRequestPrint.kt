package designpattern.chainofresponsibility.variantB

import designpattern.chainofresponsibility.Request

class HandlerRequestPrint : HandlerRequest() {
    override fun handleRequest(request: Request) {
        when(request) {
            is Request.Print -> println("Handle -> Print")
            else -> super.handleRequest(request)
        }
    }
}