package algorithms.greedy

import kotlin.math.max

/**
 * AlgoExpert exercises
 */
object TandemBicycle {
    fun calculateTotalSpeed(redShirtSpeeds: MutableList<Int>, blueShirtSpeeds: MutableList<Int>, fastest: Boolean): Int {
        if (fastest) redShirtSpeeds.sortDescending() else redShirtSpeeds.sort()
        blueShirtSpeeds.sort()
        var totalSpeed = 0
        repeat(redShirtSpeeds.size) { i ->
            totalSpeed += max(redShirtSpeeds[i], blueShirtSpeeds[i])
        }
        return totalSpeed
    }
}
