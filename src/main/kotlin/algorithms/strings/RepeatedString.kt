package algorithms.strings

class RepeatedString {
    fun repeatedString(sequence: String, number: Long): Long {
        var occurrences = 0L
        for (character in sequence) {
            if (character == 'a') occurrences++
        }
        val repetition = number / sequence.length
        occurrences *= repetition
        val modulus: Int = (number % sequence.length).toInt()
        repeat(modulus) { i ->
            if (sequence[i] == 'a') occurrences++
        }
        return occurrences
    }
}