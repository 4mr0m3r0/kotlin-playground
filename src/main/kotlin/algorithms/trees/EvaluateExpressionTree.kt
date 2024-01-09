package algorithms.trees

class EvaluateExpressionTree {

    /**
     * Big O Notation.
     * Time O(n) | Space O(h), h is the height of the Binary Tree.
     */
    fun evaluateExpressionTree(tree: BinaryTree?): Int {
        val result: Int? = when(tree?.value) {
            -1 -> evaluateExpressionTree(tree.left) + evaluateExpressionTree(tree.right)
            -2 -> evaluateExpressionTree(tree.left) - evaluateExpressionTree(tree.right)
            -3 -> evaluateExpressionTree(tree.left) / evaluateExpressionTree(tree.right)
            -4 -> evaluateExpressionTree(tree.left) * evaluateExpressionTree(tree.right)
            else -> tree?.value
        }
        return result ?: 0
    }

    data class BinaryTree(val value: Int, val left: BinaryTree? = null, val right: BinaryTree? = null)
}