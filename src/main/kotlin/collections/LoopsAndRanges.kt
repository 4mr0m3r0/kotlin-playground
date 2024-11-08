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
     * For Loop
     */
    fun loops(anyList: List<String>) {
        // traverse `for` loop through indices
        for (i in anyList.indices) {
            val element = anyList[i]
        }

        // Starting from a given index until end
        for (i in 2 until anyList.size) {
            println("Element > ${anyList[i]}")
        }

        // index and value
        for ((index, element) in anyList.withIndex()) {
            println("$index: $element")
        }
    }

    /**
     * Repeat loop
     */
    fun repeatLoop(anyList: List<String>) {
        // Repeat
        repeat(anyList.size) { i ->
            println("Position $i")
        }
    }

    /**
     * Loops with labels
     */
    fun nestedLoopsWithLabel() {
        var outerCondition = 0
        outer@ while (outerCondition < 15) {
            var innerCondition = 0
            while (innerCondition < 13) {
                if (innerCondition == 5) break
                if (innerCondition == 3) continue
                if (innerCondition > 10) break@outer
                if (innerCondition == 10) continue@outer
                innerCondition++
            }
            outerCondition++
        }
    }
}