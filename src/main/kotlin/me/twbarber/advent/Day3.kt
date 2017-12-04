package me.twbarber.advent

fun findCoordinates(target: Int) : Pair<Int, Int> {
        val square = findSquare(0, target)

}

fun findSquare(cur: Int, target: Int) : Int =
        if (findMax(cur) < target) findSquare(cur + 1, target) else cur


fun findMax(cur: Int) : Int = if(cur == 0)  1 else (8 * (cur)) + findMax(cur - 1)

