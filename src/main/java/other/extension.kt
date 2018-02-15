package other

fun Int.pow(exponent: Int): Int =
    if (exponent == 0)
        1
    else
        this * pow(exponent - 1)
