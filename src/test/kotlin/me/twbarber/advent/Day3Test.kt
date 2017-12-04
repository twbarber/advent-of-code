package me.twbarber.advent

import junit.framework.Assert.assertEquals
import org.junit.Test

class Day3Test {

    @Test
    fun `findMax square 0`() {
        assertEquals(1, findMax(0))
    }

    @Test
    fun `findMax square 1`() {
        assertEquals(9, findMax(1))
    }

    @Test
    fun `findMax square 2`() {
        assertEquals(25, findMax(2))
    }

    @Test
    fun `findSquare max 1`() {
        assertEquals(0, findSquare(0, 1))
    }

    @Test
    fun `findSquare max 9`() {
        assertEquals(1, findSquare(0, 9))
    }

    @Test
    fun `findSquare max 49`() {
        assertEquals(3, findSquare(0, 49))
    }

    @Test
    fun `findSquare max 72`() {
        assertEquals(4, findSquare(0, 72))
    }

    @Test
    fun `findSquare max 81`() {
        assertEquals(4, findSquare(0, 81))
    }

}