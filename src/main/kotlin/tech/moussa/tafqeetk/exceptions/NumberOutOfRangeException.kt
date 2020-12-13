package tech.moussa.tafqeetk.exceptions

import java.math.BigDecimal
import java.math.BigInteger

class NumberOutOfRangeException(
    number: Long
) : RuntimeException("Out of range value: $number") {
    constructor(number: BigInteger) : this(number.toLong())
    constructor(number: BigDecimal) : this(number.toLong())
    constructor(number: Double) : this(number.toLong())
}