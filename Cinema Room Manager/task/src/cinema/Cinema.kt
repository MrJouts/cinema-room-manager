package cinema

const val TICKET_PRICE = 10
const val TICKET_CHEAP_PRICE = 8

fun main() {
    val rows = getInitialRows()
    val seats = getInitialSeats()
    val room = createRoom(rows, seats)
    var exit = false

    while (!exit) {
        when (getMenuOption()) {
            0 -> exit = true
            1 -> showRoom(room)
            2 -> buyTicket(room, rows, seats)
        }
    }
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
    val selectedRow = getSelectedRow()
    val selectedSeat = getSelectedSeat()
    getTicketPrice(rows, seats, selectedRow)
    room[selectedRow][selectedSeat] = "B"
}

fun getSelectedRow(): Int {
    println("Enter a row number:")
    return readln().toInt()
}

fun getSelectedSeat(): Int {
    println("Enter a seat number in that row:")
    return readln().toInt()
}

fun getTicketPrice(rows: Int, seats: Int, selectedRow: Int) {
    val ticketPrice = if (rows * seats <= 60) TICKET_PRICE else {
        if (selectedRow > rows / 2 ) TICKET_CHEAP_PRICE else TICKET_PRICE
    }
    println("Ticket price: $$ticketPrice")
    println("")
}