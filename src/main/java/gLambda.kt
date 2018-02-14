val sum: (Int, Int) -> Int = { x, y -> x + y }
val sum2 = { x: Int, y: Int -> x + y }

fun main(args: Array<String>) {
    println("sum1: ${sum(1, 2)}, sum2: ${sum2(1, 2)}")

    val filteredCollection = listOf(1, 2, 3, 4).filter({ it > 2 }) // todo: nawiasy
    print(filteredCollection)
}
