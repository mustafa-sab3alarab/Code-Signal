fun main() {
    val statues = mutableListOf(6, 2, 3, 8) // we need statues of sizes 4, 5 and 7
    println(solutionConsecutive(statues))
}

fun solutionConsecutive(statues: MutableList<Int>): Int {
    val listSorted = statues.sorted()
    val min = listSorted[0]
    val max = listSorted.last()
    return max - min - listSorted.size + 1
}