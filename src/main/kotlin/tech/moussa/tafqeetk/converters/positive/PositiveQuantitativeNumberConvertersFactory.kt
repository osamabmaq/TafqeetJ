package tech.moussa.tafqeetk.converters.positive

import tech.moussa.tafqeetk.converters.BasicNumberConverterFactory
import tech.moussa.tafqeetk.converters.QuantitativeNumberConverter
import tech.moussa.tafqeetk.converters.QuantitativeNumberConverterFactory
import tech.moussa.tafqeetk.numbers.QuantitativeNumberNames
import tech.moussa.tafqeetk.numbers.positive.PositiveQuantitativeNumberNamesFactory

class PositiveQuantitativeNumberConvertersFactory private constructor() : QuantitativeNumberConverterFactory {
    private val positivesFactory: PositiveQuantitativeNumberNamesFactory = PositiveQuantitativeNumberNamesFactory.getInstance()
    private var positiveConvertersMap: Map<String, QuantitativeNumberConverter> = mapOf(
        "thousands" to this.createQuantitativeConverter(this.positivesFactory.getThousands()),
        "millions" to this.createQuantitativeConverter(this.positivesFactory.getMillions()),
        "billions" to this.createQuantitativeConverter(this.positivesFactory.getBillions()),
        "trillions" to this.createQuantitativeConverter(this.positivesFactory.getTrillions())
    )

    override fun getConverter(tafqeetClass: String): QuantitativeNumberConverter {
        return if (this.positiveConvertersMap.containsKey(tafqeetClass)) {
            this.positiveConvertersMap.getOrElse(tafqeetClass) {
                throw IllegalArgumentException("There is no converter with name $tafqeetClass")
            }
        } else {
            throw IllegalArgumentException("There is no converter with name $tafqeetClass")
        }
    }

    private fun createQuantitativeConverter(names: QuantitativeNumberNames): QuantitativeNumberConverter {
        return QuantitativeNumberConverter(names, BasicNumberConverterFactory.positiveConverter)
    }

    companion object {
        private var instance: PositiveQuantitativeNumberConvertersFactory? = null

        @Synchronized
        fun getInstance(): PositiveQuantitativeNumberConvertersFactory {
            if (PositiveQuantitativeNumberConvertersFactory.instance == null) {
                PositiveQuantitativeNumberConvertersFactory.instance = PositiveQuantitativeNumberConvertersFactory()
            }
            return PositiveQuantitativeNumberConvertersFactory.instance!!
        }
    }
}