package me.twbarber.advent

typealias Spreadsheet =  List<Row>
typealias Row = List<Int>

fun dayTwoPartOne(input: Spreadsheet) = input.checksum { it.minMaxDif() }

fun dayTwoPartTwo(input: Spreadsheet) = input.checksum { it.pairEvenDiv() }

fun Spreadsheet.checksum(func: (Row) -> Int) = this.map(func).sum()

fun Row.minMaxDif() = (this.max() ?: 0) - (this.min() ?: 0)

fun Row.pairEvenDiv() = this.fold(0) { i, v ->
    i + this.minus(v).filter { m -> v % m == 0 }.map { d -> v / d }.sum()
}
