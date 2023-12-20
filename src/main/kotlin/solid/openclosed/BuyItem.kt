package solid.openclosed

class BuyItem(private val value: Int) {
    fun getPrice() = Money(value)
}