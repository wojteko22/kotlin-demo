val somethingHard by lazy {
    println("computing")
    2 + 2 * 2
}

fun main(args: Array<String>) {
    println(somethingHard)
    println(somethingHard)
}