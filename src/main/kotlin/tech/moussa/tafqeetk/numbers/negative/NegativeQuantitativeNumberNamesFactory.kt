package tech.moussa.tafqeetk.numbers.negative

import tech.moussa.tafqeetk.numbers.QuantitativeNumberNamesFactory

class NegativeQuantitativeNumberNamesFactory private constructor(): QuantitativeNumberNamesFactory() {
    companion object {
        private var instance: NegativeQuantitativeNumberNamesFactory? = null

        @Synchronized
        fun getInstance(): NegativeQuantitativeNumberNamesFactory {
            if (NegativeQuantitativeNumberNamesFactory.instance == null) {
                NegativeQuantitativeNumberNamesFactory.instance =
                        NegativeQuantitativeNumberNamesFactory()
            }
            return NegativeQuantitativeNumberNamesFactory.instance!!
        }
    }
}