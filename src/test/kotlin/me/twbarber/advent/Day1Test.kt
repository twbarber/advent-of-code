package me.twbarber.advent

import org.junit.Assert.assertEquals
import org.junit.Test

class Day1Test {

    private val input = ResourceLoader.loadAsText("input/day_one.txt").replace("\n","")

    @Test
    fun partOne() {
        assertEquals(3, dayOnePartOne("1221".format()))
        assertEquals(4, dayOnePartOne("1111".format()))
        assertEquals(0, dayOnePartOne("1234".format()))
        assertEquals(9, dayOnePartOne("91212129".format()))
        assertEquals(1177, dayOnePartOne(input.format()))
    }

    @Test
    fun partTwo() {
        assertEquals(6, dayOnePartTwo("1212".format()))
        assertEquals(0, dayOnePartTwo("1221".format()))
        assertEquals(4, dayOnePartTwo("123425".format()))
        assertEquals(12, dayOnePartTwo("123123".format()))
        assertEquals(4, dayOnePartTwo("12131415".format()))
        assertEquals(1060, dayOnePartTwo(input.format()))
    }

    private fun String.format() = this.split("").filter { it != "" }.map { it.toInt() }

}