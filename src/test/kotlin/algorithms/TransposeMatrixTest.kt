package algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class TransposeMatrixTest {
    private val transposeMatrix = TransposeMatrix()

    @Test
    fun `O(w times h) transposeMatrix case A`() {
        val input = mutableListOf(
            mutableListOf(1, 2),
        )

        val result = transposeMatrix.transposeMatrixONWH(matrix = input)

        assertEquals(
            expected = mutableListOf(
                mutableListOf(1),
                mutableListOf(2)
            ),
            actual = result
        )
    }

    @Test
    fun `O(w times h) transposeMatrix case B`() {
        val input = mutableListOf(
            mutableListOf(1, 2),
            mutableListOf(3, 4),
            mutableListOf(5, 6),
        )

        val result = transposeMatrix.transposeMatrixONWH(matrix = input)

        assertEquals(
            expected = mutableListOf(
                mutableListOf(1, 3, 5),
                mutableListOf(2, 4, 6)
            ),
            actual = result
        )
    }

    @Test
    fun `O(w times h) transposeMatrix case C`() {
        val input = mutableListOf(
            mutableListOf(1, 2, 3),
            mutableListOf(4, 5, 6),
            mutableListOf(7, 8, 9),
        )

        val result = transposeMatrix.transposeMatrixONWH(matrix = input)

        assertEquals(
            expected = mutableListOf(
                mutableListOf(1, 4, 7),
                mutableListOf(2, 5, 8),
                mutableListOf(3, 6, 9),
            ),
            actual = result
        )
    }

    @Test
    fun `O(w times h) transposeMatrixTraversingColumnFirst case A`() {
        val input = mutableListOf(
            mutableListOf(1, 2),
        )

        val result = transposeMatrix.transposeMatrixTraversingColumnFirst(matrix = input)

        assertEquals(
            expected = mutableListOf(
                mutableListOf(1),
                mutableListOf(2)
            ),
            actual = result
        )
    }

    @Test
    fun `O(w times h) transposeMatrixTraversingColumnFirst case B`() {
        val input = mutableListOf(
            mutableListOf(1, 2),
            mutableListOf(3, 4),
            mutableListOf(5, 6),
        )

        val result = transposeMatrix.transposeMatrixTraversingColumnFirst(matrix = input)

        assertEquals(
            expected = mutableListOf(
                mutableListOf(1, 3, 5),
                mutableListOf(2, 4, 6)
            ),
            actual = result
        )
    }

    @Test
    fun `O(w times h) transposeMatrixTraversingColumnFirst case C`() {
        val input = mutableListOf(
            mutableListOf(1, 2, 3),
            mutableListOf(4, 5, 6),
            mutableListOf(7, 8, 9),
        )

        val result = transposeMatrix.transposeMatrixTraversingColumnFirst(matrix = input)

        assertEquals(
            expected = mutableListOf(
                mutableListOf(1, 4, 7),
                mutableListOf(2, 5, 8),
                mutableListOf(3, 6, 9),
            ),
            actual = result
        )
    }
}