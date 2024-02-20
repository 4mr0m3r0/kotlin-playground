package designpattern.decorator.beverage

class Mocha(beverage: Beverage) : CondimentDecorator(beverage = beverage) {
    override fun getDescription(): String = "${beverage.getDescription()}, Mocha"

    override fun cost(): Double = beverage.cost() + 0.20
}