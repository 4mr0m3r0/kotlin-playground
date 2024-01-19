package designpattern.chainofresponsibility

/**
 * Another way of implementing the Chain of Responsibility
 */
open class HandlerRequest {
    open fun handleRequest(request: Request) {
        when (request) {
            Request.Random -> println("Handle -> Random")
            else -> println("This Request $request, doesn't have a handler associated.")
        }
    }
}