fun main(args: Array<String>) {

    val value = listOf(1, 2, 3)
        .map {
            println(it)
            it * 2
        }
        .first()
    println("first: $value")
    println("---------------------------")

//    val sequence = listOf(1, 2, 3).asSequence()
//        .map {
//            println(it)
//            it * 2
//        }
//    val sequence2 = sequenceOf(1, 2, 3)
//
//    println("first: ${sequence.firstOrNull()}")
//    println("first: ${sequence.firstOrNull()}")
}