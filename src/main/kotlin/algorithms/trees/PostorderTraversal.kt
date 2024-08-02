package algorithms.trees

/**
 * HackerRank
 */
class PostorderTraversal {
    fun postOrder(tree: BinaryTree): ArrayList<Int> {
        val postorder = arrayListOf<Int>()
        readPostOrder(tree, postorder)
        postorder.add(tree.value)
        return postorder
    }

    private fun readPostOrder(tree: BinaryTree, postorder: ArrayList<Int>): Int {
        if (tree.left != null) postorder.add(readPostOrder(tree.left, postorder))
        if (tree.right != null) postorder.add(readPostOrder(tree.right, postorder))
        return tree.value
    }

    data class BinaryTree(val value: Int, val left: BinaryTree? = null, val right: BinaryTree? = null)
}

