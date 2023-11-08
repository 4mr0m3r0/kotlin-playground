package algorithms.trees

import kotlin.test.Test
import kotlin.test.assertEquals

class FindClosestValueInBSTTest {
    private val closestValueInBST = FindClosestValueInBST()

    @Test
    fun `given tree and target 12, when findClosestValueInBst, then return 13`() {
        val tree = BST(
            value = 10,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1)
                ),
                right = BST(value = 5)
            ),
            right = BST(
                value = 15,
                left = BST(
                    value = 13,
                    right = BST(value = 14)
                ),
                right = BST(value = 22)
            )
        )

        val result = closestValueInBST.findClosestValueInBstLogN(tree = tree, target = 12)

        assertEquals(
            expected = 13,
            actual = result
        )
    }

    @Test
    fun `given tree and target 12, when findClosestValueInBst, then return 11`() {
        val tree = BST(
            value = 9,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1),
                    right = BST(value = 3)
                ),
                right = BST(value = 8)
            ),
            right = BST(
                value = 20,
                left = BST(
                    value = 11,
                    left = BST(value = 10),
                    right = BST(
                        value = 16,
                        left = BST(value = 14),
                        right = BST(value = 17)
                    )
                ),
                right = BST(value = 30)
            )
        )

        val result = closestValueInBST.findClosestValueInBstIterative(tree = tree, target = 12)

        assertEquals(
            expected = 11,
            actual = result
        )
    }

    @Test
    fun `given tree and target 18, when findClosestValueInBst, then return 17`() {
        val tree = BST(
            value = 9,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1),
                    right = BST(value = 3)
                ),
                right = BST(value = 8)
            ),
            right = BST(
                value = 20,
                left = BST(
                    value = 11,
                    left = BST(value = 10),
                    right = BST(
                        value = 16,
                        left = BST(value = 14),
                        right = BST(value = 17)
                    )
                ),
                right = BST(value = 30)
            )
        )

        val result = closestValueInBST.findClosestValueInBstLogN(tree = tree, target = 18)

        assertEquals(
            expected = 17,
            actual = result
        )
    }

    @Test
    fun `given tree and target 15, when findClosestValueInBst, then return 14`() {
        val tree = BST(
            value = 10,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1)
                ),
                right = BST(value = 5)
            ),
            right = BST(
                value = 17,
                left = BST(
                    value = 13,
                    right = BST(value = 14)
                ),
                right = BST(value = 22)
            )
        )

        val result = closestValueInBST.findClosestValueInBstLogN(tree = tree, target = 15)

        assertEquals(
            expected = 14,
            actual = result
        )
    }

    @Test
    fun `given tree and target 23, when findClosestValueInBst, then return 22`() {
        val tree = BST(
            value = 10,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1)
                ),
                right = BST(value = 5)
            ),
            right = BST(
                value = 17,
                left = BST(
                    value = 13,
                    right = BST(value = 14)
                ),
                right = BST(value = 22)
            )
        )

        val result = closestValueInBST.findClosestValueInBstLogN_SecondVariant(tree = tree, target = 23)

        assertEquals(
            expected = 22,
            actual = result
        )
    }

    @Test
    fun `given tree and target 6, when findClosestValueInBst, then return 5`() {
        val tree = BST(
            value = 10,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1)
                ),
                right = BST(value = 5)
            ),
            right = BST(
                value = 17,
                left = BST(
                    value = 13,
                    right = BST(value = 14)
                ),
                right = BST(value = 22)
            )
        )

        val result = closestValueInBST.findClosestValueInBstIterative(tree = tree, target = 6)

        assertEquals(
            expected = 5,
            actual = result
        )
    }

    @Test
    fun `given tree and target 10, when findClosestValueInBst, then return 10`() {
        val tree = BST(
            value = 10,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1)
                ),
                right = BST(value = 5)
            ),
            right = BST(
                value = 17,
                left = BST(
                    value = 13,
                    right = BST(value = 14)
                ),
                right = BST(value = 22)
            )
        )

        val result = closestValueInBST.findClosestValueInBstLogN(tree = tree, target = 10)

        assertEquals(
            expected = 10,
            actual = result
        )
    }

    @Test
    fun `given tree and target 7, when findClosestValueInBst, then return 6`() {
        val tree = BST(
            value = 10,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1)
                ),
                right = BST(value = 6)
            ),
            right = BST(
                value = 17,
                left = BST(
                    value = 13,
                    right = BST(value = 14)
                ),
                right = BST(value = 22)
            )
        )

        val result = closestValueInBST.findClosestValueInBstLogN(tree = tree, target = 7)

        assertEquals(
            expected = 6,
            actual = result
        )
    }

    @Test
    fun `given tree and target 1, when findClosestValueInBst, then return 1`() {
        val tree = BST(
            value = 10,
            left = BST(
                value = 5,
                left = BST(
                    value = 2,
                    left = BST(value = 1)
                ),
                right = BST(value = 6)
            ),
            right = BST(
                value = 17,
                left = BST(
                    value = 13,
                    right = BST(value = 14)
                ),
                right = BST(value = 22)
            )
        )

        val result = closestValueInBST.findClosestValueInBstIterative(tree = tree, target = 1)

        assertEquals(
            expected = 1,
            actual = result
        )
    }

    @Test
    fun `given tree and target -1, when findClosestValueInBst, then return 1`() {
        val tree = BST(
            value = 100,
            left = BST(
                //region tree 5
                value = 5,
                left = BST(
                    //region tree 2
                    value = 2,
                    left = BST(
                        //#region tree 1
                        value = 1,
                        left = BST(
                            value = -51,
                            left = BST(value = -403)
                        ),
                        right = BST(
                            value = 1,
                            right = BST(
                                value = 1,
                                right = BST(
                                    value = 1,
                                    right = BST(value = 1)
                                )
                            )
                        )
                        //#endregion
                    ),
                    right = BST(value = 3)
                    //endregion
                ),
                right = BST(
                    //region tree 15
                    value = 15,
                    left = BST(value = 5),
                    right = BST(
                        value = 22,
                        right = BST(
                            value = 57,
                            right = BST(value = 60)
                        )
                    )
                    //endregion
                )
                //endregion
            ),
            right = BST(
                //region tree 502
                value = 502,
                left = BST(
                    //region tree 204
                    value = 204,
                    left = BST(value = 203),
                    right = BST(
                        value = 205,
                        right = BST(
                            value = 207,
                            left = BST(value = 206),
                            right = BST(value = 208)
                        )
                    )
                    //endregion
                ),
                right = BST(
                    //region tree 5500
                    value = 5500,
                    left = BST(
                        value = 1001,
                        right = BST(value = 4500)
                    )
                    //endregion
                )
                //endregion
            )
        )

        val result = closestValueInBST.findClosestValueInBstLogN_SecondVariant(tree = tree, target = -1)

        assertEquals(
            expected = 1,
            actual = result
        )
    }
}