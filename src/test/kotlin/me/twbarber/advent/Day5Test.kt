package me.twbarber.advent

import org.junit.Assert.assertEquals
import org.junit.Test


class Day5Test {

    companion object {
        private const val INPUT_FILE = "input/day_five.txt"
        private val input = ResourceLoader.loadAsText(INPUT_FILE).trimMargin().split("\n")
    }

    @Test
    fun partOneExample() {
        assertEquals(5, partOne("0 3 0 1 -3".split(" ").map { it.toInt() }))
    }

    @Test
    fun partOne() {
        assertEquals(373160, partOne(input.map { it.toInt() }))
    }

    @Test
    fun partTwoExample() {
        assertEquals(10, partTwo("0 3 0 1 -3".split(" ").map { it.toInt() }))
    }

    @Test
    fun partTwo() {
        assertEquals(26395586, partTwo(input.map { it.toInt() }))
    }
}