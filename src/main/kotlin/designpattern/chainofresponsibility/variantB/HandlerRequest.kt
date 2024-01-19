package designpattern.chainofresponsibility.variantB

import designpattern.chainofresponsibility.Request

/**
 * Another way of implementing the Chain of Responsibility
 */
open class HandlerRequest {
    open fun handleRequest(request: Request) {
        when (request) {
            Request.Help -> println("Handle -> Help")
            Request.Print -> println("Handle -> Print")
            Request.Random -> println("Handle -> Random")
            else -> println("This Request $request, doesn't have a handler associated.")
        }
    }
}