package tech.moussa.tafqeetk.numbers.positive

import tech.moussa.tafqeetk.numbers.QuantitativeNumberNamesFactory

class PositiveQuantitativeNumberNamesFactory private constructor(): QuantitativeNumberNamesFactory() {
    companion object {
        private var instance: PositiveQuantitativeNumberNamesFactory? = null

        @Synchronized
        fun getInstance(): PositiveQuantitativeNumberNamesFactory {
            if (PositiveQuantitativeNumberNamesFactory.instance == null) {
                PositiveQuantitativeNumberNamesFactory.instance =
                        PositiveQuantitativeNumberNamesFactory()
            }
            return PositiveQuantitativeNumberNamesFactory.instance!!
        }
    }
}