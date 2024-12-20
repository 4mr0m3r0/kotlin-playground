package algorithms.ordering

/**
 * Introduction to Algorithms
 */
class MergeSort {

    fun merge(array: Array<Int>, startPos: Int, middlePos: Int, endPos: Int): Array<Int> {
        val nl = middlePos - startPos + 1
        val nr = endPos - middlePos
        val left = Array(nl) { 0 }
        val right = Array(nr) { 0 }
        repeat(nl) { i ->
            left[i] = array[startPos + i]
        }
        repeat(nr) { j ->
            right[j] = array[middlePos + j + 1]
        }
        var i = 0
        var j = 0
        var k = startPos
        while (i < nl && j < nr) {
            if (left[i] <= right[j]) {
                array[k] = left[i]
                i++
            } else {
                array[k] = right[j]
                j++
            }
            k++
        }
        while (i < nl) {
            array[k] = left[i]
            i++
            k++
        }
        while (j < nr) {
            array[k] = right[j]
            j++
            k++
        }
        return array
    }

    fun mergeSort(array: Array<Int>, startPos: Int, endPos: Int): Array<Int> {
        if (startPos >= endPos) return array
        val middlePos = (startPos + endPos) / 2
        mergeSort(array = array, startPos = startPos, endPos = middlePos)
        mergeSort(array = array, startPos = middlePos + 1, endPos = endPos)
        return merge(array, startPos, middlePos, endPos)
    }
}