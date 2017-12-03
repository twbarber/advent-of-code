package me.twbarber.advent

fun dayTwoPartOne(input: String) = input.parseRows().checksum({ it.minMaxDif() })

fun dayTwoPartTwo(input: String) = input.parseRows().checksum({ it.evenQuotient() })

fun String.parseRows() = this.split("\n").map { it.split(" ").map { it.toInt() } }

fun List<List<Int>>.checksum(func: (List<Int>) -> Int) = this.map(func).sum()

fun List<Int>.minMaxDif() = (this.max() ?: 0) - (this.min() ?: 0)

fun List<Int>.evenQuotient() =
        this.fold(0) { i, v -> i + this.minus(v).filter { m -> v % m == 0 }.map { d -> v / d }.sum() }
