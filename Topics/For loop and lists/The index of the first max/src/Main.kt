fun main() {
    val size = readln().toInt()
    val numbers = mutableListOf<Int>()

    for (i in 1..size) {
        numbers.add(readln().toInt())
    }

    val index = numbers.indexOf(numbers.maxOrNull())

    println(index)
}