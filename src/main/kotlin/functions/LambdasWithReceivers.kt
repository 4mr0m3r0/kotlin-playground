package functions

/**
 * Lambdas with Receivers is something very common in Compose.
 * Using it you can use any functionality of the instance (like this example with String)
 * Ref: https://kotlinlang.org/docs/lambdas.html#function-literals-with-receiver
 */
fun receiverSample1(f: String.() -> String) {}
fun anyFunction() {
    receiverSample1 {
        uppercase()
    }
}

fun receiverSampleWith(receiver: String, block: String.() -> Unit) {
    receiver.block()
}
fun anyFunction2() {
    receiverSampleWith("AnyString") {
        println(this.uppercase())
    }
}

fun <T, R> receiverSampleWithGeneric(receiver: T, block: T.() -> R): R = receiver.block()
fun anyFunction2Generic() {
    val number: Int = receiverSampleWithGeneric("AnyString") {
        println(this.uppercase())
        20
    }
}

fun String.receiverSampleRun(block: String.() -> Int): Int = block()
fun anyFunction3() {
    val number: Int = "AnyString".receiverSampleRun {
        println(this.uppercase())
        20
    }
}

fun <T, R> T.receiverSampleRunGeneric(block: T.() -> R): R = block()
fun anyFunction3Generic() {
    val number: Int = "AnyString".receiverSampleRunGeneric {
        println(this.uppercase())
        20
    }
}

fun <T> T.receiverSampleApplyGeneric(block: T.() -> Unit): T {
    this.block()
    return this
}
fun anyFunction4Generic() {
    val str: String = "AnyString".receiverSampleApplyGeneric {
        println(this.uppercase())
    }
}

/**
 * The following examples are inputs of type Parameter
 */
fun String.parameterAlso(block: (String) -> Unit): String {
    block(this)
    return this
}
fun anyFunction5() {
    val str: String = "AnyString".parameterAlso {
        println(it.uppercase())
    }
}

fun <T, R> T.parameterLet(block: (T) -> R): R = block(this)
fun anyFunction6() {
    val number: Int = "AnyString".parameterLet {
        println(it.uppercase())
        20
    }
}