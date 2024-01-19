package designpattern.chainofresponsibility.variantC

typealias Topic = Int
const val NO_HELP_TOPIC: Topic = -1
open class HelpHandler(private var successor: HelpHandler? = null, private var topic: Topic = NO_HELP_TOPIC) {
    open fun hasHelp(): Boolean = topic != NO_HELP_TOPIC
    fun setHandler(handler: HelpHandler, topic: Topic) {
        successor = handler
        this.topic = topic
    }
    open fun handleHelp() {
        successor?.handleHelp()
    }
}