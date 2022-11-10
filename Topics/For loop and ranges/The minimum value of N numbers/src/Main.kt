fun main() {
    val n = readln().toInt()
    var min = Int.MAX_VALUE
    repeat(n) {
        val number = readln().toInt()
        if (number < min) min = number
    }
    println(min)
}