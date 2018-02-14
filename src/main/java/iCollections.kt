fun main(args: Array<String>) {

    val filteredList = listOf(1, 2)
//    filteredCollection[0] = 9 // error

    val mutableCollection = filteredList.toMutableList()
    mutableCollection[0] = 9
    println("mutated: $mutableCollection")

    val biggerList = filteredList + filteredList
    println("bigger: $biggerList")
}
