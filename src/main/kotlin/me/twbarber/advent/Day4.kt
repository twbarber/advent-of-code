package me.twbarber.advent

typealias PasswordFile = List<String>
typealias Password = List<String>

fun PasswordFile.countValidPasswords(strategy: (List<String>) -> Boolean) =
    filter { strategy(it.split(" ")) }.size

fun noDupeWords(p: Password) = p.size == p.toSet().size

fun noAnagrams(p: Password) = p.map(String::sortAlphabetical).toSet().size == p.size

private fun String.sortAlphabetical() = toCharArray().sorted().joinToString()

fun noAnagramsOrDupeWords(s: List<String>) = noAnagrams(s) && noDupeWords(s)