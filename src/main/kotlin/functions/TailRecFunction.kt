package functions

class TailRecFunction {
    tailrec fun factorial(number: Long, accumulator: Long = 1): Long {
        val current = number * accumulator
        return if (number <= 1) {
            current
        } else {
            factorial(number = number - 1, accumulator = current)
        }
    }
}