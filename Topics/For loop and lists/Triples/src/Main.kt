fun main() {
    val size = readln().toInt()
    val numbers = mutableListOf<Int>()
    var triples = 0

    for (i in 0 until size) {
        numbers.add(readln().toInt())
    }

    for (i in 0 until numbers.lastIndex - 1) {
        val n = numbers[i]
        if (n + 1 == numbers[i + 1] && n + 2 == numbers[i + 2]) triples++
    }

    println(triples)
}