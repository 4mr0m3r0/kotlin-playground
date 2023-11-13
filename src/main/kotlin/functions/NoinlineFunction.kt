package functions

class NoinlineFunction {

    fun getCloudGenus(level: String): List<String> {
        val cloudGenus = listOf(
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
        return cloudGenus.filterByLevel(
            { pair -> pair.second == level },
            { pair -> pair.first.contains('r') }
        ).map { pair -> pair.first }
    }

    private inline fun <T> List<T>.filterByLevel(predicateA: (T) -> Boolean, noinline predicateB: (T) -> Boolean): List<T> {
        val newList = mutableListOf<T>()
        for (element in this) {
            if (predicateA(element) && predicateB(element)) {
                newList.add(element)
            }
        }
        return newList
    }
}