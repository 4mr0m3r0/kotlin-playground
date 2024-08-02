package algorithms.trees

import algorithms.trees.PostorderTraversal.BinaryTree
import kotlin.test.Test
import kotlin.test.assertEquals

class PostorderTraversalTest {
    private val postorderTraversal = PostorderTraversal()

    @Test
    fun `given tree A, when postOrder, then return list`() {
        val bt = BinaryTree(
            value = 1,
            right = BinaryTree(
                value = 2,
                right = BinaryTree(
                    value = 5,
                    left = BinaryTree(
                        value = 3,
                        right = BinaryTree(value = 4)
                    ),
                    right = BinaryTree(value = 6)
                )
            )
        )

        val result = postorderTraversal.postOrder(bt)

        assertEquals(
            expected = arrayListOf(4, 3, 6, 5, 2, 1),
            actual = result
        )
    }

    @Test
    fun `given tree B, when postOrder, then return list`() {
        val bt = BinaryTree(
            value = 1,
            right = BinaryTree(
                value = 14,
                left = BinaryTree(
                    value = 3,
                    left = BinaryTree(2),
                    right = BinaryTree(
                        value = 7,
                        left = BinaryTree(
                            value = 4,
                            right = BinaryTree(
                                value = 5,
                                right = BinaryTree(6)
                            )
                        ),
                        right = BinaryTree(
                            value = 13,
                            left = BinaryTree(
                                value = 10,
                                left = BinaryTree(
                                    value = 8,
                                    right = BinaryTree(9)
                                ),
                                right = BinaryTree(
                                    value = 11,
                                    right = BinaryTree(12)
                                )
                            )
                        )
                    )
                ),
                right = BinaryTree(15)
            )
        )

        val result = postorderTraversal.postOrder(bt)

        assertEquals(
            expected = arrayListOf(2, 6, 5, 4, 9, 8, 12, 11, 10, 13, 7, 3, 15, 14, 1),
            actual = result
        )
    }
}