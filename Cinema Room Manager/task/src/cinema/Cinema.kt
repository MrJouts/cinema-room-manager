package cinema

fun main() {
    var income = 0;
    val TICKET_PRICE = 10
    val TICKET_CHEAP_PRICE = 8

    println("Enter the number of rows:")
    val rows = readln().toInt()

    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    if (rows * seats <= 60) {
        income = rows * seats * TICKET_PRICE
    } else {
        if (rows % 2 == 0) {
            income = rows / 2 * seats * TICKET_PRICE + rows / 2 * seats * TICKET_CHEAP_PRICE
        } else {
            income = rows / 2 * seats * TICKET_PRICE + (rows / 2 + 1) * seats * TICKET_CHEAP_PRICE
        }
    }

    println("Total income:")
    println("$$income")
}