class Person(val name: String, val age: Int) {
    init {
        println("init")
    }

    var height = 1.8
        private set

    var points = 0
        get() {
            println("get")
            return field
        }
        set(value) {
            field = value + 1
        }
}


val person = Person("Maciek", 21)

private val testEquals = person == Person("Maciek", 21)

//lateinit var notInitializedPerson: Person

fun main(args: Array<String>) {
    person.points = 20
    println("age is ${person.points}")
    println("toString: $person")
    println("equals $testEquals")

//    print(notInitializedPerson.age)
//    val (name, age) = person
}
