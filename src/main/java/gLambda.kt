val sum: (Int, Int) -> Int = { x, y -> x + y }
val sum2 = { x: Int, y: Int -> x + y }

fun main(args: Array<String>) {
    println("sum1: ${sum(1, 2)}, sum2: ${sum2(1, 2)}")

    val filteredCollection1 = listOf(1, 2, 3, 4).filter({ element -> element > 2 })
    val filteredCollection2 = listOf(1, 2, 3, 4).filter({ it > 2 })
    val filteredCollection3 = listOf(1, 2, 3, 4).filter { it > 2 }
    val filteredCollection4 = listOf(1, 2, 3, 4).filter(::greaterThanTwo)

    println(filteredCollection1)
    println(filteredCollection2)
    println(filteredCollection3)
    println(filteredCollection4)
}

fun greaterThanTwo(number: Int) = number > 2