package tech.moussa.tafqeetk.converters

import tech.moussa.tafqeetk.numbers.NumberSign
import tech.moussa.tafqeetk.numbers.positive.PositiveBasicNumbersPlacesNames
import java.util.Objects
import kotlin.collections.ArrayList

class IntegerInWords {
    private var sign: NumberSign = NumberSign.POSITIVE
    private var trillions: String? = null
    private var billions: String? = null
    private var millions: String? = null
    private var thousands: String? = null
    private var basicNumberGroup: String? = null

    fun setTrillions(trillions: String?) {
        this.trillions = trillions
    }

    fun setBillions(billions: String?) {
        this.billions = billions
    }

    fun setMillions(millions: String?) {
        this.millions = millions
    }

    fun setThousands(thousands: String?) {
        this.thousands = thousands
    }

    fun setSign(sign: NumberSign) {
        this.sign = sign
    }

    fun setBasicNumberGroup(basicNumberGroup: String?) {
        this.basicNumberGroup = basicNumberGroup
    }

    fun isTrillionsPresent(): Boolean {
        return this.trillions != null && this.trillions!!.isNotEmpty()
    }

    fun isBillionsPresent(): Boolean {
        return this.billions != null && this.billions!!.isNotEmpty()
    }

    fun isMillionsPresent(): Boolean {
        return this.millions != null && this.millions!!.isNotEmpty()
    }

    fun isThousandsPresent(): Boolean {
        return this.thousands != null && this.thousands!!.isNotEmpty()
    }

    fun isBasicNumberGroupPresent(): Boolean {
        return this.basicNumberGroup != null && this.basicNumberGroup!!.isNotEmpty()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as IntegerInWords
        return (
            this.sign === that.sign &&
            this.trillions == that.trillions &&
            this.billions == that.billions &&
            this.millions == that.millions &&
            this.thousands == that.thousands &&
            this.basicNumberGroup == that.basicNumberGroup
        )
    }

    override fun hashCode(): Int {
        return Objects.hash(this.sign, this.trillions, this.billions, this.millions, this.thousands, this.basicNumberGroup)
    }

    override fun toString(): String {
        val numberInWords: MutableList<String> = ArrayList()
        if (isTrillionsPresent()) {
            numberInWords.add(this.trillions!!)
        }
        if (isBillionsPresent()) {
            numberInWords.add(this.billions!!)
        }
        if (isMillionsPresent()) {
            numberInWords.add(this.millions!!)
        }
        if (isThousandsPresent()) {
            numberInWords.add(this.thousands!!)
        }
        if (isBasicNumberGroupPresent()) {
            numberInWords.add(this.basicNumberGroup!!)
        }
        // TODO: Localization for different languages
        // TODO: replace join with kotlin version of it
        return "${if (this.sign === NumberSign.POSITIVE) "" else "سالب "}${java.lang.String.join(" و", numberInWords)}"
    }

    companion object {
        var ZERO: IntegerInWords = IntegerInWords()
        init {
            ZERO.setBasicNumberGroup(PositiveBasicNumbersPlacesNames.getInstance().getOnesMap()[0])
        }
    }
}