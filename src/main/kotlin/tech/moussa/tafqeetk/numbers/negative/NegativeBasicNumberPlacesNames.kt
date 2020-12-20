package tech.moussa.tafqeetk.numbers.negative

import tech.moussa.tafqeetk.numbers.BasicNumberPlacesNames

class NegativeBasicNumberPlacesNames private constructor(): BasicNumberPlacesNames() {
    companion object {
        private var instance: NegativeBasicNumberPlacesNames? = null

        @Synchronized
        fun getInstance(): NegativeBasicNumberPlacesNames {
            if (NegativeBasicNumberPlacesNames.instance == null) {
                NegativeBasicNumberPlacesNames.instance =
                        NegativeBasicNumberPlacesNames()
            }
            return NegativeBasicNumberPlacesNames.instance!!
        }
    }
}