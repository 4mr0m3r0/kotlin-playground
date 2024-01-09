package algorithms.trees

import algorithms.trees.EvaluateExpressionTree.BinaryTree
import kotlin.test.Test
import kotlin.test.assertEquals

class EvaluateExpressionTreeTest {
    private val evaluateExpressionTree = EvaluateExpressionTree()

    @Test
    fun `given tree, when evaluateExpressionTree, then return 6`() {
        val tree = BinaryTree(
            value = -1,
            left = BinaryTree(
                value = -2,
                left = BinaryTree(
                    value = -4,
                    left = BinaryTree(value = 2),
                    right = BinaryTree(value = 3),
                ),
                right = BinaryTree(value = 2)
            ),
            right = BinaryTree(
                value = -3,
                left = BinaryTree(value = 8),
                right = BinaryTree(value = 3),
            )
        )

        val actual = evaluateExpressionTree.evaluateExpressionTree(tree)

        assertEquals(
            expected = 6,
            actual = actual
        )
    }
}