package algorithms.trees

import kotlin.math.abs

class FindClosestValueInBST {
    /**
     * Big O Notation.
     * Average: Time O(log(n)) | Space O(log(n)).
     * Worst: Time O(n) | Space O(n).
     */
    fun findClosestValueInBstLogN(tree: BST, target: Int): Int {
        return if (tree.value < target) {
            if (tree.right?.value == null) return tree.value
            val node = findClosestValueInBstLogN(tree.right, target)
            val right = abs(node - target)
            val closeness = abs(target - tree.value)
            if (right < closeness) node else tree.value
        } else if (tree.value > target) {
            if (tree.left?.value == null) return tree.value
            val node = findClosestValueInBstLogN(tree.left, target)
            val left = abs(node - target)
            val closeness = abs(tree.value - target)
            if (left < closeness) node else tree.value
        } else {
            tree.value
        }
    }

    /**
     * Big O Notation.
     * Average = Time O(log(n)) | Space O(log(n)).
     * Worst = Time O(n) | Space O(n).
     */
    fun findClosestValueInBstLogN_SecondVariant(tree: BST, target: Int): Int {
        return recursiveBst(
            tree = tree,
            target = target,
            closest = Int.MAX_VALUE.toLong()
        ).toInt()
    }
    private fun recursiveBst(tree: BST?, target: Int, closest: Long): Long {
        var close = closest
        if (tree == null) return close
        if (abs(target - close) > abs(target - tree.value)) close = tree.value.toLong()
        return if (target < tree.value) recursiveBst(tree.left, target, close)
        else if (target > tree.value) recursiveBst(tree.right, target, close)
        else close
    }

    /**
     * Big O Notation.
     * Average: Time O(log(n)) | Space O(1).
     * Worst: Time O(n) | Space O(1).
     */
    fun findClosestValueInBstIterative(tree: BST, target: Int): Int {
        return iterativeBst(
            tree = tree,
            target = target,
            closest = Int.MAX_VALUE
        )
    }
    private fun iterativeBst(tree: BST?, target: Int, closest: Int): Int {
        var close = closest.toLong()
        var node = tree
        while (node != null) {
            if (abs(target - close) > abs(target - node.value)) close = node.value.toLong()
            node = if (target < node.value) node.left
            else if (target > node.value) node.right
            else break
        }
        return close.toInt()
    }
}

data class BST(val value: Int, val left: BST? = null, val right: BST? = null)
