package collections

fun spreadOperator(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}

fun main() {
    spreadOperator(args = arrayOf("First", "Second", "Third"))
}