import java.lang.Exception

fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()

    return if (maxSpeed >= 120 && accTime in 1..4) {
        "I will definitely win!"
    } else {
        throw Exception("The race can't be won with this car")
    }
}