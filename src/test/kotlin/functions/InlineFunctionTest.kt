package functions

import kotlin.test.Test
import kotlin.test.assertEquals

class InlineFunctionTest {
    private val inlineFunction = InlineFunction()

    @Test
    fun `given High level, when getCloudGenus, then genus of that level`() {
        val result = inlineFunction.getCloudGenus("High")

        assertEquals(
            expected = listOf("Cirrus", "Cirrocumulus", "Cirrostratus"),
            actual = result
        )
    }

    @Test
    fun `return inside a predicate`() {
        inlineFunction.returnInsidePredicate()
    }
}