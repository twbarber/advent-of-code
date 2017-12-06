package me.twbarber.advent

import org.junit.Assert.assertEquals
import org.junit.Test

const val INPUT_FILE = "input/day_four.txt"

class Day4Test {

    private val input = ResourceLoader.loadAsText(INPUT_FILE).trimMargin().split("\n")

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
    fun `Strng contains No Anagrams`() {
        assertEquals(true, noAnagramsOrDupeWords("abcde fghij".split(" ")))
        assertEquals(false, noAnagramsOrDupeWords("abcde xyz ecdab".split(" ")))
        assertEquals(true, noAnagramsOrDupeWords("a ab abc abd abf abj".split(" ")))
        assertEquals(true, noAnagramsOrDupeWords("iiii oiii ooii oooi oooo".split(" ")))
        assertEquals(false, noAnagramsOrDupeWords("oiii ioii iioi iiio".split(" ")))
    }

    @Test
    fun partTwo() {
        assertEquals(167, input.countValidPasswords(::noAnagramsOrDupeWords))
    }

}