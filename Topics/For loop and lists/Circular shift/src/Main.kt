fun main() {
    val size = readln().toInt()
    val numbers = mutableListOf<Int>()

    for (i in 0 until size) {
        if (i == size - 1) {
            numbers.add(0, readln().toInt())
        } else numbers.add(readln().toInt())
    }

    println(numbers.joinToString(" "))
}