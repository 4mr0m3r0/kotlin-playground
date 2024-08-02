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

    fun usingJoinToString() {
        val numbers = listOf(1, 2, 3, 4, 5, 6)
        println(numbers.joinToString()) // 1, 2, 3, 4, 5, 6
        println(numbers.joinToString(prefix = "[", postfix = "]")) // [1, 2, 3, 4, 5, 6]
        println(numbers.joinToString(prefix = "<", postfix = ">", separator = "•")) // <1•2•3•4•5•6>
        println(numbers.joinToString(separator = " ")) // 1 2 3 4 5 6
    }
}
