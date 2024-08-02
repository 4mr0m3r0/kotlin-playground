package algorithms.trees

import algorithms.trees.PreorderTraversal.BinaryTree
import kotlin.test.Test
import kotlin.test.assertEquals

class PreorderTraversalTest {
    private val preorderTraversal = PreorderTraversal()

    @Test
    fun `given tree A, when preOrder, then return list`() {
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

        val result = preorderTraversal.preOrder(bt)

        assertEquals(
            expected = arrayListOf(1, 2, 5, 3, 4, 6),
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

        val result = preorderTraversal.preOrder(bt)

        assertEquals(
            expected = arrayListOf(1, 14, 3, 2, 7, 4, 5, 6, 13, 10, 8, 9, 11, 12, 15),
            actual = result
        )
    }
}