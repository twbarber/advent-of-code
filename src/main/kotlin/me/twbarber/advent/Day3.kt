package me.twbarber.advent

fun findCoordinates(target: Int): Pair<Int, Int> {
    val square = findSquare(0, target)
    val offset = findMax(square) - target
    var x = sideLength(square)
    var y = 0

    return Pair(offset, offset)
}

fun findSquare(cur: Int = 0, target: Int): Int {
    return if (findMax(cur) < target) findSquare(cur + 1, target)
    else cur
}

fun findMax(square: Int): Int = 4 * pow(square, 2) + 4 * square + 1

fun pow(base: Int, exp: Int) = (1 until exp).fold(base) { i, _ -> i * base }

fun sideLength(square: Int) = 2 * square + 1

fun findSide(target: Int) : Int {
    val square = findSquare(target = target)
    val max = findMax(square)
    return (max - target + 1) / sideLength(square)
}

fun sideMax(max: Int, side: Int, offset: Int) : Int {
    return max - (offset / side) * (side - 1)
}