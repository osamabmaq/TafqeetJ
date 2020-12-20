package tech.moussa.tafqeetk.converters

import java.math.BigDecimal
import java.math.BigInteger

class Tafqeet private constructor(){
    private val integerConverter = IntegerToWordsConverter.getInstance()
    private val decimalConverter = DecimalToWordsConverter.getInstance()

    fun doTafqeet(number: Int): String {
        return this.integerConverter.convert(number).toString()
    }

    fun doTafqeet(number: Byte): String {
        return this.integerConverter.convert(number).toString()
    }

    fun doTafqeet(number: Short): String {
        return this.integerConverter.convert(number).toString()
    }

    fun doTafqeet(number: Long): String {
        return this.integerConverter.convert(number).toString()
    }

    fun doTafqeet(number: BigInteger): String {
        return this.integerConverter.convert(number).toString()
    }

    fun doTafqeet(number: BigDecimal): String {
        return this.decimalConverter.convert(number).toString()
    }

    fun doTafqeet(number: Double): String {
        return this.decimalConverter.convert(number).toString()
    }

    companion object {
        private var instance: Tafqeet? = null

        @Synchronized
        fun getInstance(): Tafqeet {
            if (Tafqeet.instance == null) {
                Tafqeet.instance = Tafqeet()
            }
            return Tafqeet.instance!!
        }
    }
}