fun solution(inputArray: MutableList<Int>): Int? {
    return inputArray.zipWithNext(Int::times).maxOrNull()
}

fun main() {
    val s = mutableListOf(7, 2, -2, -5, 4, 3)
    println(solution(s)) // 7 and 3 produce the largest product.
}