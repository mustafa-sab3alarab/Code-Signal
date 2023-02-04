fun solution(inputString: String) = inputString.reversed() == inputString

fun main() {

    // A string that doesn't changed when reversed (it reads the same backward and forward).
    println(solution("eye"))
    println(solution("noon"))
    println(solution("decaf faced"))
    println(solution("taco cat"))
    println(solution("racecars"))
}