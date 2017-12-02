package me.twbarber.advent.one

object PartOne {

    fun imperative(input: String): Int {
        var sum = 0
        val list = arrayListOf<Int>()
        for (n in input.chars()) {
            list.add(n - 48)
        }
        for (i in list.indices) {
            if (i < list.size - 1 && list[i] == list[i + 1]) {
                sum += list[i]
            }
        }
        if (list.first() == list.last()) {
            sum += list.first().toInt()
        }
        return sum
    }

    fun functional(input: String) : Int {
        val list = input.split("").filter { n -> n != "" }
        return list.indices
                .filter { it < list.size - 1 && list[it] == list[it + 1] }
                .map { it -> list[it].toInt() }
                .sum()
                .plus(if (list.first() == list.last()) list.first().toInt() else 0)
    }

}