package me.twbarber.advent

import kotlin.math.ceil
import kotlin.math.sqrt

fun findCoordinates(target: Int): Pair<Int, Int> {
    val square = findSquare(target)
    val offset = findSquareMax(square) - target
    var x = sideLength(square)
    var y = 0

    return Pair(offset, offset)
}

fun findSquare(target: Int): Int = ceil(sqrt(target.toDouble())).toInt() / 2
fun findSquareMax(square: Int): Int = 4 * (square pow 2) + 4 * square + 1
fun findSquareMin(square: Int): Int = findSquareMax(square - 1) + 1

infix fun Int.pow(exp: Int) = (1 until exp).fold(this) { i, _ -> i * this }

fun sideLength(square: Int) = 2 * square + 1

fun findSide(target: Int) : Int {
    val square = findSquare(target)
    val max = findSquareMax(square)
    return (max - target + 1) / sideLength(square)
}

fun sideMax(max: Int, side: Int, offset: Int) : Int {
    return max - (offset / side) * (side - 1)
}