fun main() {
    val range = readln().toInt()..readln().toInt() - 1
    var n = 1L
    for (i in range) {
        n *= i
    }
    println(n)
}
