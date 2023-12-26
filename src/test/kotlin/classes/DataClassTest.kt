package classes

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

    /**
     * Properties that aren't declared in the primary constructor don't take part
     * in the equality checks and hash code calculation.
     */
    @Test
    fun `given different values outside constructor, when equals, then objects still are equal`() {
        val lenticular = DataCloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )
        lenticular.anotherParamOutsideConstructor = "AnyValue"
        val lenticularReplica = DataCloud(
            level = "Very high-level",
            physicalForm = "Stratocumuliform",
            variety = "Lenticular"
        )
        lenticularReplica.anotherParamOutsideConstructor = "A Different Value"

        println("First Object: $lenticular")
        println("Second Object: $lenticularReplica")
        println("First Object hasCode: ${lenticular.hashCode()}")
        println("Second Object hasCode: ${lenticularReplica.hashCode()}")
        assertEquals(
            expected = true,
            actual = lenticular == lenticularReplica
        )
    }
}