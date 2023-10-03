package basics

import kotlin.math.exp
import kotlin.test.Test
import kotlin.test.assertEquals

class Enums {
    @Test
    fun `getting attributes using valueOf()`() {
        val tigerSubspecies = PantheraSubspecies.valueOf("TIGER")
        val expected = arrayOf("Panthera tigris tigris", "Sunda Island tiger")

        tigerSubspecies.subspecies.zip(expected).forEach {
            assertEquals(
                expected = it.second,
                actual = it.first
            )
        }
    }
}