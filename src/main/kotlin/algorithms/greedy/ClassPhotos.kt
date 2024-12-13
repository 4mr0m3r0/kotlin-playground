package algorithms.greedy

/**
 * AlgoExpert
 */
class ClassPhotos {
    fun verification(redShirtHeights: List<Int>, blueShirtHeights: List<Int>): Boolean {
        // TODO order both arrays.
        val redOrder = redShirtHeights.sorted()
        val blueOrder = blueShirtHeights.sorted()
        // TODO compare red array with blue array and if all elements are lower or greater, then the class photo can be taken.
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
            else {
                takePhoto = false
                break
            }
        }
        // TODO return true | false depending on the result.
        return takePhoto
    }
}