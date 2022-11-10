fun main() {
    val n = readln().toInt()
    var max1 = 0
    var max2 = 0

    for (i in 1..n) {
        val number = readln().toInt()

        if (number >= max1) {
            max2 = max1
            max1 = number
        }

        if (number in max2 until max1) {
            max2 = number
        }
    }
    println(if (max1 == 0 || max2 == 0) max1 else max1 * max2)
}