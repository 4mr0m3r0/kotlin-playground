package designpattern.command

class MacroCommand : Command {
    private val commands: MutableList<Command> = mutableListOf()
    override fun execute() {
        for (command in commands) {
            command.execute()
        }
    }
    fun add(command: Command) {
        commands.add(command)
    }
    fun remove(command: Command) {
        commands.remove(command)
    }
}