package algorithms.arrays

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoNumberSumTest {
    private val twoNumberSum = TwoNumberSum()

    @Test
    fun `twoNumberSum_O(N^2)`() {
        val numbers = arrayListOf(3, 5, -4, 8, 11, 1, -1, 6)
        val targetSum = 10

        val result = twoNumberSum.twoNumberSumON2(array = numbers, targetSum = targetSum)

        assertContentEquals(
            expected = arrayOf(11, -1),
            actual = result
        )
    }

    @Test
    fun `twoNumberSum_O(N)`() {
        val numbers = arrayListOf(3, 5, -4, 8, 11, 1, -1, 6)
        val targetSum = 10
        val result = twoNumberSum.twoNumberSumON(array = numbers, targetSum = targetSum)

        assertContentEquals(
            expected = arrayOf(11, -1),
            actual = result
        )
    }

    @Test
    fun `twoNumberSum_O(N log N)`() {
        val numbers = arrayListOf(3, 5, -4, 8, 11, 1, -1, 6)
        val targetSum = 10
        val result = twoNumberSum.twoNumberSumONlogN(array = numbers, targetSum = targetSum)

        assertContentEquals(
            expected = arrayOf(11, -1),
            actual = result
        )
    }
}