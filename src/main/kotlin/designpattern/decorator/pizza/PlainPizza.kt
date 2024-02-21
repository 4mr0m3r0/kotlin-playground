package designpattern.decorator.pizza

class PlainPizza : Pizza {
    override fun getDescription(): String = "Thin Dough"

    override fun getCost(): Double = 4.00
}