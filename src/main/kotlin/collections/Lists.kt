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
}
