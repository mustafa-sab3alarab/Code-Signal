fun main() {
    // Your task is to find the area of a polygon for a given n.
    // n = 2, n = 3, n = 4
    println(shapeArea(4))
}

fun shapeArea(n: Int) = (n - 1) * (n - 1) + (n * n)