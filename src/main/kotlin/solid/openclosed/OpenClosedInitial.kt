package solid.openclosed

class OpenClosedInitial(private val items: List<BuyItem>) {
    fun checkOut(receipt: Receipt) {
        var total = Money.zero
        for (item in items) {
            total += item.getPrice()
            receipt.addItem(item)
        }
        val payment: Payment = acceptCash(total)
        receipt.addPayment(payment)
    }
    private fun acceptCash(total: Money) = Payment()
}
