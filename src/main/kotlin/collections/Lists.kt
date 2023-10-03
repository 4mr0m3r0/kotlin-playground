package collections

class Lists {
    val defaultList = listOf("A", "B", "C", "D")
    val emptyListOfStrings = emptyList<String>()
    val newListWithValuesOfAnotherList = defaultList + listOf("E", "F", "G", "H")
    val listWithPairs = listOf(
        Pair("Snow leopard", "Panthera uncia"),
        Pair("Lion", "Panthera leo"),
        Pair("Tiger", "Panthera tigris"),
        Pair("Leopard", "Panthera pardus"),
        Pair("Jaguar", "Panthera onca"),
    )

    val filtering = newListWithValuesOfAnotherList.filter { !it.equals("E", true) }
    val filteringNot = newListWithValuesOfAnotherList.filterNot { it.equals("E", true) }

    val mapping = listWithPairs.map { it.first }

    val sortedBySpeciesBy = listWithPairs.map { it.first }.sortedBy { it }
    val sortedBySpecies = listWithPairs.map { it.first }.sorted()

    /**
     * Ranges
     */
    fun ranges() {
        val range = (0..10)
        range.map { "Item $it" }

        // Progression step 2
        val rangeStep = (0..10 step 2)

        // Inversion
        val down = (10 downTo 0)

        // Equivalent to size - 1
        val rangeUntil = (0 until 10)

        // Range with letters. This progression works for chars, integers, and longs
        val rangeLetter = ('a'..'f')

        // Range with float. This is not a progression
        val rangeFloat = (1.0..2.0)
        val isFloatInRange = 1.5 in rangeFloat //This should return true
    }
}
