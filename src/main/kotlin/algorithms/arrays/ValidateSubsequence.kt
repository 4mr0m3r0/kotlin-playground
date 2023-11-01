package algorithms.arrays

class ValidateSubsequence {
    /**
     * Big O Notation. Time O(n) | Space O(1)
     */
    fun isValidSubsequenceON(array: List<Int>, sequence: List<Int>): Boolean {
        var valid = false
        var j = 0
        repeat(sequence.size) { i ->
            if (j >= array.size) return false
            while (j < array.size) {
                if (sequence[i] == array[j]) {
                    valid = true
                    j++
                    break
                } else {
                    valid = false
                    j++
                }
            }
        }
        return valid
    }

    /**
     * Big O Notation. Time O(n) | Space O(1)
     */
    fun isValidSubsequenceOnSecondVariant(array: List<Int>, sequence: List<Int>): Boolean {
        var j = 0
        for(element in array) {
            if (element == sequence[j]) {
                if (j == sequence.size - 1) return true else j++
            }
        }
        return false
    }

    /**
     * Big O Notation. Time O(n) | Space O(1)
     */
    fun isValidSubsequenceOnThirdVariant(array: List<Int>, sequence: List<Int>): Boolean {
        var i = 0
        var j = 0
        while (i < array.size && j < sequence.size) {
            if (array[i] == sequence[j]) j++
            i++
        }
        return j == sequence.size
    }
}