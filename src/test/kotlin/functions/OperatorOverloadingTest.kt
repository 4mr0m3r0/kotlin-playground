package functions

import kotlin.test.Test
import kotlin.test.assertEquals

class OperatorOverloadingTest {
    private val operationOverloading = OperatorOverloading()

    @Test
    fun `get cats as a string`() {
        val result = operationOverloading.getCats()

        assertEquals(
            expected = "Cheetah Lion Tiger Jaguar",
            actual = result
        )
    }
}