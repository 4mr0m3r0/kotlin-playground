package designpattern.decorator.beverage

class Decaf : Beverage(description = "Decaf Coffee") {
    override fun cost(): Double = 1.05
}