package tech.moussa.tafqeetk.numbers

import tech.moussa.tafqeetk.converters.BasicNumberConverter
import tech.moussa.tafqeetk.converters.BasicNumberConverterFactory
import tech.moussa.tafqeetk.converters.QuantitativeNumberConverterFactory
import tech.moussa.tafqeetk.converters.negative.NegativeQuantitativeNumberConvertersFactory
import tech.moussa.tafqeetk.converters.positive.PositiveQuantitativeNumberConvertersFactory

import java.math.BigDecimal
import java.math.BigInteger

enum class NumberSign(
        val value: QuantitativeNumberConverterFactory,
        val numberConverter: BasicNumberConverter
) {
    POSITIVE(
            PositiveQuantitativeNumberConvertersFactory.getInstance(),
            BasicNumberConverterFactory.positiveConverter
    ),
    NEGATIVE(
            NegativeQuantitativeNumberConvertersFactory.getInstance(),
            BasicNumberConverterFactory.negativeConverter
    );

    companion object {
        fun signOf(number: Int): NumberSign {
            return if (number >= 0) POSITIVE else NEGATIVE
        }

        fun signOf(number: Long): NumberSign {
            return if (number >= 0L) POSITIVE else NEGATIVE
        }

        fun signOf(number: Short): NumberSign {
            return if (number >= 0) POSITIVE else NEGATIVE
        }

        fun signOf(number: Byte): NumberSign {
            return if (number >= 0) POSITIVE else NEGATIVE
        }

        fun signOf(number: BigInteger): NumberSign {
            return if (number.signum() >= 0) POSITIVE else NEGATIVE
        }

        fun signOf(number: BigDecimal): NumberSign {
            return if (number.signum() >= 0) POSITIVE else NEGATIVE
        }
    }
}