package designpattern.decorator.pizza

class Mozzarella(pizza: Pizza) : ToppingDecorator(pizza = pizza) {
    init {
        println("Adding Dough")
        println("Adding Mozzarella")
    }

    override fun getDescription(): String = "${pizza.getDescription()}, Mozzarella"
    override fun getCost(): Double = pizza.getCost() + .50
}