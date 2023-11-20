package algorithms.strings

import kotlin.test.Test
import kotlin.test.assertEquals

class RepeatedStringTest {
    private val repeatedString = RepeatedString()

    @Test
    fun `given sequence 'a', when number 1000000000000, then 1000000000000 occurrences`() {
        val result = repeatedString.repeatedString(
            sequence = "a",
            number = 1000000000000
        )

        assertEquals(
            expected = 1000000000000,
            actual = result
        )
    }

    @Test
    fun `given sequence 'aba', when number 10, then 7 occurrences`() {
        val result = repeatedString.repeatedString(
            sequence = "aba",
            number = 10
        )

        assertEquals(
            expected = 7,
            actual = result
        )
    }

    @Test
    fun `given sequence 'abcac', when number 10, then 4 occurrences`() {
        val result = repeatedString.repeatedString(
            sequence = "abcac",
            number = 10
        )

        assertEquals(
            expected = 4,
            actual = result
        )
    }

    @Test
    fun `given sequence 'beeaabc', when number 711560125001, then 203302892858 occurrences`() {
        val result = repeatedString.repeatedString(
            sequence = "beeaabc",
            number = 711560125001
        )

        assertEquals(
            expected = 203302892858,
            actual = result
        )
    }

    @Test
    fun `given sequence 'gfcaaaecbg', when number 547602, then 164280 occurrences`() {
        val result = repeatedString.repeatedString(
            sequence = "gfcaaaecbg",
            number = 547602
        )

        assertEquals(
            expected = 164280,
            actual = result
        )
    }
}