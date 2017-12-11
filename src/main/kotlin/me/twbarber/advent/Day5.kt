package me.twbarber.advent

fun partOne(seq: Seq) = countJumps(seq, 0, 0, Seq::incAt)
fun partTwo(seq: Seq) = countJumps(seq, 0, 0, Seq::incOrDec)

tailrec fun countJumps(s: Seq, p: Int, st: Int, js: Seq.(Int) -> Seq) : Int {
    return if (p > s.lastIndex) st else countJumps(s.js(p), s[p] + p, st + 1, js)
}

fun Seq.incAt(p: Int) = mapIndexed { i, v -> if(i == p) v + 1 else v }
fun Seq.incOrDec(p: Int) = mapIndexed { i, v -> if(i == p) { if (v >= 3) v - 1 else v + 1 } else v }