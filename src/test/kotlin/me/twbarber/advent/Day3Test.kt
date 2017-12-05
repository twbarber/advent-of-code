package me.twbarber.advent

import junit.framework.Assert.assertEquals
import org.junit.Test

class Day3Test {

    @Test
    fun `pow for base exp`() {
        assertEquals(4, pow(2, 2))
        assertEquals(25, pow(5, 2))

    }

    @Test
    fun `findSquare for target`() {
        assertEquals(0, findSquare(target = 1))
        assertEquals(1, findSquare(target = 9))
        assertEquals(1, findSquare(target = 6))
        assertEquals(3, findSquare(target = 26))
        assertEquals(3, findSquare(target = 49))
        assertEquals(4, findSquare(target = 81))
        assertEquals(5, findSquare(target = 82))
    }

    @Test
    fun `sideLength square`() {
        assertEquals(1, sideLength(0))
        assertEquals(3, sideLength(1))
        assertEquals(5, sideLength(2))
    }

    @Test
    fun `side for square and target`() {
        assertEquals(0, findSide(25))
        assertEquals(0, findSide(24))
        assertEquals(0, findSide(23))
        assertEquals(0, findSide(22))
        assertEquals(1, findSide(21))
        assertEquals(1, findSide(20))
        assertEquals(1, findSide(19))
        assertEquals(1, findSide(18))
        assertEquals(2, findSide(17))
        assertEquals(2, findSide(16))
        assertEquals(2, findSide(15))
        assertEquals(2, findSide(14))
        assertEquals(3, findSide(13))
    }



}