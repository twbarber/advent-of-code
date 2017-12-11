package me.twbarber.advent

fun partOne(seq: Seq, p: Int = 0, s: Int = 0) = countJumps(seq, p, s, Seq::incAt)
fun partTwo(seq: Seq, p: Int = 0, s: Int = 0) = countJumps(seq, p, s, Seq::incOrDec)

tailrec fun countJumps(seq: Seq, p: Int, s: Int, js: Seq.(Int) -> Seq) : Int {
    return if (p > seq.lastIndex) s else countJumps(seq.js(p), seq[p] + p, s + 1, js)
}

fun Seq.incAt(p: Int) = mapIndexed { i, v -> if(i == p) v + 1 else v }
fun Seq.incOrDec(p: Int) = mapIndexed { i, v -> if(i == p) { if (v >= 3) v - 1 else v + 1 } else v }