package algorithms.trees

//Unfinished
class LowestCommonAncestor {

    fun getLowestCommonAncestor(binaryTree: BinaryTree, nodeValue1: Int, nodeValue2: Int) {
        findLowestCommonAncestor(binaryTree, nodeValue1, nodeValue2, 0)
    }

    private fun findLowestCommonAncestor(binaryTree: BinaryTree?, nodeValue1: Int, nodeValue2: Int, lca: Int): Int {
        if (binaryTree?.left == null && binaryTree?.right == null) return 0
        var lcaLeft = 0
        var lcaRight = 0
        if (binaryTree.left != null && binaryTree.left.value == nodeValue1) {
            lcaLeft = binaryTree.value
        }
        else if(binaryTree.left != null) {
            lcaLeft = findLowestCommonAncestor(binaryTree.left, nodeValue1, nodeValue2, lca)
        }
        if (binaryTree.right != null && binaryTree.right.value == nodeValue2) {
            lcaRight = binaryTree.value
        }
        else if(binaryTree.right != null) {
            val newLca = if (lcaLeft == 0) lca else lcaLeft
            lcaRight = findLowestCommonAncestor(binaryTree.right, nodeValue1, nodeValue2, newLca)
        }
        return lca
    }

    private fun findLowestCommonAncestorVariant(binaryTree: BinaryTree?, nodeValue1: Int, nodeValue2: Int, lca: Int): Int {
        if (binaryTree?.left == null && binaryTree?.right == null) return 0
        var leftNode = 0
        var rightNode = 0
        if (binaryTree.left != null) {
            leftNode = if (binaryTree.left.value == nodeValue1) binaryTree.left.value
            else findLowestCommonAncestorVariant(binaryTree.left, nodeValue1, nodeValue2, lca)
        }
        if (binaryTree.right != null) {
            val newLca = if (leftNode != 0) binaryTree.value else lca
            rightNode = if (binaryTree.right.value == nodeValue2) binaryTree.right.value
            else findLowestCommonAncestorVariant(binaryTree.right, nodeValue1, nodeValue2, newLca)
        }
        return if (leftNode == nodeValue1 && rightNode == nodeValue2) binaryTree.value
        else 0
    }

    private fun findLowestCommonAncestorVariantB(binaryTree: BinaryTree?, nodeValue1: Int, nodeValue2: Int, lca: Int): Int {
        if (binaryTree?.left == null && binaryTree?.right == null) return 0
        var leftNode = 0
        var rightNode = 0


        if (binaryTree.left != null) {
            leftNode = if (binaryTree.left.value == nodeValue1) binaryTree.left.value
            else findLowestCommonAncestorVariantB(binaryTree.left, nodeValue1, nodeValue2, lca)
        }
        if (binaryTree.right != null) {
            val newLca = if (leftNode != 0) binaryTree.value else lca
            rightNode = if (binaryTree.right.value == nodeValue2) binaryTree.right.value
            else findLowestCommonAncestorVariantB(binaryTree.right, nodeValue1, nodeValue2, newLca)
        }
        return if (leftNode == nodeValue1 && rightNode == nodeValue2) binaryTree.value
        else 0
    }

    data class BinaryTree(val value: Int, val left: BinaryTree? = null, val right: BinaryTree? = null)
}