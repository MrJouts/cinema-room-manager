fun main() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()

    println(
        if (n2 == 0) "Division by zero, please fix the second argument!" else n1 / n2
    )
}