package designpattern.decorator.pizza

fun main() {
    val pizza: Pizza = TomatoSauce(
        pizza = Mozzarella(
            pizza = PlainPizza()
        )
    )
    println("Ingredients: ${pizza.getDescription()}")
    println("Price: ${pizza.getCost()}")
}