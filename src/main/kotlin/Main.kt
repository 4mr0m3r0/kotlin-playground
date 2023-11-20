@file:JvmName("MainKotlin")

fun main(args: Array<String>) { }

fun callingKotlinFromJava() = "Calling Kotlin from Java"

fun callingJavaFromKotlin() {
    val interoperability = Interoperability()
    val aString: String = interoperability.notNullString
    val aNullString: String? = interoperability.nullString
}

fun String.anotherExtension(other: String) = "another extension plus $other"

@JvmOverloads
fun overloadFunction(paramA: String, paramB: String = "Default"): String {
    return paramA + paramB
}

fun readKotlinLambdaFromJava(lambda: (String, Int) -> String) { }

object KotlinObject {
    @JvmField
    var property: String = ""

    @JvmStatic
    fun staticFunctionForJava() = "String"
}