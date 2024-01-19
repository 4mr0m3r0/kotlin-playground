package designpattern.command

class SimpleCommand : Command {
    override fun execute() {
        println("Simple Command")
    }
}