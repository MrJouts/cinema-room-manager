fun main() {
    val size = readln().toInt()
    val list = mutableListOf<Int>()

    repeat(size) { list.add(readln().toInt()) }
    val (a, b) = readln().split(" ").map { it.toInt() }

    println(if (list.indexOf(a) != -1 && list.indexOf(b) != -1) "YES" else "NO")
}