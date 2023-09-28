package algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class SortedSquaredArrayTest {
    private val sortedSquaredArray = SortedSquaredArray()

    @Test
    fun `sortedSquaredArray_O(N log N)_A`() {
        val result = sortedSquaredArray.sortedSquaredArrayON(
            array = arrayListOf(1, 2, 3, 5, 6, 8, 9)
        )

        assertEquals(
            expected = arrayListOf(1, 4, 9, 25, 36, 64, 81),
            actual = result
        )
    }

    @Test
    fun `sortedSquaredArray_O(N log N)_B`() {
        val result = sortedSquaredArray.sortedSquaredArrayON(
            array = arrayListOf(-2, -1)
        )

        assertEquals(
            expected = arrayListOf(1, 4),
            actual = result
        )
    }

    @Test
    fun `sortedSquaredArray_O(N log N)_C`() {
        val result = sortedSquaredArray.sortedSquaredArrayON(
            array = arrayListOf(-5, -4, -3, -2, -1)
        )

        assertEquals(
            expected = arrayListOf(1, 4, 9, 16, 25),
            actual = result
        )
    }

    @Test
    fun `sortedSquaredArray_O(N log N)_D`() {
        val result = sortedSquaredArray.sortedSquaredArrayON(
            array = arrayListOf(-10, -5, 0, 5, 10)
        )

        assertEquals(
            expected = arrayListOf(0, 25, 25, 100, 100),
            actual = result
        )
    }

    @Test
    fun `sortedSquaredArray_O(N log N)_E`() {
        val result = sortedSquaredArray.sortedSquaredArrayON(
            array = arrayListOf(-7, -3, 1, 9, 22, 30)
        )

        assertEquals(
            expected = arrayListOf(1, 9, 49, 81, 484, 900),
            actual = result
        )
    }

    @Test
    fun `sortedSquaredArray_O(N log N)_F`() {
        val result = sortedSquaredArray.sortedSquaredArrayON(
            array = arrayListOf(-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20)
        )

        assertEquals(
            expected = arrayListOf(0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500),
            actual = result
        )
    }

    @Test
    fun `sortedSquaredArray_O(N log N)_G`() {
        val result = sortedSquaredArray.sortedSquaredArrayON(
            array = arrayListOf(-3, -2, -1)
        )

        assertEquals(
            expected = arrayListOf(1, 4, 9),
            actual = result
        )
    }
}