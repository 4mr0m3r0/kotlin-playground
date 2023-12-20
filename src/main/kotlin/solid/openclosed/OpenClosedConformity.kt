package solid.openclosed

class OpenClosedConformity(private val items: List<BuyItem>) {
    /**
     * Passing an interface we can easily extend the payment method using its concrete classes
     * such as: `CreditPaymentMethod`, `CashPaymentMethod`, and so on.
     */
    fun checkOut(receipt: Receipt, paymentMethod: PaymentMethod) {
        var total = Money.zero
        for (item in items) {
            total += item.getPrice()
            receipt.addItem(item)
        }
        val payment: Payment = paymentMethod.acceptPayment(total)
        receipt.addPayment(payment)
    }
}