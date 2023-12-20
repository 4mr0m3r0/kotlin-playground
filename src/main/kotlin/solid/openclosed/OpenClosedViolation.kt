package solid.openclosed

class OpenClosedViolation(private val items: List<BuyItem>) {
    fun checkOut(receipt: Receipt, credit: Boolean) {
        var total = Money.zero
        for (item in items) {
            total += item.getPrice()
            receipt.addItem(item)
        }
        /**
         * Notice how we changed the code of this function in order adapt to accept credit payments.
         * This is a violation of Open Closed principle. This function should be closed to modification.
         */
        val payment: Payment = if (credit) {
            acceptCredit(total)
        } else {
            acceptCash(total)
        }
        receipt.addPayment(payment)
    }
    private fun acceptCash(total: Money) = Payment()
    private fun acceptCredit(total: Money) = Payment()
}
