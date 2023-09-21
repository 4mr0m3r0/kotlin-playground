fun sets() {
    val repeatedList = listOf("Repeated Element", "A different one A", "A different one B", "Repeated Element")
    val repetitionRemoved = repeatedList.toSet()
    println(repetitionRemoved)
}