package algorithms.arrays

class LeftRotation {
    /**
     * Big O Notation.
     * Time O(n) | Space O(n).
     */
    fun rotLeft(array: Array<Int>, rotation: Int): Array<Int> {
        val rotatedArray = Array(array.size) { 0 }
        repeat(array.size) { i ->
            val posWithRotation = i - rotation
            if (posWithRotation < 0) {
                val posInArray = array.size + posWithRotation
                rotatedArray[posInArray] = array[i]
            } else {
                rotatedArray[posWithRotation] = array[i]
            }
        }
        return rotatedArray
    }
}