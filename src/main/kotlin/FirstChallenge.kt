fun main() {
    val s = mutableListOf("a","b","a")
    println(solution(s))
}


fun solution(l: MutableList<String>) =
    if (

        l.any { it == "a" } && l.any { it == "b" } // check there are a,b at least in list

        &&

        l.filter { it != "a" }.filterNot { it == "b" }.isEmpty() // check if any strange char in list

    )

        l.count { it == "a" } / l.size.toDouble() // return percentage of [a] in list

    else -1.0 // 159


fun solution1(l: MutableList<String>): Double {
    var a = 0.0
    var b = 0.0
    for (i in l)
        when (i) {
            "a" -> a++
            "b" -> b++
            else -> return -1.0
        }
    if (a == 0.0 || b == 0.0) return -1.0
    return a / (a + b)
}// 150


fun solution2(l: List<String>) = if (l.count { it == "a" } in 1 until l.size && l.all { it == "a" || it == "b" })
    l.count { it == "a" }.toDouble() / l.size.toDouble() else -1.0 // 140