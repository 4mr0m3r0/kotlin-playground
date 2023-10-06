package basics

import kotlin.test.Test
import kotlin.test.assertEquals

class ScopeFunctionsTest {
    private val scopeFunctions = ScopeFunctions()

    @Test
    fun `scope function 'with'`() {
        assertEquals(
            expected = "Hello World",
            actual = scopeFunctions.usingWith()
        )
    }

    @Test
    fun `scope function 'run'`() {
        assertEquals(
            expected = "Hello World",
            actual = scopeFunctions.usingRun()
        )
    }

    @Test
    fun `scope function 'apply'`() {
        assertEquals(
            expected = "Hello World",
            actual = scopeFunctions.usingApply()
        )
    }
}