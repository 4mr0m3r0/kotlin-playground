package functions

class InlineFunction {
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

    /**
     * It is possible to use `return` keyword in a parameter of inline functions
     */
    fun returnInsidePredicate() {
        val middle = cloudGenus.filterByLevel {
            println("Predicate of inline function"); return
        }
        println("It won't reach at this point, because of the return inside inline function")
    }

    private inline fun <T> List<T>.filterByLevel(predicate: (T) -> Boolean): List<T> {
        val newList = mutableListOf<T>()
        for (element in this) {
            if (predicate(element)) {
                newList.add(element)
            }
        }
        return newList
    }
}