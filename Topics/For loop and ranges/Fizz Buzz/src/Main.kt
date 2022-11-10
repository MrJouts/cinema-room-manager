fun main() {
    val range = readln().toInt()..readln().toInt()

    for (n in range) {
        var output = ""

        if (n % 3 == 0 && n % 5 == 0) {
            output += "FizzBuzz"
        } else if (n % 5 == 0) {
            output += "Buzz"
        } else if (n % 3 == 0) {
            output += "Fizz"
        } else {
            output = n.toString()
        }

        println(output)
    }
}