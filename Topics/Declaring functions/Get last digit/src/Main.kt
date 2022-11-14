fun getLastDigit(number: Int) = Math.abs(number) % 10

fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}