package cinema

fun main() {
    var ticketPrice = 0;
    val TICKET_PRICE = 10
    val TICKET_CHEAP_PRICE = 8

    println("Enter the number of rows:")
    val rows = readln().toInt()

    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    val room = mutableListOf<MutableList<Any>>()

    for (i in 0..rows) {
        val rowList = mutableListOf<Any>()

        if (i == 0) rowList.add(' ') else rowList.add(i)

        for(j in 1..seats) {
            if (i == 0) rowList.add(j) else rowList.add('S')
        }

        room.add(rowList)
    }

    println("Cinema:")
    for (row in room) {
        for (seat in row) {
            print("$seat ")
        }
        println()
    }
    println("")

    println("Enter a row number:")
    val selectedRow = readln().toInt()

    println("Enter a seat number in that row:")
    val selectedSeat = readln().toInt()

    if (rows * seats <= 60) {
        ticketPrice = TICKET_PRICE
    } else {
        if (selectedRow > rows / 2 ) {
            ticketPrice = TICKET_CHEAP_PRICE
        } else ticketPrice = TICKET_PRICE
    }

    println("Ticket price: $$ticketPrice")
    println("")

    room[selectedRow][selectedSeat] = 'B'

    println("Cinema:")
    for (row in room) {
        for (seat in row) {
            print("$seat ")
        }
        println()
    }
}