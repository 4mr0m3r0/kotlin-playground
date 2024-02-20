package designpattern.decorator.beverage

abstract class CondimentDecorator(protected val beverage: Beverage) : Beverage() {
    abstract override fun getDescription(): String
}