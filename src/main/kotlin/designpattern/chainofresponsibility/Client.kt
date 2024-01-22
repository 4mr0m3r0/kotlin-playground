package designpattern.chainofresponsibility

import designpattern.chainofresponsibility.variantA.ConcreteHandlerA
import designpattern.chainofresponsibility.variantA.ConcreteHandlerB
import designpattern.chainofresponsibility.variantA.ConcreteHandlerC
import designpattern.chainofresponsibility.variantA.Handler
import designpattern.chainofresponsibility.variantB.HandlerRequest
import designpattern.chainofresponsibility.variantB.HandlerRequestPreview
import designpattern.chainofresponsibility.variantC.Button
import designpattern.chainofresponsibility.variantC.Dialog
import designpattern.chainofresponsibility.variantC.Topic
import designpattern.chainofresponsibility.variantC.Application as ApplicationC

fun main() {
    println("Variant A")
    chainOfResponsibilityVariantA()
    println("------------------------------------------------------")
    println("Variant B")
    chainOfResponsibilityVariantB()
    println("------------------------------------------------------")
    println("Variant C")
    chainOfResponsibilityVariantC()
}

private fun chainOfResponsibilityVariantA() {
    val handlerA: Handler = ConcreteHandlerA()
    val handlerB: Handler = ConcreteHandlerB()
    val handlerC: Handler = ConcreteHandlerC()
    handlerA.setSuccessor(handlerB)
    handlerB.setSuccessor(handlerC)


    handlerA.handleRequest(Request.Help)
    handlerA.handleRequest(Request.Print)
    handlerA.handleRequest(Request.Preview(param1 = "1", param2 = "2"))
    handlerA.handleRequest(Request.Random)
}

private fun chainOfResponsibilityVariantB() {
    val handlerRequest = HandlerRequest()
    val handlerRequestPreview: HandlerRequest = HandlerRequestPreview()

    handlerRequestPreview.handleRequest(Request.Help)
}

private const val PRINT_TOPIC: Topic = 1
private const val PAPER_ORIENTATION_TOPIC: Topic = 2
private const val APPLICATION_TOPIC: Topic = 3
private fun chainOfResponsibilityVariantC() {
    val application = ApplicationC(APPLICATION_TOPIC)
    val dialog = Dialog(application, PRINT_TOPIC)
    // Setting the topic on Button, it prints -> Offering help on the dialog
    val button = Button(dialog, PAPER_ORIENTATION_TOPIC)
    button.handleHelp()
    // Otherwise, not setting the topic on Button, it prints -> Offering help on the dialog
    val buttonWithoutTopic = Button(dialog)
    buttonWithoutTopic.handleHelp()
}