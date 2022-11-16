fun main() {
    val answer = readln().toInt()

    println(
        when (answer) {
            1, in 3..4 -> "No!"
            2 -> "Yes!"
            else -> "Unknown number"
        }
    )
}