import java.math.BigDecimal

fun Int.pow(exponent: Int): Int =
    if (exponent == 0)
        1
    else
        this * pow(exponent - 1)

val Int.bd
    get() = BigDecimal(this)

fun main(args: Array<String>) {
    val power = 2.pow(5)
    print(power)

    9999.bd
}