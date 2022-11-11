fun main() {
    val size = readln().toInt()
    val numbers = mutableListOf<Int>()

    repeat(size) {
        numbers.add(readln().toInt())
    }

    println(if (numbers.indexOf(readln().toInt()) != -1) "YES" else "NO")
}