package cinema

import java.lang.Exception

const val TICKET_PRICE = 10
const val TICKET_CHEAP_PRICE = 8

var ticketsPurchased = 0
var capacityPercentage = "0.00"
var currentIncome = 0
var totalIncome = 0

fun main() {
    val rows = getInitialRows()
    val seats = getInitialSeats()
    val room = createRoom(rows, seats)
    var exit = false

    totalIncome = getTotalIncome(rows, seats)

    while (!exit) {
        when (getMenuOption()) {
            0 -> exit = true
            1 -> showRoom(room)
            2 -> buyTicket(room, rows, seats)
            3 -> getStatistics()
        }
    }
}

fun getTotalIncome(rows: Int, seats: Int): Int {
    var totalIncome = 0
    if (rows * seats <= 60) {
        totalIncome = rows * seats * TICKET_PRICE
    } else {
        if ( rows % 2 != 0) {
            totalIncome = (rows / 2 + 1) * seats * TICKET_CHEAP_PRICE + (rows / 2) * seats * TICKET_PRICE
        } else {
            totalIncome = (rows / 2) * seats * TICKET_CHEAP_PRICE + (rows / 2) * seats * TICKET_PRICE
        }
    }

    return totalIncome
}

fun getInitialRows(): Int {
    println("Enter the number of rows:")
    return readln().toInt()
}

fun getInitialSeats(): Int {
    println("Enter the number of seats in each row:")
    return readln().toInt()
}

fun createRoom(rows: Int, seats: Int): MutableList<MutableList<String>> {
    val room = mutableListOf<MutableList<String>>()

    for (i in 0..rows) {
        val rowList = mutableListOf<String>()

        if (i == 0) rowList.add(" ") else rowList.add(i.toString())

        for(j in 1..seats) {
            if (i == 0) rowList.add(j.toString()) else rowList.add("S")
        }
        room.add(rowList)
    }

    return room
}

fun getMenuOption(): Int {
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
    return readln().toInt()
}

fun showRoom(room: MutableList<MutableList<String>>): Unit {
    println("Cinema:")
    for (row in room) {
        for (seat in row) {
            print("$seat ")
        }
        println()
    }
    println("")
}

fun buyTicket(room: MutableList<MutableList<String>>, rows: Int, seats: Int): Unit {
    var taken = true
    var selectedRow = 0
    var selectedSeat = 0

    while (taken) {
        selectedRow = getSelectedRow()
        selectedSeat = getSelectedSeat()

        taken = try {
            if (room[selectedRow][selectedSeat] == "B") {
                println("That ticket has already been purchased!")
                println("")
                true
            } else {
                false
            }
        } catch (e: Exception) {
            println("Wrong input!")
            println("")
            true
        }
    }

    val ticketPrice = getTicketPrice(rows, seats, selectedRow)
    addTocCurrentIncome(ticketPrice)
    addTicketToTotal()
    updateCapacityPercentage(rows, seats)
    room[selectedRow][selectedSeat] = "B"
}

fun addTicketToTotal() {
    ticketsPurchased++
}
fun addTocCurrentIncome(ticketPrice: Int): Unit {
    currentIncome += ticketPrice
}

fun updateCapacityPercentage(rows: Int, seats: Int) {
    val total = rows * seats
    val percentage = ticketsPurchased * 100.toDouble() / total
    capacityPercentage = "%.2f".format(percentage)
}

fun getSelectedRow(): Int {
    println("Enter a row number:")
    return readln().toInt()
}

fun getSelectedSeat(): Int {
    println("Enter a seat number in that row:")
    return readln().toInt()
}

fun getTicketPrice(rows: Int, seats: Int, selectedRow: Int): Int {
    val ticketPrice = if (rows * seats <= 60) TICKET_PRICE else {
        if (selectedRow > rows / 2 ) TICKET_CHEAP_PRICE else TICKET_PRICE
    }
    println("Ticket price: $$ticketPrice")
    println("")
    return ticketPrice
}

fun getStatistics(): Unit {
    println("Number of purchased tickets: $ticketsPurchased")
    println("Percentage: $capacityPercentage%")
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")
    println("")
}