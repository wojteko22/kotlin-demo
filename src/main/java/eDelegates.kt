interface Base {
    val property: String
    fun foo(number: Number): String
    fun bar()
}

class Derived(override val property: String) : Base {
    override fun foo(number: Number): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class MagicDecorator(private val otherBase: Base) : Base /*by otherBase */{

    override val property: String = otherBase.property

    override fun foo(number: Number): String = otherBase.foo(number)

    override fun bar() {
        otherBase.bar()
    }

    fun doMagic() {
        println("It's a kind of magic")
    }
}

fun main(args: Array<String>) {
    val base: Base = Derived("a")
    val decorated = MagicDecorator(base)
    println(decorated.property)
}

