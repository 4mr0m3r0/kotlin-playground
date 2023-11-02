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