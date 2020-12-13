package tech.moussa.tafqeetk.converters

interface QuantitativeNumberConverterFactory {
    fun getConverter(tafqeetClass: String): QuantitativeNumberConverter
}