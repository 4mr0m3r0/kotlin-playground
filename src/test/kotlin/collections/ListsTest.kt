package collections

import collections.Lists
import kotlin.test.Test
import kotlin.test.assertEquals

class ListsTest {
    private val lists = Lists()

    @Test
    fun `creating list with default values`() {
        assertEquals(
            expected = listOf("A", "B", "C", "D"),
            actual = lists.defaultList
        )
    }

    @Test
    fun `creating empty list`() {
        assertEquals(
            expected = emptyList(),
            actual = lists.emptyListOfStrings
        )
    }

    @Test
    fun `creating new List with values of another List`() {
        assertEquals(
            expected = listOf("A", "B", "C", "D", "E", "F", "G", "H"),
            actual = lists.newListWithValuesOfAnotherList
        )
    }

    @Test
    fun `filtering with 'filter' that it not contains element E`() {
        assertEquals(
            expected = listOf("A", "B", "C", "D", "F", "G", "H"),
            actual = lists.filtering
        )
    }

    @Test
    fun `filtering with 'filterNot' that it not contains element E`() {
        assertEquals(
            expected = listOf("A", "B", "C", "D", "F", "G", "H"),
            actual = lists.filteringNot
        )
    }

    @Test
    fun `mapping a list of pairs to get only first element`() {
        assertEquals(
            expected = listOf("Snow leopard", "Lion", "Tiger", "Leopard", "Jaguar"),
            actual = lists.mapping
        )
    }

    @Test
    fun `sorting a list of pairs ordered by species`() {
        assertEquals(
            expected = listOf("Jaguar", "Leopard", "Lion", "Snow leopard", "Tiger"),
            actual = lists.sortedBySpeciesBy
        )
    }
}