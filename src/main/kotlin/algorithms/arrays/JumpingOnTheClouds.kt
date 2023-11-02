package algorithms.arrays

class JumpingOnTheClouds {
    /**
     * Big O Notation. Time O(n) | Space O(1).
     */
    fun jumpingOnTheCloudsON(c: Array<Int>): Int {
        var i = 0;
        var shortestJumps = 0
        var noJumps = 0
        while (i < c.size - 1) {
            if (i < (c.size - 2) && c[i + 2] == 0) {
                i += 2
                shortestJumps++
            } else if (i < (c.size - 1) && c[i + 1] == 0) {
                i++
                shortestJumps++
            } else {
                i++
                noJumps++
            }
            if (noJumps == 2) {
                break
            }
        }
        return shortestJumps
    }
}