fun main() {
    val range = readln().toInt()..readln().toInt()
    var output = 0
    for (i in range) {
        output += i
    }
    println(output)
}