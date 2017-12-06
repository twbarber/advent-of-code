package me.twbarber.advent

typealias PassswordFile = List<String>

fun PassswordFile.countValidPasswords(strategy: (List<String>) -> Boolean) =
    filter { strategy(it.split(" ")) }.size

fun noDupeWords(s: List<String>) = s.size == s.toSet().size

fun noAnagrams(s: List<String>) = s.map(String::sortAlphabetical).toSet().size == s.size

private fun String.sortAlphabetical()  = toCharArray().sorted().joinToString()

fun noAnagramsOrDupeWords(s: List<String>) = noAnagrams(s) && noDupeWords(s)