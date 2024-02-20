package designpattern.decorator.beverage

class Soy(beverage: Beverage) : CondimentDecorator(beverage = beverage) {
    override fun getDescription(): String = "${beverage.getDescription()}, Soy"

    override fun cost(): Double = beverage.cost() + 0.15
}