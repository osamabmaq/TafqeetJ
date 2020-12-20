package tech.moussa.tafqeetk.converters

import tech.moussa.tafqeetk.numbers.BasicNumberPlacesNames
import tech.moussa.tafqeetk.numbers.ThreeDigitsNumber

class BasicNumberConverter(
        private val basicNumberPlacesNames: BasicNumberPlacesNames
) {
    fun convert(number: ThreeDigitsNumber): String {
        val disassembler = ThreeDigitsNumberDisassembler(number)
        val numberInWords = StringBuilder()
        if (number.containsHundreds()) {
            numberInWords.append(convertHundreds(disassembler.getHundreds()))
            if (number.getNumber() % 100 == 0) {
                return numberInWords.toString()
            }
            // TODO: Localization for different languages
            numberInWords.append(" و")
        }
        if (number.containsComposedNumber()) {
            return numberInWords.append(convertComposedNumbers(disassembler.getComposedNumber()))
                    .toString()
        }
        if (number.containsOnes()) {
            numberInWords.append(convertOnes(disassembler.getOnes()))
        }
        if (number.containsTens()) {
            if (number.containsOnes()) {
                // TODO: Localization for different languages
                numberInWords.append(" و")
            }
            numberInWords.append(convertTens(disassembler.getTens()))
        }
        return numberInWords.toString()
    }

    fun convertOnes(number: Int): String? {
        return this.basicNumberPlacesNames.getOnesMap()[number]
    }

    fun convertComposedNumbers(number: Int): String? {
        return this.basicNumberPlacesNames.getComposedNumbersMap()[number]
    }

    fun convertTens(number: Int): String? {
        return this.basicNumberPlacesNames.getTensMap()[number]
    }

    fun convertHundreds(number: Int): String? {
        return this.basicNumberPlacesNames.getHundredsMap()[number]
    }
}