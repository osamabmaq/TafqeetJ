package tech.moussa.tafqeetk.numbers

import java.util.Objects

class ThreeDigitsNumber(
    private val number: Int = 0,
    private val sign: NumberSign = NumberSign.POSITIVE
) {
    init {
        require(!(this.number < 0 || this.number > 999)) { "Number must be between 0 and 999 inclusive: $number" }
    }

    fun getNumber(): Int {
        return this.number
    }

    fun getSign(): NumberSign {
        return this.sign
    }

    fun containsHundreds(): Boolean {
        return this.number / 100 != 0
    }

    fun containsTens(): Boolean {
        return this.number % 100 / 10 != 0
    }

    fun containsOnes(): Boolean {
        return this.number % 100 % 10 != 0
    }

    fun containsComposedNumber(): Boolean {
        return containsTens() && containsOnes() && number % 100 / 10 == 1
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ThreeDigitsNumber
        return this.number == that.number
    }

    override fun hashCode(): Int {
        return Objects.hash(this.number)
    }

    override fun toString(): String {
        return "ThreeDigitsNumber{" +
                "number=" + this.number +
                '}'
    }

    companion object {
        fun of(number: Int, sign: NumberSign): ThreeDigitsNumber {
            return ThreeDigitsNumber(number, sign)
        }
    }
}