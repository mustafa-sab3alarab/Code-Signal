fun main() {
    val matrix = mutableListOf(
        mutableListOf(0, 1, 1, 2),
        mutableListOf(0, 5, 0, 0),
        mutableListOf(2, 0, 3, 3)
    )

    val rows = matrix.size
    val columns = matrix[0].size
    println("Matrix[R=$rows,C=$columns]")

    println(matrixElementsSum(matrix))
}

fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    val hauntedColumns = mutableSetOf<Int>()
    var sum = 0
    for (row in matrix) {
        for (j in row.indices) {
            if (row[j] == 0) {
                hauntedColumns.add(j)
            } else if (j !in hauntedColumns) {
                sum += row[j]
            }
        }
    }
    return sum
}