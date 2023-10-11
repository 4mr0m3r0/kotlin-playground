package collections

import kotlin.test.Test

class SequencesTest {
    private val sequences = Sequences()

    @Test
    fun `even numbers sequence`() {
        val evenNumbers = sequences.generatingEvenSequence()
        for (even in evenNumbers) {
            print("$even ")
        }
    }

    @Test
    fun `sequence of anything`() {
        val anything = sequences.sequencesOfAnything()
        for (any in anything) {
            print("$any ")
        }
    }
}