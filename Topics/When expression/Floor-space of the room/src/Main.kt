import kotlin.math.*

const val PI = 3.14

fun main() {
    var area: Double = 0.0

    when (readln()) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val p = (a + b + c) / 2
            area = sqrt(p * (p - a) * (p - b) * (p - c))
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            area = a * b
        }
        "circle" -> {
            val r = readln().toDouble()
            area = PI * r.pow(2)
        }
    }

    println(area)
}