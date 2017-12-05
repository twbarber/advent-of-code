package me.twbarber.advent

import kotlin.math.absoluteValue


fun List<String>.countValidPasswords(strategy: (List<String>) -> Boolean) =
    filter { strategy(this) }.size

fun noDupeWords(s: List<String>) = s.size == s.toSet().size

fun noAnagrams(s: List<String>) : Boolean = false

fun isAnagram(l: String, r : String) = l.buildCharCountMap() == r.buildCharCountMap()

fun noAnagramsOrDupeWords(s: List<String>) = noAnagrams(s) && noDupeWords(s)

fun String.buildCharCountMap() : Map<Char, Int> {
    return toCharArray().fold(mutableMapOf()) {
        i: MutableMap<Char, Int>, v -> i.put(v, (i[v]?.plus(1)) ?: 1); i
    }
}