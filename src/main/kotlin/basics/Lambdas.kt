package basics

class Lambdas {
    val aLambda: (Int, Int) -> Int = { x, y -> x + y }
    val aLambdaInfer = { x: Int, y: Int -> x + y }
    val aLambdaOneParam: (Int) -> Int = { it * it }

    fun invokingLambda() {
        val lambdaResult = aLambda.invoke(3, 5)
        val lambdaResultB = aLambda(3, 5)
        val lambdaInferringTypes = aLambdaInfer(3, 5)
    }

    fun lambdaAsAParameterInMethod() {
        val callingOperation = doOperation(3, 5, aLambdaInfer)
        // OR
        val callingOperation2 = doOperation(3, 5) { x, y -> x * y }
    }

    fun doOperation(x: Int, y: Int, operation: (Int, Int) -> Int) = operation(x, y)
}