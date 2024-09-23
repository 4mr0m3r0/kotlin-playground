package algorithms.greedy

/**
 * AlgoExpert
 */
class MinimumWaitingTime {

    /**
     * Time O(n)^2
     */
    fun minimumWaitingTime(queries: MutableList<Int>): Int {
        queries.sort()
        var waitingTime = 0
        repeat(queries.size - 1) { i ->
            (0..i).map { j ->
                waitingTime += queries[j]
            }
        }
        return waitingTime
    }

    /**
     * Time O(n log n) | O(1)
     */
}