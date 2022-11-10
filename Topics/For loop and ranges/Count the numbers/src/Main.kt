fun main() {
    val range = readln().toInt()..readln().toInt()
    val n = readln().toInt()
    var output = 0;

    for (i in range) {
        if (i % n == 0) {
            output++
        }
    }
    println(output)
}
