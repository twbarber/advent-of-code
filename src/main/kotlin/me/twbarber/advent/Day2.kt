package me.twbarber.advent

typealias Spreadsheet =  List<Row>
typealias Row = List<Int>

fun dayTwoPartOne(input: Spreadsheet) = input.checksum(Row::minMaxDif)
fun dayTwoPartTwo(input: Spreadsheet) = input.checksum(Row::pairEvenDiv)

fun Spreadsheet.checksum(func: (Row) -> Int) = map(func).sum()

fun Row.minMaxDif() = (max() ?: 0) - (min() ?: 0)
fun Row.pairEvenDiv() = fold(0) {
    i, v -> i + minus(v).filter { m -> v % m == 0 }.map { d -> v / d }.sum()
}