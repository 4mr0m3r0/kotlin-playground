package designpattern.decorator.pizza

open class ToppingDecorator(protected val pizza: Pizza) : Pizza {
    override fun getDescription(): String = pizza.getDescription()

    override fun getCost(): Double = pizza.getCost()
}