package algorithms

class ValidateSubsequence {
    /**
     * Big O Notation. Time O(N) | Space O(1)
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
}