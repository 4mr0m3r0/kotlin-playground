package designpattern.chainofresponsibility.variantC

class Application(topic: Topic) : HelpHandler(null, topic) {
    override fun handleHelp() {
        println("Accepted helpers:")
        println("\t(1) Button widget")
        println("\t(2) Dialog widget")
    }
}