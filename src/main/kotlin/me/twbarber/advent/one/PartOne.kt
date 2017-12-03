package me.twbarber.advent.one

object PartOne {

    fun run(input: String) : Int {
        val list = input.split("").filter { n -> n != "" }
        return list.indices
                .filter { list[it] == list[(it + 1) % list.size] }
                .map { it -> list[it].toInt() }
                .sum()
    }

}