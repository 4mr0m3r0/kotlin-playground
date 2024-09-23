package algorithms.arrays

/**
 * AlgoExpert
 */
class SortedSquaredArray {

    /**
     * Big O Notation. Time O(n log n) | Space O(n).
     * It is O(n log n) because the sort() method is O(n log n).
     */
    fun sortedSquaredArrayONLogN(array: List<Int>) : List<Int> {
        val squared = mutableListOf<Int>()
        for (element in array) {
            squared.add(element * element)
        }
        squared.sort()
        return squared
    }

    /**
     * Big O Notation. Time O(n) | Space O(n).
     * It is O(n) because of the iteration over squared array with 0 values.
     */
    fun sortedSquaredArrayON(array: List<Int>) : List<Int> {
        val squared = Array(array.size) { 0 }
        var i = 0
        var j = array.size - 1
        for (k in squared.size - 1 downTo 0) {
            val left = array[i] * array[i]
            val right = array[j] * array[j]
            if (left > right) {
                squared[k] = left
                i++
            } else {
                squared[k] = right
                j--
            }
        }
        return squared.toList()
    }
}