fun square(number: Int) = number * number

fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}