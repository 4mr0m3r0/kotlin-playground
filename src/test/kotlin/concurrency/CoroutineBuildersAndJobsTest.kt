package concurrency

import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis
import kotlin.test.Test
import kotlin.test.assertEquals

class CoroutineBuildersAndJobsTest {
    private val coroutineBuildersAndJobs = CoroutineBuildersAndJobs()

    @Test
    fun `builder run blocking`() = runBlocking {
        var results: String
        val timeInMillis = measureTimeMillis {
            results = coroutineBuildersAndJobs.builderRunBlocking()
        }

        println("Time in Millis: $timeInMillis")
        assertEquals(
            expected = "first result A, second result B, third result C",
            actual = results
        )
    }
}