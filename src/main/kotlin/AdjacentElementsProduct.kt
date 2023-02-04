fun solution(inputArray: MutableList<Int>): Int? {
    return inputArray.zipWithNext(Int::times).maxOrNull()
}

fun main() {
    val s = mutableListOf(3, 6, -2, -5, 7, 3)
    println(solution(s)) // 7 and 3 produce the largest product.
}