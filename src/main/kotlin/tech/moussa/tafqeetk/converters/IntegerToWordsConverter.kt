package tech.moussa.tafqeetk.converters

import tech.moussa.tafqeetk.exceptions.NumberOutOfRangeException
import tech.moussa.tafqeetk.numbers.NumberSign
import tech.moussa.tafqeetk.numbers.ThreeDigitsNumber
import java.math.BigInteger

class IntegerToWordsConverter private constructor() {
    private val divider = NumberToThreeDigitsNumberGroupsDivider()

    fun convert(number: Int): IntegerInWords {
        return this.convert(number.toLong())
    }

    fun convert(number: Byte): IntegerInWords {
        return this.convert(number.toLong())
    }

    fun convert(number: Short): IntegerInWords {
        return this.convert(number.toLong())
    }

    fun convert(number: BigInteger): IntegerInWords {
        if (TafqeetRangeChecker.isOutOfRange(number)) {
            throw NumberOutOfRangeException(number)
        }
        return this.convert(number.toLong())
    }

    fun convert(number: Long): IntegerInWords {
        if (TafqeetRangeChecker.isOutOfRange(number)) {
            throw NumberOutOfRangeException(number)
        }
        if (number == 0L) {
            return IntegerInWords.ZERO
        }
        val convertedNumber = this.convertNumber(this.divider.divide(number))
        if (number < 0) {
            convertedNumber.setSign(NumberSign.NEGATIVE)
        }
        return convertedNumber
    }

    private fun convertNumber(threeDigitsNumberMap: Map<String, ThreeDigitsNumber>): IntegerInWords {
        val integerInWords = IntegerInWords()
        integerInWords.setTrillions(this.convertThreeDigitsNumberIfPresent("trillions", threeDigitsNumberMap))
        integerInWords.setBillions(this.convertThreeDigitsNumberIfPresent("billions", threeDigitsNumberMap))
        integerInWords.setMillions(this.convertThreeDigitsNumberIfPresent("millions", threeDigitsNumberMap))
        integerInWords.setThousands(this.convertThreeDigitsNumberIfPresent("thousands", threeDigitsNumberMap))
        integerInWords.setBasicNumberGroup(this.convertBasicNumberIfPresent(threeDigitsNumberMap))
        return integerInWords
    }

    private fun convertBasicNumberIfPresent(threeDigitsNumberMap: Map<String, ThreeDigitsNumber>): String {
        if (threeDigitsNumberMap.containsKey("basicNumberGroup")) {
            val number: ThreeDigitsNumber = threeDigitsNumberMap.getOrElse("basicNumberGroup") {
                return ""
            }
            return number.getSign().numberConverter.convert(number)
        }
        return ""
    }

    private fun convertThreeDigitsNumberIfPresent(numberGroupName: String, threeDigitsNumberMap: Map<String, ThreeDigitsNumber>): String {
        if (threeDigitsNumberMap.containsKey(numberGroupName)) {
            val number: ThreeDigitsNumber = threeDigitsNumberMap.getOrElse(numberGroupName) {
                return ""
            }
            return number.getSign().value.getConverter(numberGroupName).convert(number)
        }
        return ""
    }

    companion object {
        private var instance: IntegerToWordsConverter? = null

        @Synchronized
        fun getInstance(): IntegerToWordsConverter {
            if (IntegerToWordsConverter.instance == null) {
                IntegerToWordsConverter.instance = IntegerToWordsConverter()
            }
            return IntegerToWordsConverter.instance!!
        }
    }
}