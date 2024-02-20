package designpattern.decorator.beverage

fun main() {
    val espresso: Beverage = Espresso()
    println("${espresso.getDescription()} $${espresso.cost()}")

    var darkRoast: Beverage = DarkRoast()
    darkRoast = Mocha(darkRoast)
    darkRoast = Mocha(darkRoast)
    darkRoast = Whip(darkRoast)
    println("${darkRoast.getDescription()} $${darkRoast.cost()}")

    var houseBlend: Beverage = HouseBlend()
    houseBlend = Soy(houseBlend)
    houseBlend = Mocha(houseBlend)
    houseBlend = Whip(houseBlend)
    println("${houseBlend.getDescription()} $${houseBlend.cost()}")
}