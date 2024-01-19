package designpattern.chainofresponsibility

interface Handler {
    fun handleRequest(request: Request)
}

