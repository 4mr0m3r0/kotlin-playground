package designpattern.command

class OpenCommand(private val receiver: Receiver) : Command {
    override fun execute() {
        val name = AskUser.name()
        if (name != 0) {
            val document = Document(name = name)
            receiver.add(document)
            document.open()
        }
        println("Open Command")
    }
}