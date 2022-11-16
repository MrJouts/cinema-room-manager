fun main() {
    val (n1, op, n2) = readln().split(" ")
    val a = n1.toLong()
    val b = n2.toLong()

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "/" -> if (b == 0L) "Division by 0!" else a / b
        "*" -> a * b
        else -> "Unknown operator"
    }

    println(result)
}