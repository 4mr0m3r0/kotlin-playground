package collections

fun reduceApi() {
    val list = listOf(1, 2, 3, 4)
    val summed = list.reduce { acc, element ->
        acc + element
    }
    println(summed)
    val multiplied = list.reduce { acc, element ->
        acc * element
    }
    println(multiplied)
}

fun foldApi() {
    val people = listOf(
        Person("Aleksei", 29),
        Person("Natalia", 28)
    )
    val folded = people.fold("") { acc, person ->
        acc + person.name
    }
    println(folded)
}

data class Person(val name: String, val age: Int)

fun runningReduceApi() {
    val list = listOf(1, 2, 3, 4)
    val summed = list.runningReduce { acc, element ->
        acc + element
    }
    println(summed)
    val multiplied = list.runningReduce { acc, element ->
        acc * element
    }
    println(multiplied)
}

fun runningFoldApi() {
    val people = listOf(
        Person("Aleksei", 29),
        Person("Natalia", 28)
    )
    println(people.runningFold("") { acc, person ->
        acc + person.name
    })
}

val predicateAge = { p: Person -> p.age <= 27 }
val people = listOf(Person("Alice", 27), Person("Bob", 31))
fun predicateAllApi() {
    println("From -> $people -> Are all people below 27 years old? ${people.all(predicateAge)}")
}

fun predicateAnyApi() {
    println("From -> $people -> Are all people below 27 years old? ${people.any(predicateAge)}")
}

fun predicateNoneApi() {
    val list = listOf(1, 2, 3)
    println(list.none { it == 4 }) //true
}

fun predicateCountApi() {
    println(people.count(predicateAge)) // 1
}

fun predicateFindApi() {
    println(people.find(predicateAge)) // Person(name=Alice, age=27)
}



fun main() {
    reduceApi()
    foldApi()
    runningReduceApi()
    runningFoldApi()
    predicateAllApi()
    predicateAnyApi()
    predicateNoneApi()
    predicateCountApi()
    predicateFindApi()
}