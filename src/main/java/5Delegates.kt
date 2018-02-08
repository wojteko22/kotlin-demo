interface Base {
    val a: String
    fun b(number: Number): String
    fun c()
}

class MagicDecorator(private val otherBase: Base) : Base {

    override val a: String
        get() = otherBase.a

    override fun b(number: Number): String = otherBase.b(number)

    override fun c() {
        otherBase.c()
    }

    fun doMagic() {
        println("It's a kind of magic")
    }
}

