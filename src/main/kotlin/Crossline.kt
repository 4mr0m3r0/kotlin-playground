fun crossinline () {
    println("Vegetables")
    printVegetables {
        println("Spinach")
        println("Cabbage")
        println("Lettuce")
    }
    println("Fruits")
    printFruits {
        println("Pineapple")
        println("Orange")
        println("Guava")
    }
}

inline fun printVegetables(crossinline vegetables: () -> Unit) {
    println("-----------------")
    vegetables()
}

inline fun printFruits(crossinline fruits: () -> Unit) {
    println("-----------------")
    fruits()
}