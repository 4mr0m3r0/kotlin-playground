package classes

import kotlin.math.exp
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class DataClassTest {

    @Test
    fun `given same objects of normal class, when equals, then false`() {
        val lenticular = Cloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )
        val lenticularReplica = Cloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )

        assertEquals(
            expected = false,
            actual = lenticular == lenticularReplica
        )
    }

    @Test
    fun `given same objects of data class, when equals, then true`() {
        val cumulusCongestus = DataCloud(
            level = "Towering vertical",
            physicalForm = "Cumuliform",
            variety = "Cumulus congestus"
        )

        val cumulusCongestusReplica = DataCloud(
            level = "Towering vertical",
            physicalForm = "Cumuliform",
            variety = "Cumulus congestus"
        )

        assertEquals(
            expected = true,
            actual = cumulusCongestus == cumulusCongestusReplica
        )
    }

    @Test
    fun `print data class object using toString()`() {
        val lenticular = DataCloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )

        assertEquals(
            expected = "DataCloud(level=Very high-level, physicalForm=Stratocumuliform, variety=Lenticular)",
            actual = lenticular.toString()
        )
    }

    @Test
    fun `comparing data class object, not content`() {
        val lenticular = DataCloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )

        val lenticularReplica = DataCloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )

        assertFalse(lenticular === lenticularReplica)
    }

    @Test
    fun `destructuring data class`() {
        val lenticular = DataCloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )

        val (level, form, variety) = lenticular

        assertEquals(
            expected = lenticular.level,
            actual = level
        )
        assertEquals(
            expected = lenticular.physicalForm,
            actual = form
        )
        assertEquals(
            expected = lenticular.variety,
            actual = variety
        )
    }

    @Test
    fun `destructuring data class, using two variables`() {
        val lenticular = DataCloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )

        val (_, form, variety) = lenticular

        assertEquals(
            expected = lenticular.physicalForm,
            actual = form
        )
        assertEquals(
            expected = lenticular.variety,
            actual = variety
        )
    }

    @Test
    fun `destructuring data class, using only first variable`() {
        val lenticular = DataCloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )

        val (level) = lenticular

        assertEquals(
            expected = lenticular.level,
            actual = level
        )
    }
}