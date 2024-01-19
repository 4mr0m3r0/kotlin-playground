package designpattern.command

fun main() {
    val openCommand = OpenCommand(Receiver())
    val pasteCommand = PasteCommand(Document(name = 1))
    val simpleCommand = SimpleCommand()
    val invoker = Invoker()
    invoker.executeCommand(openCommand)
    invoker.executeCommand(pasteCommand)
    invoker.executeCommand(simpleCommand)
}