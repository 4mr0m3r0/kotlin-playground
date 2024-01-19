package designpattern.command

class PasteCommand(private val document: Document) : Command {
    override fun execute() {
        document.paste()
        println("Paste Command")
    }
}