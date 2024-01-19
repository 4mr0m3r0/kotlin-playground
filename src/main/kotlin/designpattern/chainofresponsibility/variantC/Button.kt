package designpattern.chainofresponsibility.variantC

class Button(helper: Widget, topic: Topic = NO_HELP_TOPIC) : Widget(parent = helper, topic = topic) {
    override fun handleHelp() {
        if (hasHelp()) {
            println("Offering help on the button")
        } else {
            super.handleHelp()
        }
    }
}