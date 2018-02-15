fun main(args: Array<String>) {
//    val wrongNullableName: String = null // error
    val nullableName: String? = null

    val name = "Asia"
    val length = name.length
    println("First: $length")

//    val wrongLength = nullableName.length // error

    val nullableLength = nullableName?.length
//    val dangerousLength = nullableName!!.length
    println("Second: $nullableLength")

    val length2 = nullableName?.length ?: -1
    println("Third: $length2")

    if (nullableName != null) {
        val length3 = nullableName.length
        println("Fourth: $length3")
    }

    nullableName?.let { println(it) }
}