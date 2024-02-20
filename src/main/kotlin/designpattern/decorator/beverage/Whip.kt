package designpattern.decorator.beverage

class Whip(beverage: Beverage) : CondimentDecorator(beverage = beverage) {
    override fun getDescription(): String = "${beverage.getDescription()}, Whip"

    override fun cost(): Double = beverage.cost() + 0.10
}