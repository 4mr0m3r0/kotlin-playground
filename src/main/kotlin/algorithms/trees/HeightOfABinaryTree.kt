package algorithms.trees

class HeightOfABinaryTree {
    /**
     * Big O Notation.
     * Time O(n) | Space O(n).
     */
    fun height(tree: BinaryTree): Int {
        return calculateHeight(tree = tree, height = 0, depth = 0)
    }

    private fun calculateHeight(tree: BinaryTree?, height: Int, depth: Int): Int {
        if (tree == null) return depth
        var heightSum = height
        if (tree.left != null) heightSum = calculateHeight(tree = tree.left, height = heightSum, depth = depth + 1)
        if (tree.right != null) heightSum = calculateHeight(tree = tree.right, height = heightSum, depth = depth + 1)
        return if (depth > heightSum) depth else heightSum
    }

    data class BinaryTree(val value: Int, val left: BinaryTree? = null, val right: BinaryTree? = null)
}