package flows

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class FlowsTest {
    private val flows = Flows()

    @Test
    fun `collecting with transform function`() = runBlocking {
        flows.functionTransform().collect(::println)
    }

    @Test
    fun `collecting with zip`() = runBlocking {
        flows.usingZip().collect(::println)
    }

    @Test
    fun `collecting with combine`() = runBlocking {
        flows.usingCombine().collect(::println)
    }

    @Test
    fun `collecting with combine and delay`() = runBlocking {
        flows.usingCombineWithDelay().collect(::println)
    }
}