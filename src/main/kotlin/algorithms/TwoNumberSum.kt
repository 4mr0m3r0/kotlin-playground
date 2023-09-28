package algorithms

class TwoNumberSum {
    /**
     * Big O Notation. Time O(n^2) | Space O(1)
     */
    fun twoNumberSumON2(array: ArrayList<Int>, targetSum: Int): Array<Int> {
        repeat(array.size) { i ->
            val first = array[i]
            for (j in i + 1..array.size - 1) {
                val second = array[j]
                if (first + second == targetSum) {
                    return arrayOf(first, second)
                }
            }
        }
        return emptyArray()
    }

    /**
     * Big O Notation. Time O(n) | Space O(n)
     */
    fun twoNumberSumON(array: ArrayList<Int>, targetSum: Int): Array<Int> {
        val traversedNumbers = hashMapOf<Int, Int>()
        repeat(array.size) {
            val x = array[it]
            val y = targetSum - x
            if (traversedNumbers.containsKey(y)) {
                return arrayOf(y, x)
            } else {
                traversedNumbers[x] = y
            }
        }
        return emptyArray()
    }

    /**
     * Big O Notation. Time O(n log n) | Space O(1)
     */
    fun twoNumberSumONlogN(array: ArrayList<Int>, targetSum: Int): Array<Int> {
        array.sort()
        var left = 0
        var right = array.size - 1
        while (array[left] + array[right] != targetSum && left != right) {
            if (array[left] + array[right] > targetSum) {
                right--
            } else {
                left++
            }
        }
        return if (left == right) emptyArray() else arrayOf(array[right], array[left])
    }
}
