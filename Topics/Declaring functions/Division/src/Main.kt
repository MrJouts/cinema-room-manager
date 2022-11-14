fun divide(number1: Long, number2: Long): Double {
    return number1.toDouble() / number2
}

fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}