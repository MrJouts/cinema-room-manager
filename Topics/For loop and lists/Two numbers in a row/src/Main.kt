fun main() {
    val size = readln().toInt()
    val numbers = arrayListOf<Int>()
    var output = "YES"

    repeat(size) {
        numbers.add(readln().toInt())
    }

    val (a, b) = readln().split(" ").map { it.toInt() }

    for (i in 0 until size - 1) {
        if (numbers[i] == a && numbers[i + 1] == b || numbers[i] == b && numbers[i + 1] == a) {
            output = "NO"
        }
    }

    println(output)
}