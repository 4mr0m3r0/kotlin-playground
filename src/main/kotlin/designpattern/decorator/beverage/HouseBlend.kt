package designpattern.decorator.beverage

class HouseBlend : Beverage(description = "House Blend Coffee") {
    override fun cost(): Double = 0.89
}