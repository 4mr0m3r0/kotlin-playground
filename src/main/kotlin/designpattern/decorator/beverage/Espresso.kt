package designpattern.decorator.beverage

class Espresso : Beverage(description = "Espresso") {
    override fun cost(): Double = 1.99
}