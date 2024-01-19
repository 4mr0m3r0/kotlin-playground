package designpattern.chainofresponsibility.variantC

open class Widget protected constructor(parent: Widget?, topic: Int = NO_HELP_TOPIC) : HelpHandler(successor = parent, topic = topic)