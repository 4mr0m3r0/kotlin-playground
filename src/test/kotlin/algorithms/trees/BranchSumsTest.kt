package algorithms.trees

import algorithms.trees.BranchSums.BinaryTree
import kotlin.test.Test
import kotlin.test.assertEquals

class BranchSumsTest {
    private val branchSums = BranchSums()

    @Test
    fun `given tree A, when branchSums, then expected list`() {
        val binaryTree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(
                    value = 4,
                    left = BinaryTree(value = 8),
                    right = BinaryTree(value = 9)
                ),
                right = BinaryTree(
                    value = 5,
                    left = BinaryTree(value = 10)
                )
            ),
            right = BinaryTree(
                value = 3,
                left = BinaryTree(value = 6),
                right = BinaryTree(value = 7),
            )
        )

        val result = branchSums.branchSums(binaryTree)

        assertEquals(
            expected = listOf(15, 16, 18, 10, 11),
            actual = result
        )
    }

    @Test
    fun `given tree B, when branchSums, then expected list`() {
        val binaryTree = BinaryTree(
            value = 0,
            left = BinaryTree(value = 9),
            right = BinaryTree(
                value = 1,
                left = BinaryTree(value = 15),
                right = BinaryTree(
                    value = 10,
                    left = BinaryTree(value = 100),
                    right = BinaryTree(value = 200)
                )
            )
        )

        val result = branchSums.branchSums(binaryTree)

        assertEquals(
            expected = listOf(9, 16, 111, 211),
            actual = result
        )
    }
}