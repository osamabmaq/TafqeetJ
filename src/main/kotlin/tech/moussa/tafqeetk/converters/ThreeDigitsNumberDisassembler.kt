package tech.moussa.tafqeetk.converters

import tech.moussa.tafqeetk.numbers.ThreeDigitsNumber

class ThreeDigitsNumberDisassembler(
    private val threeDigitsNumber: ThreeDigitsNumber
) {
    fun getThreeDigitsNumber(): ThreeDigitsNumber {
        return this.threeDigitsNumber
    }

    fun getHundreds(): Int {
        check(this.threeDigitsNumber.containsHundreds()) { "Number does not contain hundreds" }
        return this.threeDigitsNumber.getNumber() / 100 * 100
    }

    fun getTens(): Int {
        check(this.threeDigitsNumber.containsTens()) { "Number does not contain tens" }
        return this.threeDigitsNumber.getNumber() % 100 / 10 * 10
    }

    fun getComposedNumber(): Int {
        check(this.threeDigitsNumber.containsComposedNumber()) { "Number does not contain composed number" }
        return this.threeDigitsNumber.getNumber() % 100
    }

    fun getOnes(): Int {
        check(this.threeDigitsNumber.containsOnes()) { "Number does not contain ones" }
        return this.threeDigitsNumber.getNumber() % 100 % 10
    }
}