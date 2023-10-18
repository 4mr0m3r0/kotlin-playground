package algorithms

import kotlin.test.Test
import kotlin.test.assertEquals

class CountingValleysTest {
    private val countingValleys = CountingValleys()

    @Test
    fun `case 1 - given steps and path, when countingValleys, then valleys`() {
        val path = "DDUUUUDD"
        val steps = 8

        val result = countingValleys.countingValleys(steps = steps, path = path)

        assertEquals(
            expected = 1,
            actual = result
        )
    }

    @Test
    fun `case 2 - given steps and path, when countingValleys, then valleys`() {
        val path = "UDDDUDUU"
        val steps = 8

        val result = countingValleys.countingValleys(steps = steps, path = path)

        assertEquals(
            expected = 1,
            actual = result
        )
    }

    @Test
    fun `case 3 - given steps and path, when countingValleys, then valleys`() {
        val path = "UUUUDDUUDDDUDDDDUU"
        val steps = 18

        val result = countingValleys.countingValleys(steps = steps, path = path)

        assertEquals(
            expected = 1,
            actual = result
        )
    }
}