package me.twbarber.advent

object DayOne {

    fun partOne(input: String) : Int {
        val list = input.split("").filter { n -> n != "" }
        return list.indices
                .filter { list[it] == list[(it + 1) % list.size] }
                .map { it -> list[it].toInt() }
                .sum()
    }

    fun partTwo(input: String) : Int {
        val list = input.split("").filter { n -> n != "" }
        return list.indices
                .filter { list[it] == list[(it + list.size / 2) % list.size] }
                .map { it -> list[it].toInt() }
                .sum()

    }

}