package algorithms.strings

/**
 * HackerRank
 */
class CountingValleys {
    /**
     * Big O Notation. Time O(n) | Space O(1).
     */
    fun countingValleys(steps: Int, path: String): Int {
        var valleys = 0
        var seaLevel = 0
        var insideAValley = false
        repeat(path.length) { position ->
            if (path[position].equals('D', ignoreCase = true)) seaLevel--
            else if (path[position].equals('U', ignoreCase = true)) seaLevel++
            if (seaLevel < 0) insideAValley = true
            else if (seaLevel == 0 && insideAValley) {
                insideAValley = false
                valleys++
            }
        }
        return valleys
    }
}