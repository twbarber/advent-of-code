package me.twbarber.advent

typealias Spreadsheet =  List<Row>
typealias Row = List<Int>

fun dayTwoPartOne(input: Spreadsheet) = input.checksum(Row::minMaxDif)
fun dayTwoPartTwo(input: Spreadsheet) = input.checksum(Row::pairEvenDiv)

fun Spreadsheet.checksum(func: (Row) -> Int) = sumBy(func)

fun Row.minMaxDif() = (max() ?: 0) - (min() ?: 0)
fun Row.pairEvenDiv() = sumBy { v -> filter { v % it == 0 && it != v }.sumBy { v / it } }