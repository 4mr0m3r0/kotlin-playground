package algorithms.greedy

/**
 * AlgoExpert
 */
class ClassPhotos {
    /**
     * Time O(n log n) | O(1)
     */
    fun verification(redShirtHeights: List<Int>, blueShirtHeights: List<Int>): Boolean {
        val redOrder = redShirtHeights.sorted()
        val blueOrder = blueShirtHeights.sorted()
        var differences = 0
        var takePhoto = false
        for ((i, redValue) in redOrder.withIndex()) {
            if (i == 0) {
                if (redValue > blueOrder[i]) differences = 1
                else if (redValue < blueOrder[i]) differences = -1
                continue
            }
            if (redValue > blueOrder[i] && differences == 1) takePhoto = true
            else if (redValue < blueOrder[i] && differences == -1) takePhoto = true
            else return false
        }
        return takePhoto
    }

    /**
     * Time O(n log n) | O(1)
     */
    fun verificationVariantB(redShirtHeights: List<Int>, blueShirtHeights: List<Int>): Boolean {
        val redOrder = redShirtHeights.sortedDescending()
        val blueOrder = blueShirtHeights.sortedDescending()
        val shirtColorInFirstRow = if (redOrder.first() < blueOrder.first()) "RED" else "BLUE"
        repeat(redOrder.size) { i ->
            val redShirtHeight = redShirtHeights[i]
            val blueShirtHeight = blueShirtHeights[i]
            if (shirtColorInFirstRow == "RED") {
                if (redShirtHeight >= blueShirtHeight) return false
            } else {
                if (blueShirtHeight >= redShirtHeight) return false
            }
        }
        return true
    }
}