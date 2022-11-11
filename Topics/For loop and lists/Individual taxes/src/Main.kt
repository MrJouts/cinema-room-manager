fun main() {
    val size = readln().toInt()
    val incomes = mutableListOf<Int>()
    val taxes = mutableListOf<Int>()
    val totalTaxes = mutableListOf<Int>()

    repeat(size) {
        incomes.add(readln().toInt())
    }

    repeat(size) {
        taxes.add(readln().toInt())
    }

    for (i in 0 until size) {
        val total = incomes[i] * taxes[i]
        totalTaxes.add(total)
    }

    val max = totalTaxes.indexOf(totalTaxes.maxOrNull())

    println(max + 1)
}