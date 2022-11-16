fun main() {
    val number = readln().toInt()

    println(
        when {
            number in 0..9 -> 1
            number in 10..99 -> 2
            number in 100..999 -> 3
            number in 1000..9999 -> 4
            else -> null
        }
    )
}