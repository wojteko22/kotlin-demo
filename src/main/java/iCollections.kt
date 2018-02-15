fun main(args: Array<String>) {

    val list = listOf(1, 2)
//    list[0] = 9 // error

    val mutableList = mutableListOf(1, 2)
    val mutableList2 = list.toMutableList()
    mutableList[0] = 9
    println("mutated: $mutableList")

    val biggerList = list and mutableList
    println("bigger: $biggerList")
}

infix fun <T> List<T>.and(other: List<T>) = this + other