package designpattern.facade

class ExpressionNode : ProgramNode {
    override fun getSourcePosition(line: Int, index: Int) {
        TODO("Not yet implemented")
    }

    override fun add(programNode: ProgramNode) {
        TODO("Not yet implemented")
    }

    override fun remove(programNode: ProgramNode) {
        TODO("Not yet implemented")
    }

    override fun traverse(codeGenerator: CodeGenerator) {
        codeGenerator.visit(this)
        //traversing
    }
}