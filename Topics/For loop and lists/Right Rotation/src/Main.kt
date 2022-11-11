fun main() {
    val size = readln().toInt()
    val list = mutableListOf<Int>()

    repeat(size) {
        list.add(readln().toInt())
    }

    val rotatePosition = readln().toInt()

    repeat(rotatePosition % size) {
        list.add(0, list.removeAt(list.lastIndex))
    }

    println(list.joinToString(" "))

}