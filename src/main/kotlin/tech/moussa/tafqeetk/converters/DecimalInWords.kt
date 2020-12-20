package tech.moussa.tafqeetk.converters

import java.util.*

class DecimalInWords {
    private var numberLeftDecimalPoint: IntegerInWords? = null
    private var numberRightDecimalPoint: IntegerInWords? = null
    private var fractionalRatioName: String? = null

    fun setNumberLeftDecimalPoint(numberLeftDecimalPoint: IntegerInWords?) {
        this.numberLeftDecimalPoint = numberLeftDecimalPoint
    }

    fun setNumberRightDecimalPoint(numberRightDecimalPoint: IntegerInWords?) {
        this.numberRightDecimalPoint = numberRightDecimalPoint
    }

    fun setFractionalRatioName(decimalLengthName: String?) {
        this.fractionalRatioName = decimalLengthName
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DecimalInWords
        return (
            this.numberLeftDecimalPoint!! == that.numberLeftDecimalPoint &&
            this.numberRightDecimalPoint!! == that.numberRightDecimalPoint &&
            this.fractionalRatioName == that.fractionalRatioName
        )
    }

    override fun hashCode(): Int {
        return Objects.hash(this.numberLeftDecimalPoint, this.numberRightDecimalPoint, this.fractionalRatioName)
    }

    override fun toString(): String {
        val numberInWords = StringBuilder()
        numberInWords.append(this.numberLeftDecimalPoint.toString())
        // TODO: Localization for different languages
        numberInWords.append(" فاصلة ").append(this.numberRightDecimalPoint.toString())
        if (this.numberRightDecimalPoint!! != IntegerInWords.ZERO) {
            numberInWords.append(" ").append(this.fractionalRatioName)
        }
        return numberInWords.toString()
    }
}