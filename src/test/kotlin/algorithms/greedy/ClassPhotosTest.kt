package algorithms.greedy

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ClassPhotosTest {
    private val classPhotos = ClassPhotos()

    @Test
    fun `given red less high than blue, when verification photo, then true`() {
        val red = listOf(5, 8, 1, 2, 4)
        val blue = listOf(6, 9, 2, 4, 5)

        val result = classPhotos.verification(
            redShirtHeights = red,
            blueShirtHeights = blue
        )

        assertTrue(result)
    }

    @Test
    fun `given red same high as blue, when verification photo, then false`() {
        val red = listOf(5, 8, 1, 2, 4)
        val blue = listOf(9, 5, 2, 4, 5)

        val result = classPhotos.verification(
            redShirtHeights = red,
            blueShirtHeights = blue
        )

        assertFalse(result)
    }

    @Test
    fun `given red less high than blue, when verificationVariantB photo, then true`() {
        val red = listOf(5, 8, 1, 2, 4)
        val blue = listOf(6, 9, 2, 4, 5)

        val result = classPhotos.verificationVariantB(
            redShirtHeights = red,
            blueShirtHeights = blue
        )

        assertTrue(result)
    }

    @Test
    fun `given red same high as blue, when verificationVariantB photo, then false`() {
        val red = listOf(5, 8, 1, 2, 4)
        val blue = listOf(9, 5, 2, 4, 5)

        val result = classPhotos.verificationVariantB(
            redShirtHeights = red,
            blueShirtHeights = blue
        )

        assertFalse(result)
    }
}