fun main(args: Array<String>) {
    val shapeNumber = readln().toInt()

    var output = "You have chosen a "

    when (shapeNumber) {
        1 -> output += "square"
        2 -> output += "circle"
        3 -> output += "triangle"
        4 -> output += "rhombus"
        else -> output = "There is no such shape!"
    }

    println(output)
}