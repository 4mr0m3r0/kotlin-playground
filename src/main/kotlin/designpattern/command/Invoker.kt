package designpattern.command

class Invoker {
    fun executeCommand(command: Command) {
        command.execute()
    }
}