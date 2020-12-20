package tech.moussa.tafqeetk.numbers.positive

import tech.moussa.tafqeetk.numbers.BasicNumberPlacesNames

class PositiveBasicNumbersPlacesNames private constructor(): BasicNumberPlacesNames() {
    companion object {
        private var instance: PositiveBasicNumbersPlacesNames? = null

        @Synchronized
        fun getInstance(): PositiveBasicNumbersPlacesNames {
            if (PositiveBasicNumbersPlacesNames.instance == null) {
                PositiveBasicNumbersPlacesNames.instance =
                        PositiveBasicNumbersPlacesNames()
            }
            return PositiveBasicNumbersPlacesNames.instance!!
        }
    }
}