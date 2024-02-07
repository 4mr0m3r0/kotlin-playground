package designpattern.facade

class CodeGenerator(private val bytecodeStream: BytecodeStream) {
    fun visit(statementNode: StatementNode) { }
    fun visit(expressionNode: ExpressionNode) { }
}