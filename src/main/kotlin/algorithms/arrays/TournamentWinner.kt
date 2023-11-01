package algorithms.arrays

import kotlin.math.abs

class TournamentWinner {
    /**
     * Big O Notation. Time O(n) | Space O(k).
     */
    fun tournamentWinnerON(competitions: List<List<String>>, results: List<Int>): String {
        val topWinners = hashMapOf<String, Int>()
        repeat(competitions.size) { i ->
            if (results[i] == 0) {
                val team = competitions[i].last()
                val points = topWinners[team] ?: 0
                topWinners[team] = points + 3
            } else {
                val team = competitions[i].first()
                val points = topWinners[team] ?: 0
                topWinners[team] = points + 3
            }
        }
        var winner = ""
        var topScore = 0
        topWinners.forEach { (key, value) ->
            if (value > topScore) {
                winner = key
                topScore = value
            }
        }
        return winner
    }

    /**
     * Big O Notation. Time O(n) | Space O(k).
     */
    fun tournamentWinnerSecondVariant(competitions: List<List<String>>, results: List<Int>): String {
        val topWinners = hashMapOf<String, Int>()
        var winner = ""
        var topScore = 0
        repeat(competitions.size) { i ->
            val team = competitions[i][abs(results[i] - 1)]
            val points = (topWinners[team] ?: 0) + 3
            topWinners[team] = points
            if (points > topScore) {
                topScore = points
                winner = team
            }
        }
        return winner
    }
}
