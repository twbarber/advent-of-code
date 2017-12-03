package me.twbarber.advent

object DayTwo {

    fun partOne(input: String) : Int = Spreadsheet(parseRows(input)).checksum({ it.minMaxDif() })

    fun partTwo(input: String) : Int = Spreadsheet(parseRows(input)).checksum({ it.evenDivisorQuotient() })

    private fun parseRows(input: String) : List<Row> {
        return input.split("\n").map { Row(it.split(" ").map { it.toInt() }) }
    }

    private data class Spreadsheet(private val rows: List<Row>) {
        fun checksum(func: (Row) -> Int) = rows.map(func).sum()
    }

    private data class Row(private val values: List<Int>) {
        fun min() = values.min() ?: 0
        fun max() = values.max() ?: 0

        fun minMaxDif() : Int = max() - min()

        fun evenDivisorQuotient() : Int {
            return values.map { v ->
                values.minus(v)
                        .filter { m -> v % m == 0 }
                        .map { d -> v / d }
            }.flatMap { it }.sum()
        }
    }


}