package algorithms

class TransposeMatrix {

    /**
     * Big O Notation. Time O(w * h) | Space O(w * h)
     */
    fun transposeMatrixONWH(matrix: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
        val transpose = MutableList(matrix[0].size) { MutableList(matrix.size) { 0 } }
        repeat(matrix.size) { i -> // row index
            repeat(matrix[i].size) { j -> // column index
                transpose[j][i] = matrix[i][j]
            }
        }
        return transpose
    }

    /**
     * Big O Notation. Time O(w * h) | Space O(w * h)
     */
    fun transposeMatrixTraversingColumnFirst(matrix: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
        val transpose: MutableList<MutableList<Int>> = mutableListOf()
        repeat(matrix[0].size) { columnIndex ->
            val row = mutableListOf<Int>()
            repeat(matrix.size) { rowIndex ->
                row.add(matrix[rowIndex][columnIndex])
            }
            transpose.add(row)
        }
        return transpose
    }

}