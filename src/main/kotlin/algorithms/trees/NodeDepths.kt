package algorithms.trees

class NodeDepths {
    /**
     * Big O Notation.
     * Time O(n) | Space O(h). 'h' because of the height of the tree.
     */
    fun nodeDepths(root: BinaryTree): Int {
        return calculateSumNodesVariantB(tree = root, depth = 0)
    }

    private fun calculateSumNodesVariantA(tree: BinaryTree?, depth: Int, depthSum: Int): Int {
        if (tree == null || (tree.left == null && tree.right == null)) return depth + depthSum
        var newDepthSum = depth + depthSum
        if (tree.left != null) newDepthSum = calculateSumNodesVariantA(tree = tree.left, depth = depth + 1, depthSum = newDepthSum)
        if (tree.right != null) newDepthSum = calculateSumNodesVariantA(tree = tree.right, depth = depth + 1, depthSum = newDepthSum)
        return newDepthSum
    }

    private fun calculateSumNodesVariantB(tree: BinaryTree?, depth: Int): Int {
        if (tree == null) return depth
        var newDepth = depth
        if (tree.left != null) newDepth += calculateSumNodesVariantB(tree = tree.left, depth = depth + 1)
        if (tree.right != null) newDepth += calculateSumNodesVariantB(tree = tree.right, depth = depth + 1)
        return newDepth
    }

    fun nodeDepthVariantC(root: BinaryTree?, depth: Int = 0): Int {
        if (root == null) return 0
        return depth + nodeDepthVariantC(root.left, depth + 1) + nodeDepthVariantC(root.right, depth + 1)
    }

    /**
     * Big O Notation.
     * Time O(n) | Space O(h).
     */
    fun nodeDepthsIterative(root: BinaryTree): Int {
        var totalDepth = 0
        val stack = ArrayDeque<NodeDepth>()
        stack.addFirst(NodeDepth(node = root, depth = 0))
        while (!stack.isEmpty()) {
            val nodeDepth = stack.removeFirst()
            val node = nodeDepth.node
            val depth = nodeDepth.depth
            if (node == null) continue
            totalDepth += depth
            stack.addFirst(NodeDepth(node = node.left, depth = depth + 1))
            stack.addFirst(NodeDepth(node = node.right, depth = depth + 1))
        }
        return totalDepth
    }

    data class NodeDepth(val node: BinaryTree?, val depth: Int)

    data class BinaryTree(val value: Int, val left: BinaryTree? = null, val right: BinaryTree? = null)
}