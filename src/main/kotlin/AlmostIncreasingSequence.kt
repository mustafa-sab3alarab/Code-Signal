fun main() {
    val sequence1 = mutableListOf(1, 3, 2, 1) // false
    val sequence2 = mutableListOf(3, 6, 5, 8, 10, 20, 15) // false
    val sequence3 = mutableListOf(1, 3, 2) // true
    val sequence4 = mutableListOf(3, 6, 5, 8, 10, 20, 15) // false
    println(almostIncreasingSequence(sequence1))
    println(almostIncreasingSequence(sequence2))
    println(almostIncreasingSequence(sequence3))
    println(almostIncreasingSequence(sequence4))
}

fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    var maximum = Int.MIN_VALUE
    var prevMaximum = Int.MIN_VALUE
    var remove = 0
    for (s in sequence) {
        if (s > maximum) {
            prevMaximum = maximum
            maximum = s
        } else if (s > prevMaximum) {
            remove++
            maximum = s
        } else
            remove++
    }
    return remove <= 1
}

