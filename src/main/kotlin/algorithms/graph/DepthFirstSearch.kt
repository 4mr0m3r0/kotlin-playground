package algorithms.graph

/**
 * From AlgoExpert
 */
class DepthFirstSearch(name: String) {
    val name: String = name
    val children = mutableListOf<DepthFirstSearch>()

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
}