package designpattern.chainofresponsibility.variantB

import designpattern.chainofresponsibility.Request

class HandlerRequestPreview : HandlerRequest() {
    override fun handleRequest(request: Request) {
        when(request) {
            is Request.Preview -> println("Handle -> Preview")
            else -> super.handleRequest(request)
        }
    }
}