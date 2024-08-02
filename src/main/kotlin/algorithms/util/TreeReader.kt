package algorithms.util

import java.util.*

class TreeReader {
    fun insert(root: Node?, data: Int): Node {
        if (root == null) {
            return Node(data)
        } else {
            val cur: Node
            if (data <= root.value) {
                cur = insert(root.left, data)
                root.left = cur
            } else {
                cur = insert(root.right, data)
                root.right = cur
            }
            return root
        }
    }

    fun main() {
        val scan = Scanner(System.`in`)
        var t: Int = scan.nextInt()
        var root: Node? = null
        while (t-- > 0) {
            val data: Int = scan.nextInt()
            root = insert(root, data)
        }
        scan.close()
        // invoke algorithm: println(preOrder(root!!).joinToString(separator = " "))
    }

    data class Node(val value: Int, var left: Node? = null, var right: Node? = null)
}