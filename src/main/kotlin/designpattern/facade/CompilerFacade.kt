package designpattern.facade

class CompilerFacade {
    fun compile(input: String, output: BytecodeStream) {
        val scanner = Scanner(input)
        val builder = ProgramNodeBuilder()
        val parser = Parser(scanner, builder)
        val parseTree: ProgramNode = builder.getRootNode()
        parseTree.traverse(CodeGenerator(output))
    }
}