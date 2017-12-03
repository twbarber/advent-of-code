package me.twbarber.advent

import org.junit.Assert.assertEquals
import org.junit.Test

class Day3Test {

    private val INPUT_FILE = "input/day_two.txt"
    private val input = ResourceLoader.loadAsText(INPUT_FILE).trimMargin()

    @Test
    fun partOne() {
        val testData = """
            |5 1 9 5
            |7 5 3
            |2 4 6 8
        """.trimMargin()
        assertEquals(18, dayTwoPartOne(testData.format()))
        assertEquals(34581, dayTwoPartOne(input.format()))
    }

    @Test
    fun partTwo() {
        val testData = """
            |5 9 2 8
            |9 4 7 3
            |3 8 6 5
        """.trimMargin()
        assertEquals(9, dayTwoPartTwo(testData.format()))
        assertEquals(214, dayTwoPartTwo(input.format()))
    }

    private fun String.format() = this.split("\n").map { it.split(" ").map { it.toInt() } }


}