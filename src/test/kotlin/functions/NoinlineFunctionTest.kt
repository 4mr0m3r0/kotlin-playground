package functions

import kotlin.test.Test
import kotlin.test.assertEquals

class NoinlineFunctionTest {
    private val noinlineFunction = NoinlineFunction()

    @Test
    fun `given High level, when getCloudGenus, then genus of that level`() {
        val result = noinlineFunction.getCloudGenus("Low")

        assertEquals(
            expected = listOf("Stratocumulus", "Stratus"),
            actual = result
        )
    }
}