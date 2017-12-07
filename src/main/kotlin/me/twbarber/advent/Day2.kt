package me.twbarber.advent

typealias Spreadsheet =  List<Row>
typealias Row = List<Int>

fun dayTwoPartOne(input: Spreadsheet) = input.checksum(Row::minMaxDif)
fun dayTwoPartTwo(input: Spreadsheet) = input.checksum(Row::pairEvenDiv)

fun Spreadsheet.checksum(func: (Row) -> Int) = map(func).sum()

fun Row.minMaxDif() = (max() ?: 0) - (min() ?: 0)
fun Row.pairEvenDiv() : Int {
    return fold(0) {
        i, v -> i + filter { m -> v % m == 0 && m != v }.map { d -> v / d }.sum()
    }
}