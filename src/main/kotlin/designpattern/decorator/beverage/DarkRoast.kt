package designpattern.decorator.beverage

class DarkRoast : Beverage(description = "Dark Roast Coffee") {
    override fun cost(): Double = 0.99
}