package interfaces

interface Tree {
    fun taxonomicFamily(): String

    fun printTaxonomyFamily() {
        println("The major tree genera by taxonomic family are: Flowering plants, Conifers, Ginkgos, Cycads and Ferns.")
        println("Your object is of family: ${taxonomicFamily()}")
    }
}

class Conifers() : Tree {
    override fun taxonomicFamily(): String = "\uD83C\uDF32 Conifers \uD83C\uDF32"
}

fun main() {
    val conifer = Conifers()
    conifer.printTaxonomyFamily()
}