package tech.moussa.tafqeetk.converters

import tech.moussa.tafqeetk.exceptions.NumberOutOfRangeException
import tech.moussa.tafqeetk.numbers.FractionalRatioNames
import tech.moussa.tafqeetk.numbers.NumberSign
import java.math.BigDecimal

class DecimalToWordsConverter private constructor() {
    private val converter: IntegerToWordsConverter = IntegerToWordsConverter.getInstance()

    fun convert(number: BigDecimal): DecimalInWords {
        if (TafqeetRangeChecker.isOutOfRange(number)) {
            throw NumberOutOfRangeException(number)
        }
        val numberLeftAndRight = number.toPlainString().split("\\.".toRegex()).toTypedArray()
        if (numberLeftAndRight.size == 2) {
            numberLeftAndRight[1] = this.removeTrailingZeroes(numberLeftAndRight[1])
        }
        return this.convertToDecimalInWords(numberLeftAndRight)
    }

    fun convert(number: Double): DecimalInWords {
        if (TafqeetRangeChecker.isOutOfRange(number)) {
            throw NumberOutOfRangeException(number)
        }
        val numberLeftAndRight = number.toString().split("\\.".toRegex()).toTypedArray()
        if (numberLeftAndRight.size == 2) {
            numberLeftAndRight[1] = this.removeTrailingZeroes(numberLeftAndRight[1])
        }
        return this.convertToDecimalInWords(numberLeftAndRight)
    }

    private fun removeTrailingZeroes(number: String): String {
        var end = number.length
        for (i in number.length - 1 downTo 1) {
            end = if (number[i] == '0') {
                i
            } else {
                break
            }
        }
        return number.substring(0, end)
    }

    private fun convertToDecimalInWords(numberLeftAndRight: Array<String>): DecimalInWords {
        val leftNumber = this.convertLeftNumber(numberLeftAndRight[0])
        val rightNumber = this.convertRightNumber(
                if (numberLeftAndRight.size == 2) {
                    numberLeftAndRight[1]
                } else {
                    "0"
                }
        )
        var fractionalLength = 0
        if (numberLeftAndRight.size == 2) {
            fractionalLength = numberLeftAndRight[1].length
        }
        return this.buildDecimalInWords(leftNumber, rightNumber, fractionalLength)
    }

    private fun convertLeftNumber(leftNumber: String): IntegerInWords {
        val number: IntegerInWords = this.converter.convert(leftNumber.toLong())
        if (leftNumber.startsWith("-")) {
            number.setSign(NumberSign.NEGATIVE)
        }
        return number
    }

    private fun convertRightNumber(rightNumber: String): IntegerInWords {
        //يرسل الرقم يمين الفاصلة العشرية كسالب ليعامل معاملة المضاف إليه ويجر
        val number = this.converter.convert("-$rightNumber".toLong())
        //يتم تعيين الإشارة الموجبة كي لا يتم وضع كلمة سالب قبل الرقم يمين الفاصلة العشرية
        number.setSign(NumberSign.POSITIVE)
        return number
    }

    private fun buildDecimalInWords(
            leftNumber: IntegerInWords,
            rightNumber: IntegerInWords,
            fractionalLength: Int
    ): DecimalInWords {
        val decimalInWords = DecimalInWords()
        decimalInWords.setNumberLeftDecimalPoint(leftNumber)
        decimalInWords.setNumberRightDecimalPoint(rightNumber)
        if (leftNumber.toString() != "") {
            decimalInWords.setFractionalRatioName(FractionalRatioNames.getRatio(fractionalLength))
        }
        return decimalInWords
    }

    companion object {
        private var instance: DecimalToWordsConverter? = null

        @Synchronized
        fun getInstance(): DecimalToWordsConverter {
            if (DecimalToWordsConverter.instance == null) {
                DecimalToWordsConverter.instance = DecimalToWordsConverter()
            }
            return DecimalToWordsConverter.instance!!
        }
    }
}