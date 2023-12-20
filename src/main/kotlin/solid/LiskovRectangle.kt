package solid

open class LiskovRectangle() {
    open var height: Double = 0.0
    open var width: Double = 0.0

    fun area(): Double = height * width
    fun perimeter(): Double = 2 * (height + width)
}