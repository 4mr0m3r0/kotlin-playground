package collections

class LoopsAndRanges {
    /**
     * Ranges
     */
    fun ranges() {
        val range = (0..10)
        range.map { "Item $it" }

        // Progression step 2
        val rangeStep = (0..10 step 2)

        // Inversion
        val down = (10 downTo 0)

        // Equivalent to size - 1
        val rangeUntil = (0 until 10)

        // Range with letters. This progression works for chars, integers, and longs
        val rangeLetter = ('a'..'f')

        // Range with float. This is not a progression
        val rangeFloat = (1.0..2.0)
        val isFloatInRange = 1.5 in rangeFloat //This should return true
    }

    /**
     * Loops
     */
    fun loops(anyList: List<String>) {
        // traverse `for` loop through indices
        for (i in anyList.indices) {
            val element = anyList[i]
        }
    }
}