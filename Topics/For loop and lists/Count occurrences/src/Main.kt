fun main() {
    val n = readln().toInt()
    val numbers = mutableListOf<Int>()
    var count = 0

    for (i in 0 until n) {
        numbers.add(readln().toInt())
    }

    val m = readln().toInt()

    for (number in numbers) {
        if (number == m) count++
    }

    println(count)
}