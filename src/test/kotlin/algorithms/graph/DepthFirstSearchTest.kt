package algorithms.graph

import kotlin.test.Test
import kotlin.test.assertEquals

class DepthFirstSearchTest {
    private val depthFirstSearch = DepthFirstSearch("A")

    @Test
    fun `given graph, when depthFirstSearch, then return list`() {
        depthFirstSearch.children.add(
            DepthFirstSearch("B").also { b ->
                b.children.add(DepthFirstSearch("E"))
                b.children.add(
                    DepthFirstSearch("F").also { f ->
                        f.children.add(DepthFirstSearch("I"))
                        f.children.add(DepthFirstSearch("J"))
                    }
                )
            }
        )
        depthFirstSearch.children.add(DepthFirstSearch("C"))
        depthFirstSearch.children.add(
            DepthFirstSearch("D").also { d ->
                d.children.add(
                    DepthFirstSearch("G").also { g ->
                        g.children.add(DepthFirstSearch("K"))
                    }
                )
                d.children.add(DepthFirstSearch("H"))
            }
        )

        val result = depthFirstSearch.depthFirstSearch()

        assertEquals(
            expected = listOf("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"),
            actual = result
        )
    }
}