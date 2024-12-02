package functions

/**
 * Adding extension to a data class with companion object
 */
data class CloudWithExtension(val level: String, val physicalForm: String, val variety: String) {
    companion object
}
fun CloudWithExtension.Companion.generateClouds() = listOf(
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
fun usingCloudWithExtension() {
    CloudWithExtension.generateClouds()
}

/**
 * No overriding for extension functions. Kotlin in Action p. 73
 */
open class XView {
    open fun click() = println("View clicked")
}
class XButton : XView() {
    override fun click() = println("Button clicked")
}
fun XView.showOff() = println("I'm a view!")
fun XButton.showOff() = println("I'm a button!")

fun main() {
    val view: XView = XButton()
    view.showOff()
}