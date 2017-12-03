package me.twbarber.advent.one


fun main2(input: String) {
    val list = input.split("").filter { n -> n != "" }
    println(list.indices
            .filter { it < list.size - 1 && list[it] == list[it + 1] }
            .map { it -> list[it].toInt() }
            .sum())

}
