package me.twbarber.advent

typealias PasswordFile = List<String>
typealias Password = List<String>

fun PasswordFile.countValidPasswords(strategy: (Password) -> Boolean) =
    filter { strategy(it.split(" ")) }.size

fun noDupeWords(p: Password) = p.size == p.toSet().size
fun noAnagrams(p: Password) = p.map(String::sortAlphabetical).toSet().size == p.size
fun noAnagramsOrDupeWords(p: Password) = noAnagrams(p) && noDupeWords(p)

private fun String.sortAlphabetical() = toCharArray().sorted().joinToString()
