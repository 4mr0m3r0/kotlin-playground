package classes

import classes.DataObjects.Cat.Cheetah
import classes.DataObjects.Cat.Lion
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class DataObjectsTest {
    private val dataObjects = DataObjects()

    @Test
    fun `given data object Lion, when toString(), then equals Lion`() {
        val lion = Lion

        assertEquals(
            expected = "Lion",
            actual = lion.toString()
        )
    }

    @Test
    fun `given object Cheetah, when toString(), then NOT equals to Cheetah`() {
        val cheetah = Cheetah

        assertNotEquals(
            illegal = "Cheetah",
            actual = cheetah.toString()
        )
    }
}