package functions

/**
 * Adding a property extension to a data class with companion object
 */
data class CloudWithPropertyExtension(val level: String, val physicalForm: String, val variety: String) {
    companion object
}
val CloudWithPropertyExtension.Companion.clouds get() = listOf(
    CloudWithExtension(
        level = "Towering vertical",
        physicalForm = "Cumuliform",
        variety = "Cumulus congestus"
    ),
    CloudWithExtension(
        level = "Very high-level",
        physicalForm = "Stratocumuliform",
        variety = "Lenticular"
    )
)
fun usingCloudWithPropertyExtension() {
    CloudWithPropertyExtension.clouds
}

/**
 * String Extension properties
 */
val String.lastChar: Char
    get() = this.get(length - 1)

/**
 * Extension var p. 75
 */
var StringBuilder.lastChar: Char
    get() = this.get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    val sb = StringBuilder("Kotlin?")
    println(sb.lastChar)
    sb.lastChar = '!'
    println(sb)
}