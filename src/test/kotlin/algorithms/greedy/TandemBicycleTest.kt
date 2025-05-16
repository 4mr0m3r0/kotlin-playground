package algorithms.greedy

import kotlin.test.Test
import kotlin.test.assertEquals

class TandemBicycleTest {

    @Test
    fun `given read and blue speeds, when fastest true, then return 32`() {
        val redShirtSpeeds = mutableListOf(5, 5, 3, 9, 2)
        val blueShirtSpeeds = mutableListOf(3, 6, 7, 2, 1)

        val result = TandemBicycle.calculateTotalSpeed(
            redShirtSpeeds = redShirtSpeeds,
            blueShirtSpeeds = blueShirtSpeeds,
            fastest = true
        )

        assertEquals(
            expected = 32,
            actual = result
        )
    }

    @Test
    fun `given read and blue speeds, when fastest false, then return 25`() {
        val redShirtSpeeds = mutableListOf(5, 5, 3, 9, 2)
        val blueShirtSpeeds = mutableListOf(3, 6, 7, 2, 1)

        val result = TandemBicycle.calculateTotalSpeed(
            redShirtSpeeds = redShirtSpeeds,
            blueShirtSpeeds = blueShirtSpeeds,
            fastest = false
        )

        assertEquals(
            expected = 25,
            actual = result
        )
    }

    @Test
    fun `given read and blue speeds, when fastest false, then return 484`() {
        val redShirtSpeeds = mutableListOf(3, 3, 4, 6, 1, 2, 5, 6, 34, 256, 123, 32)
        val blueShirtSpeeds = mutableListOf(1, 2, 1, 9, 12, 3, 1, 54, 21, 231, 32, 1)

        val result = TandemBicycle.calculateTotalSpeed(
            redShirtSpeeds = redShirtSpeeds,
            blueShirtSpeeds = blueShirtSpeeds,
            fastest = false
        )

        assertEquals(
            expected = 484,
            actual = result
        )
    }


}