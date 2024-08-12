package basics

import kotlin.random.Random

val random = Random(1000).nextInt()

val stringTemplate = "Random number of $random"

fun main() {
    val name = readln()
    val lastname = readln()
    println("First name, ${if (name.isBlank()) "person" else name}!")
    println("Lastname, ${lastname.ifBlank { "person" }}!")
}