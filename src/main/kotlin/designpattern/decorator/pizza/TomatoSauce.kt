package designpattern.decorator.pizza

class TomatoSauce(pizza: Pizza) : ToppingDecorator(pizza = pizza) {
    init {
        println("Adding Sauce")
    }

    override fun getDescription(): String = "${pizza.getDescription()}, Tomato Sauce"
    override fun getCost(): Double = pizza.getCost() + .35
}