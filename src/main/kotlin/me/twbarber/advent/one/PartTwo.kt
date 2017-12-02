package me.twbarber.advent.one

/*
fun main(args: Array<String>) {
    var sum = 0
    val list = input.split("").filter { it != "" }
    println(list.size)
    list.indices
            .forEach {
                if(it < list.size && list[it] == list[getIndex(it, list.size)]) {
                    println("${list[it]} ${list[getIndex(it, list.size)]}")
                    sum += list[it].toInt()
                }
            }
            .also {  println(sum) }
}
*/

fun main2(input: String) {
    val list = input.split("").filter { n -> n != "" }
    println(list.indices
            .filter { it < list.size - 1 && list[it] == list[it + 1] }
            .map { it -> list[it].toInt() }
            .sum())

}


fun getIndex(currentIndex: Int, size: Int) : Int {
    val opposite = currentIndex + (size / 2)
    return when  (opposite > size - 1) {
        true -> {
            println("TRUE $currentIndex ${opposite - size}")
            opposite - size
        }
        false -> {
            println("FALSE $currentIndex $opposite")
            opposite
        }
    }
}