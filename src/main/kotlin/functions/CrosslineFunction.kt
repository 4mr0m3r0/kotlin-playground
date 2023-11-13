package functions

class CrosslineFunction {
    private val cloudGenus = listOf(
        "Cirrus" to "High",
        "Cirrocumulus" to "High",
        "Cirrostratus" to "High",
        "Altocumulus" to "Middle",
        "Altostratus" to "Middle",
        "Cumulonimbus" to "Towering vertical",
        "Cumulus congestus" to "Towering vertical",
        "Nimbostratus" to "Moderate vertical",
        "Cumulus mediocris" to "Moderate vertical",
        "Stratocumulus" to "Low",
        "Cumulus humilis" to "Low",
        "Stratus" to "Low",
    )

    fun getCloudGenus(level: String): List<String> {
        return cloudGenus.filterByLevel { pair -> pair.second == level }.map { pair -> pair.first }
    }

    private inline fun <T> List<T>.filterByLevel(crossinline predicate: (T) -> Boolean): List<T> {
        val newList = mutableListOf<T>()
        for (element in this) {
            if (predicate(element)) {
                newList.add(element)
            }
        }
        return newList
    }
}