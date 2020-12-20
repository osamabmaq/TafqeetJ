package tech.moussa.tafqeetk.converters

import java.math.BigDecimal
import java.math.BigInteger
import kotlin.math.abs

class TafqeetRangeChecker private constructor() {
    companion object {
        private const val INT_PRIMITIVES_MIN_SUPPORTED_VALUE = -999999999999999L
        private const val INT_PRIMITIVES_MAX_SUPPORTED_VALUE = 999999999999999L
        private val BI_MIN_ACCEPTED_VALUE = BigInteger.valueOf(INT_PRIMITIVES_MIN_SUPPORTED_VALUE)
        private val BI_MAX_ACCEPTED_VALUE = BigInteger.valueOf(INT_PRIMITIVES_MAX_SUPPORTED_VALUE)
        private const val MAX_NUM_OF_DIGITS_LEFT_DECIMAL_POINT = 15
        private const val MAX_NUM_OF_DIGITS_RIGHT_DECIMAL_POINT = 15

        fun isOutOfRange(number: Int): Boolean {
            return false //All int datatype values are in the range
        }

        fun isOutOfRange(number: Byte): Boolean {
            return false //All byte datatype values are in the range
        }

        fun isOutOfRange(number: Short): Boolean {
            return false //All false datatype values are in the range
        }

        fun isOutOfRange(number: Long): Boolean {
            return number < TafqeetRangeChecker.INT_PRIMITIVES_MIN_SUPPORTED_VALUE || number > TafqeetRangeChecker.INT_PRIMITIVES_MAX_SUPPORTED_VALUE
        }

        fun isOutOfRange(number: BigInteger): Boolean {
            return number < TafqeetRangeChecker.BI_MIN_ACCEPTED_VALUE || number > TafqeetRangeChecker.BI_MAX_ACCEPTED_VALUE
        }

        fun isOutOfRange(number: BigDecimal): Boolean {
            val numberLeftAndRight = number.abs().toPlainString().split("\\.".toRegex()).toTypedArray()
            return if (numberLeftAndRight[0].length > TafqeetRangeChecker.MAX_NUM_OF_DIGITS_LEFT_DECIMAL_POINT) true else numberLeftAndRight.size == 2
                    && removeTrailingZeroes(numberLeftAndRight[1]).length > TafqeetRangeChecker.MAX_NUM_OF_DIGITS_RIGHT_DECIMAL_POINT
        }

        fun isOutOfRange(number: Double): Boolean {
            val numberLeftAndRight = abs(number).toString().split("\\.".toRegex()).toTypedArray()
            return if (numberLeftAndRight[0].length > TafqeetRangeChecker.MAX_NUM_OF_DIGITS_LEFT_DECIMAL_POINT) true else numberLeftAndRight.size == 2
                    && removeTrailingZeroes(numberLeftAndRight[1]).length > TafqeetRangeChecker.MAX_NUM_OF_DIGITS_RIGHT_DECIMAL_POINT
        }

        private fun removeTrailingZeroes(number: String): String {
            var end = number.length
            for (i in number.length - 1 downTo 1) end = if (number[i] == '0') i else break
            return number.substring(0, end)
        }
    }
}