package algorithms.trees

class BranchSums {
    /**
     * Big O Notation.
     * Time O(n) | Space O(n).
     */
    fun branchSums(root: BinaryTree): List<Int> {
        val branchSums = mutableListOf<Int>()
        return addBranchSumsToList(
            branchSums = branchSums,
            root = root,
            sum = 0
        )
    }

    private fun addBranchSumsToList(branchSums: MutableList<Int>, root: BinaryTree?, sum: Int): List<Int> {
        if (root == null) {
            return branchSums
        }
        val newSum = root.value + sum
        if (root.left == null && root.right == null) {
            branchSums.add(newSum)
        } else {
            if (root.left != null) addBranchSumsToList(branchSums, root.left, newSum)
            if (root.right != null) addBranchSumsToList(branchSums, root.right, newSum)
        }
        return branchSums
    }
}

data class BinaryTree(val value: Int, val left: BinaryTree? = null, val right: BinaryTree? = null)

//    open class BinaryTree(value: Int) {
//        var value = value
//        var left: BinaryTree? = null
//        var right: BinaryTree? = null
//    }