package algorithms.trees

/**
 * HackerRank
 */
class PreorderTraversal {
    fun preOrder(tree: BinaryTree): ArrayList<Int> {
        val preorder = arrayListOf<Int>()
        readPreOrder(tree, preorder)
        return preorder
    }

    private fun readPreOrder(tree: BinaryTree, preorder: ArrayList<Int>) {
        preorder.add(tree.value)
        if (tree.left != null) readPreOrder(tree.left, preorder)
        if (tree.right != null) readPreOrder(tree.right, preorder)
    }

    data class BinaryTree(val value: Int, val left: BinaryTree? = null, val right: BinaryTree? = null)
}