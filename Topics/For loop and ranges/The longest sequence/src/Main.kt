fun main() {
    val n = readln().toInt()
    var prev = Int.MIN_VALUE
    var count = 0
    var max = 1

    for (i in 1..n) {
        val number = readln().toInt()

        if (number >= prev) {
            count++
        } else {
            count = 1
        }

        if (count > max) {
            max = count
        }

        prev = number
    }

    println(max)
}