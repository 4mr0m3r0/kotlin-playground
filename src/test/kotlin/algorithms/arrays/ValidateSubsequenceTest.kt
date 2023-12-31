package algorithms.arrays

import kotlin.test.Test
import kotlin.test.assertEquals

class ValidateSubsequenceTest {
    private val validateSubsequence = ValidateSubsequence()

    @Test
    fun `isValidSubsequence_O(N)_A`() {
        val result = validateSubsequence.isValidSubsequenceOnSecondVariant(
            array = listOf(5, 1, 22, 25, 6, -1, 8, 10),
            sequence = listOf(1, 6, -1, 10)
        )

        assertEquals(
            expected = true,
            actual = result
        )
    }

    @Test
    fun `isValidSubsequence_O(N)_B`() {
        val result = validateSubsequence.isValidSubsequenceOnSecondVariant(
            array = listOf(1, 1, 6, 1),
            sequence = listOf(1, 1, 1, 6)
        )

        assertEquals(
            expected = false,
            actual = result
        )
    }

    @Test
    fun `isValidSubsequence_O(N)_C`() {
        val result = validateSubsequence.isValidSubsequenceOnSecondVariant(
            array = listOf(5, 1, 22, 25, 6, -1, 8, 10),
            sequence = listOf(1, 6, -1, 10, 11, 11, 11, 11)
        )

        assertEquals(
            expected = false,
            actual = result
        )
    }

    @Test
    fun `isValidSubsequence_O(N)_D`() {
        val result = validateSubsequence.isValidSubsequenceOnSecondVariant(
            array = listOf(5, 1, 22, 25, 6, -1, 8, 10),
            sequence = listOf(5, 1, 22, 25, 6, -1, 8, 10, 10)
        )

        assertEquals(
            expected = false,
            actual = result
        )
    }

    @Test
    fun `isValidSubsequence_O(N)_E`() {
        val result = validateSubsequence.isValidSubsequenceOnSecondVariant(
            array = listOf(5, 1, 22, 25, 6, -1, 8, 10, 32, 45),
            sequence = listOf(1, 6, -1, 10)
        )

        assertEquals(
            expected = true,
            actual = result
        )
    }

    @Test
    fun `isValidSubsequence_O(N)_F`() {
        val result = validateSubsequence.isValidSubsequenceOnSecondVariant(
            array = listOf(5, 1, 22, 25, 6, -1, 8, 10, 32, 45),
            sequence = listOf(6)
        )

        assertEquals(
            expected = true,
            actual = result
        )
    }
}