const val GROUPS_OF_NUMBERS = 4
const val LENGTH_OF_NUMBERS = 4

fun parseCardNumber(cardNumber: String): Long {
    if (cardNumber === "") throw Exception("Card number empty.")

    if (cardNumber.split(" ").size != GROUPS_OF_NUMBERS) throw Exception("Invalid spaces in cardNumber")

    for (number in cardNumber.split(" ")) {
        if (number.toIntOrNull() == null) throw Exception("Not a valid card number")
    }

    for (number in cardNumber.split(" ")) {
        if (number.length != LENGTH_OF_NUMBERS) throw Exception("Invalid card format")
    }

    return cardNumber.split(" ").joinToString("").toLong()
}