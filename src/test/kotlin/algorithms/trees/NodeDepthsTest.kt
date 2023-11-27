package algorithms.trees

import algorithms.trees.NodeDepths.BinaryTree
import kotlin.test.Test
import kotlin.test.assertEquals

class NodeDepthsTest {
    private val nodeDepths = NodeDepths()

    @Test
    fun `given tree, when nodeDepths, then return 16`() {
        val binaryTree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(
                    value = 4,
                    left = BinaryTree(value = 8),
                    right = BinaryTree(value = 9),
                ),
                right = BinaryTree(value = 5)
            ),
            right = BinaryTree(
                value = 3,
                left = BinaryTree(value = 6),
                right = BinaryTree(value = 7),
            )
        )

        val result = nodeDepths.nodeDepths(binaryTree)

        assertEquals(expected = 16, actual = result)
    }

    @Test
    fun `given tree, when nodeDepths, then return 4`() {
        val binaryTree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(value = 4),
            ),
            right = BinaryTree(value = 3)
        )

        val result = nodeDepths.nodeDepths(binaryTree)

        assertEquals(expected = 4, actual = result)
    }

    @Test
    fun `given tree, when nodeDepths, then return 21`() {
        val binaryTree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(
                    value = 3,
                    left = BinaryTree(
                        value = 4,
                        left = BinaryTree(
                            value = 5,
                            left = BinaryTree(
                                value = 6,
                                right = BinaryTree(value = 7)
                            )
                        )
                    )
                ),
            ),
        )

        val result = nodeDepths.nodeDepths(binaryTree)

        assertEquals(expected = 21, actual = result)
    }

    @Test
    fun `given tree, when nodeDepthsIterative, then return 16`() {
        val binaryTree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(
                    value = 4,
                    left = BinaryTree(value = 8),
                    right = BinaryTree(value = 9),
                ),
                right = BinaryTree(value = 5)
            ),
            right = BinaryTree(
                value = 3,
                left = BinaryTree(value = 6),
                right = BinaryTree(value = 7),
            )
        )

        val result = nodeDepths.nodeDepthsIterative(binaryTree)

        assertEquals(expected = 16, actual = result)
    }

    @Test
    fun `given tree, when nodeDepthsIterative, then return 4`() {
        val binaryTree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(value = 4),
            ),
            right = BinaryTree(value = 3)
        )

        val result = nodeDepths.nodeDepthsIterative(binaryTree)

        assertEquals(expected = 4, actual = result)
    }

    @Test
    fun `given tree, when nodeDepthsIterative, then return 21`() {
        val binaryTree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(
                    value = 3,
                    left = BinaryTree(
                        value = 4,
                        left = BinaryTree(
                            value = 5,
                            left = BinaryTree(
                                value = 6,
                                right = BinaryTree(value = 7)
                            )
                        )
                    )
                ),
            ),
        )

        val result = nodeDepths.nodeDepthsIterative(binaryTree)

        assertEquals(expected = 21, actual = result)
    }

    @Test
    fun `given tree, when nodeDepthVariantC, then return 21`() {
        val binaryTree = BinaryTree(
            value = 1,
            left = BinaryTree(
                value = 2,
                left = BinaryTree(
                    value = 3,
                    left = BinaryTree(
                        value = 4,
                        left = BinaryTree(
                            value = 5,
                            left = BinaryTree(
                                value = 6,
                                right = BinaryTree(value = 7)
                            )
                        )
                    )
                ),
            ),
        )

        val result = nodeDepths.nodeDepthVariantC(binaryTree)

        assertEquals(expected = 21, actual = result)
    }
}