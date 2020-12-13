package tech.moussa.tafqeetk.converters.negative

import tech.moussa.tafqeetk.converters.BasicNumberConverterFactory
import tech.moussa.tafqeetk.converters.QuantitativeNumberConverter
import tech.moussa.tafqeetk.converters.QuantitativeNumberConverterFactory
import tech.moussa.tafqeetk.numbers.QuantitativeNumberNames
import tech.moussa.tafqeetk.numbers.QuantitativeNumberNamesFactory
import tech.moussa.tafqeetk.numbers.negative.NegativeQuantitativeNumberNamesFactory

class NegativeQuantitativeNumberConvertersFactory private constructor(): QuantitativeNumberConverterFactory {
    private val negativesFactory: QuantitativeNumberNamesFactory = NegativeQuantitativeNumberNamesFactory.getInstance()
    private var negativeConvertersMap: Map<String, QuantitativeNumberConverter> = mapOf(
        "thousands" to this.createQuantitativeConverter(this.negativesFactory.getThousands()),
        "millions" to this.createQuantitativeConverter(this.negativesFactory.getMillions()),
        "billions" to this.createQuantitativeConverter(this.negativesFactory.getBillions()),
        "trillions" to this.createQuantitativeConverter(this.negativesFactory.getTrillions())
    )

    override fun getConverter(tafqeetClass: String): QuantitativeNumberConverter {
        return if (this.negativeConvertersMap.containsKey(tafqeetClass)) {
            this.negativeConvertersMap.getOrElse(tafqeetClass) {
                throw IllegalArgumentException("There is no converter with name $tafqeetClass")
            }
        } else {
            throw IllegalArgumentException("There is no converter with name $tafqeetClass")
        }
    }

    private fun createQuantitativeConverter(names: QuantitativeNumberNames): QuantitativeNumberConverter {
        return QuantitativeNumberConverter(names, BasicNumberConverterFactory.negativeConverter)
    }

    companion object {
        private var instance: NegativeQuantitativeNumberConvertersFactory? = null

        @Synchronized
        fun getInstance(): NegativeQuantitativeNumberConvertersFactory {
            if (NegativeQuantitativeNumberConvertersFactory.instance == null) {
                NegativeQuantitativeNumberConvertersFactory.instance = NegativeQuantitativeNumberConvertersFactory()
            }
            return NegativeQuantitativeNumberConvertersFactory.instance!!
        }
    }
}