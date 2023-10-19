package functions

import functions.InfixFunction.Cheese.Mozzarella
import functions.InfixFunction.Meat.Chicken
import functions.InfixFunction.Vegetable.Arugula
import functions.InfixFunction.Vegetable.Eggplants

class InfixFunction {
    sealed interface Cheese {
        data object Mozzarella : Cheese
        data object Cheddar : Cheese
        data object AgedHavarti : Cheese
    }
    sealed interface Meat {
        data object Beef : Meat
        data object Seafood : Meat
        data object Chicken : Meat
    }
    sealed interface Vegetable {
        data object Mushrooms : Vegetable
        data object Eggplants : Vegetable
        data object Arugula : Vegetable
    }
    data class Pizza(
        val cheese: Cheese? = null,
        val meat: Meat? = null,
        val vegetable: Vegetable? = null,
    )

    fun createOnlyCheesePizza(): Pizza {
        val pizza = Pizza()
        return pizza addIngredient Mozzarella
    }

    fun createVeggiePizza(): Pizza {
        val pizza = Pizza()
        return pizza addIngredient Mozzarella addIngredient Arugula
    }

    fun createMeatAndVegetablePizza(): Pizza {
        val pizza = Pizza()
        return pizza addIngredient Chicken addIngredient Eggplants
    }

    private infix fun Pizza.addIngredient(cheese: Cheese?) = copy(cheese = cheese)
    private infix fun Pizza.addIngredient(vegetable: Vegetable?) = copy(vegetable = vegetable)
    private infix fun Pizza.addIngredient(meat: Meat?) = copy(meat = meat)
}