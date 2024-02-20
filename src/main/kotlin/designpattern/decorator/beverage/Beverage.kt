package designpattern.decorator.beverage

abstract class Beverage(private val description: String = "Unknown Beverage") {
    open fun getDescription(): String = description
    abstract fun cost(): Double
}