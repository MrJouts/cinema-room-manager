fun sum(number1: Int, number2: Int, number3: Int) = number1 + number2 + number3

fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}