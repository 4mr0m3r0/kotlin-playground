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