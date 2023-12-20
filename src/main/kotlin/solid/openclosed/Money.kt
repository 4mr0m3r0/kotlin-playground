package solid.openclosed

data class Money(val value: Int) {
    companion object {
        val zero = Money(value = 0)
    }
    operator fun plus(other: Money) = Money(value = value + other.value)
}