package algorithms.graph

/**
 * AlgoExpert
 */
class DepthFirstSearch(name: String) {
    val name: String = name
    val children = mutableListOf<DepthFirstSearch>()

    /**
     * Time O(v + e) | Space O(v)
     */
    fun depthFirstSearch(): List<String> {
        val nodeNames = arrayListOf<String>()
        traverse(this, nodeNames)
        return nodeNames
    }

    private fun traverse(node: DepthFirstSearch, nodeNames: ArrayList<String>) {
        nodeNames.add(node.name)
        node.children.forEach { child ->
            traverse(child, nodeNames)
        }
    }

    /**
     * Time O(v + e) | Space O(v)
     */
    fun depthFirstSearch2ndVariant(nodeNames: ArrayList<String>): List<String> {
        nodeNames.add(this.name)
        this.children.forEach { child ->
            child.depthFirstSearch2ndVariant(nodeNames)
        }
        return nodeNames
    }
}