package algorithms.ordering

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MergeSortTest {
    private val mergeSort = MergeSort()

    @Test
    fun `given array, when merge, then order`() {
        val array = arrayOf(2, 4, 6, 7, 1, 2, 3, 5)

        val result = mergeSort.merge(
            array = array,
            startPos = 0,
            middlePos = 3,
            endPos = 7
        )

        assertContentEquals(
            expected = arrayOf(1, 2, 2, 3, 4, 5, 6, 7),
            actual = result
        )
    }

    @Test
    fun `given array, when mergeSort, then order`() {
        val array = arrayOf(12, 3, 7, 9, 14, 6, 11, 2, 4)

        val result = mergeSort.mergeSort(
            array = array,
            startPos = 0,
            endPos = 8
        )

        assertContentEquals(
            expected = arrayOf(2, 3, 4, 6, 7, 9, 11, 12, 14),
            actual = result
        )
    }

}