fun main() {
    println(solution(1905))
    println(solution(1700))
    println(solution(150))
}

fun solution(year: Int) = (year - 1) / 100 + 1