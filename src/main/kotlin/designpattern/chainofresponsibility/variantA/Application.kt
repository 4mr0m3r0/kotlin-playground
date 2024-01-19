package designpattern.chainofresponsibility.variantA

import designpattern.chainofresponsibility.Request

class Application : Handler {
    override fun handleRequest(request: Request) {
        println("Accepted Requests to handle:")
        println("\t(1) ${Request.Help}")
        println("\t(2) ${Request.Print}")
        println("\t(2) ${Request.Preview("param1", "param2")}")
    }
}