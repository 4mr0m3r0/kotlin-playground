package designpattern.decorator.beverage

class SteamedMilk(beverage: Beverage) : CondimentDecorator(beverage = beverage) {
    override fun getDescription(): String = "${beverage.getDescription()}, Steamed Milk"

    override fun cost(): Double = beverage.cost() + 0.10
}