package solid.openclosed

interface PaymentMethod {
    fun acceptPayment(total: Money): Payment
}