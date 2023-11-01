package algorithms.arrays

import kotlin.test.Test
import kotlin.test.assertEquals

class TournamentWinnerTest {
    private val tournamentWinner = TournamentWinner()

    @Test
    fun `given competitions and results, when tournamentWinner, then return winner`() {
        val competitions = listOf(
            listOf("HTML", "C#"),
            listOf("C#", "Python"),
            listOf("Python", "HTML"),
        )
        val results = listOf(0, 0, 1)

        val actual = tournamentWinner.tournamentWinnerON(competitions, results)

        assertEquals(
            expected = "Python",
            actual = actual
        )
    }

    @Test
    fun `given competitions and results, when tournamentWinnerSecondVariant, then return winner`() {
        val competitions = listOf(
            listOf("HTML", "C#"),
            listOf("C#", "Python"),
            listOf("Python", "HTML"),
        )
        val results = listOf(0, 0, 1)

        val actual = tournamentWinner.tournamentWinnerSecondVariant(competitions, results)

        assertEquals(
            expected = "Python",
            actual = actual
        )
    }
}