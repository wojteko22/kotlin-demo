fun main(args: Array<String>) {
    showVariable()
    showValue()
}

private fun showVariable() {
    var name = "Wojtek" // String name = "Wojtek"
//    var name: String = "Wojtek"
    println(name)

    name = "Józek"
    println(name)
}

private fun showValue() {
    val age = 21 // final int age = 21
//    age = 22 // error
    println(age)
}