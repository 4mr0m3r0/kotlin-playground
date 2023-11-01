package algorithms.arrays

class NonConstructibleChange {
    /**
     * Big O Notation. Time O(n log n) | Space O(1).
     * It is O(n log n) because of the sort() function.
     */
    fun nonConstructibleChangeONLogN(coins: MutableList<Int>): Int {
        coins.sort()
        var amountChange = 0
        for (coin in coins) {
            if (amountChange + 1 < coin) {
                return amountChange + 1
            }
            amountChange += coin
        }
        return amountChange + 1
    }
}