fun main() {
    println(allLongestStrings(mutableListOf("abc", "eeee", "abcd", "dcd")))
}


fun allLongestStrings(inputArray: MutableList<String>) =
    inputArray.sortedByDescending { it.length }.groupBy { it.length }.values.first()

