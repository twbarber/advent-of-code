package me.twbarber.advent

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.exp

class Day4Test {

    private val INPUT_FILE = "input/day_four.txt"
    private val input = ResourceLoader.loadAsText(INPUT_FILE)
        .trimMargin().split("\n")

    @Test
    fun `String contains no duplicate words`() {
        assertEquals(true, noDupeWords("aa bb cc dd ee".split(" ")))
        assertEquals(false, noDupeWords("aa bb cc dd aa".split(" ")))
        assertEquals(true, noDupeWords("aa bb cc dd aaa".split(" ")))
    }

    @Test
    fun partOne() {
        assertEquals(477, input.countValidPasswords(::noDupeWords))
    }

    @Test
    fun isAnagram() {
        assertEquals(false, isAnagram("abcde", "fghij"))
        assertEquals(true, isAnagram("abcde", "ecdab"))
        assertEquals(true, isAnagram("lol", "oll"))
        assertEquals(false, isAnagram("lol", "ooll"))
    }

    @Test
    fun `testBuildCharCountMap`() {
        val expected = mapOf('l' to 2, 'o' to 1)
        assertEquals(expected, "lol".buildCharCountMap())
    }
}