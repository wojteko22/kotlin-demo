class Person(val name: String, val age: Int) { // todo: data
    init {
        println("init")
    }

    constructor(message: String): this("Maciek", 21) {
        println(message)
    }

    var height = 1.8
        private set

    var points = 0
        get() {
            println("get")
            return field
        }
        set(value) {
            println("set")
            field = value
        }

//    lateinit var notInitialized: String
}


val person = Person("Maciek", 21)

private val testEquals = person == Person("Maciek", 21)

fun main(args: Array<String>) {
    println("main")
    person.points = 20
    println("points: ${person.points}")
    println("toString: $person")
    println("equals: $testEquals")

//    val (name, age) = person
//    val newPerson = person.copy(age = 22)
//    println("copied: $newPerson")

//    print(person.notInitialized)
}
