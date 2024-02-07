package designpattern.facade

class ProgramNodeBuilder {
    fun getRootNode(): ProgramNode = ExpressionNode()
}