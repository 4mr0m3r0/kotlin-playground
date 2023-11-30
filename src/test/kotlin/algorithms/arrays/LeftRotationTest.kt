package algorithms.arrays

import kotlin.test.Test
import kotlin.test.assertContentEquals

class LeftRotationTest {
    private val leftRotation = LeftRotation()

    @Test
    fun `given 4 rotations, when rotLeft, then expected array`() {
        val result = leftRotation.rotLeft(
            array = arrayOf(1, 2, 3, 4, 5),
            rotation = 4
        )

        assertContentEquals(
            expected = arrayOf(5, 1, 2, 3, 4),
            actual = result
        )
    }

    @Test
    fun `given 10 rotations, when rotLeft, then expected array`() {
        val result = leftRotation.rotLeft(
            array = arrayOf(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51),
            rotation = 10
        )

        assertContentEquals(
            expected = arrayOf(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77),
            actual = result
        )
    }

    @Test
    fun `given 13 rotations, when rotLeft, then expected array`() {
        val result = leftRotation.rotLeft(
            array = arrayOf(33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97),
            rotation = 13
        )

        assertContentEquals(
            expected = arrayOf(87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60),
            actual = result
        )
    }

}