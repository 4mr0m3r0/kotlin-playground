package algorithms.trees

import algorithms.trees.HeightOfABinaryTree.BinaryTree
import kotlin.test.Test
import kotlin.test.assertEquals

class HeightOfABinaryTreeTest {
    private val heightOfABinaryTree = HeightOfABinaryTree()

    @Test
    fun `given tree A, when height, then return 2`() {
        val tree = BinaryTree(
            value = 4,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(1),
                right = BinaryTree(3)
            ),
            right = BinaryTree(
                value = 6,
                left = BinaryTree(5),
                right = BinaryTree(7)
            )
        )

        val result = heightOfABinaryTree.height(tree)

        assertEquals(expected = 2, actual = result)
    }

    @Test
    fun `given tree B, when height, then return 3`() {
        val tree = BinaryTree(
            value = 3,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(1)
            ),
            right = BinaryTree(
                value = 5,
                left = BinaryTree(4),
                right = BinaryTree(
                    value = 6,
                    right = BinaryTree(7)
                )
            )
        )

        val result = heightOfABinaryTree.height(tree)

        assertEquals(expected = 3, actual = result)
    }
}