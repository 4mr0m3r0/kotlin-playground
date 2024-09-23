package algorithms.greedy

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumWaitingTimeTest {
    private val minimumWaitingTime = MinimumWaitingTime()

    @Test
    fun `given queries, when method, then return minimum waiting time`() {
        val queries = mutableListOf(3, 2, 1, 2, 6)

        val result = minimumWaitingTime.minimumWaitingTime(queries)

        assertEquals(
            expected = 17,
            actual = result
        )
    }
}