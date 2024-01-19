package designpattern.chainofresponsibility.variantC

class Dialog(handler: HelpHandler, topic: Topic = NO_HELP_TOPIC) : Widget(null) {
    init {
        setHandler(handler, topic)
    }

    override fun handleHelp() {
        if (hasHelp()) {
            println("Offering help on the dialog")
        } else {
            super.handleHelp()
        }
    }
}