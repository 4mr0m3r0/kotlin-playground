package algorithms.ordering

import kotlin.test.Test
import kotlin.test.assertEquals

class InsertionSortTest {
    private val insertionSort = InsertionSort()

    @Test
    fun `given not sorted values, when algorithm run, then get sorted values`() {
        val array = arrayListOf(5, 2, 4, 6, 1, 3)

        val result = insertionSort.sort(array)
        println("result > $result")

        assertEquals(
            expected = arrayListOf(1, 2, 3, 4, 5, 6),
            actual = result
        )
    }
}