package me.twbarber.advent

typealias Seq = List<Int>

fun dayOnePartOne(input: Seq) = input.captcha { it + 1 }
fun dayOnePartTwo(input: Seq) = input.captcha { it + input.size / 2 }

fun Seq.captcha(f: (Int) -> Int) = filterIndexed { i, v -> v == get(f(i) % size) }.sum()
