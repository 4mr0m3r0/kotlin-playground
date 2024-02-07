package designpattern.facade

interface ProgramNode {
    fun getSourcePosition(line: Int, index: Int)
    fun add(programNode: ProgramNode)
    fun remove(programNode: ProgramNode)
    fun traverse(codeGenerator: CodeGenerator)
}