fun main(args: Array<String>) {

    val value = listOf(1, 2, 3)
        .map {
            println(it)
            it * 2
        }
        .first()
    println("first: $value")

//    val stream = listOf(1, 2, 3).asSequence()
//        .map {
//            println(it)
//            it * 2
//        }
//
//    println("first: ${stream.firstOrNull()}")
//    println("first: ${stream.firstOrNull()}")
}