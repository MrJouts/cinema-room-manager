fun isVowel(letter: Char): Boolean {
    val l = letter.lowercaseChar()
    return l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}