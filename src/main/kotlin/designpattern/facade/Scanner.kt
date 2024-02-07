package designpattern.facade

class Scanner(private val inputStream: String) {
    fun scanner() = Token()
}