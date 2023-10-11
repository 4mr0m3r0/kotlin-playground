package algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class NonConstructibleChangeTest {
    private val nonConstructibleChange = NonConstructibleChange()

    @Test
    fun `O(n log n) non constructible change case A`() {
        val coins = mutableListOf(1, 2, 5)

        val result = nonConstructibleChange.nonConstructibleChangeONLogN(coins)

        assertEquals(
            expected = 4,
            actual = result
        )
    }

    @Test
    fun `O(n log n) non constructible change case B`() {
        val coins = mutableListOf(1, 1, 3)

        val result = nonConstructibleChange.nonConstructibleChangeONLogN(coins)

        assertEquals(
            expected = 6,
            actual = result
        )
    }

    @Test
    fun `O(n log n) non constructible change case C`() {
        val coins = mutableListOf(5, 7, 1, 1, 2, 3, 22)

        val result = nonConstructibleChange.nonConstructibleChangeONLogN(coins)

        assertEquals(
            expected = 20,
            actual = result
        )
    }

    @Test
    fun `O(n log n) non constructible change case D`() {
        val coins = mutableListOf(1, 1, 1, 1, 1)

        val result = nonConstructibleChange.nonConstructibleChangeONLogN(coins)

        assertEquals(
            expected = 6,
            actual = result
        )
    }

    @Test
    fun `O(n log n) non constructible change case E`() {
        val coins = mutableListOf<Int>()

        val result = nonConstructibleChange.nonConstructibleChangeONLogN(coins)

        assertEquals(
            expected = 1,
            actual = result
        )
    }

    @Test
    fun `O(n log n) non constructible change case F`() {
        val coins = mutableListOf(5, 6, 1, 1, 2, 3, 4, 9)

        val result = nonConstructibleChange.nonConstructibleChangeONLogN(coins)

        assertEquals(
            expected = 32,
            actual = result
        )
    }
}