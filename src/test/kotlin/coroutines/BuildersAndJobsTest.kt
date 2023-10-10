package coroutines

import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis
import kotlin.test.Test
import kotlin.test.assertEquals

class BuildersAndJobsTest {
    private val buildersAndJobs = BuildersAndJobs()

    @Test
    fun `builder run blocking`() = runBlocking {
        var results: String
        val timeInMillis = measureTimeMillis {
            results = buildersAndJobs.builderRunBlocking()
        }

        println("Time in Millis: $timeInMillis")
        assertEquals(
            expected = "first result A, second result B, third result C",
            actual = results
        )
    }
}