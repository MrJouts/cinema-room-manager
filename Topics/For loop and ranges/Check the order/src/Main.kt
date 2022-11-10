fun main() {
    val n = readln().toInt()
    var prev = Int.MIN_VALUE
    var sorted = true
    repeat(n) {
        val number = readln().toInt()
        if (number < prev) {
            sorted = false
        }
        prev = number
    }
    println(if (sorted) "YES" else "NO")
}