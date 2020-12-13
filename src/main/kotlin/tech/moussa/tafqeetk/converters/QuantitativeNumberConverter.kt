package tech.moussa.tafqeetk.converters

import tech.moussa.tafqeetk.numbers.NumberSign
import tech.moussa.tafqeetk.numbers.QuantitativeNumberNames
import tech.moussa.tafqeetk.numbers.ThreeDigitsNumber

class QuantitativeNumberConverter(
    private val quantitativeNumberNames: QuantitativeNumberNames,
    private val basicNumberConverter: BasicNumberConverter
) {
    fun convert(number: ThreeDigitsNumber): String {
        if (number.getNumber() == 0) {
            return ""
        }
        val numberInWords = StringBuilder()
        val disassembler = ThreeDigitsNumberDisassembler(number)
        var numberAfterHundredsConverting: Int = number.getNumber()
        if (number.containsHundreds()) {
            numberAfterHundredsConverting = number.getNumber() % 100
            if (disassembler.getHundreds() == 200 && numberAfterHundredsConverting < 3) {
                numberInWords.append(
                    this.getTwoHundredsWordDependingOnNumberSign(number.getSign())
                )
            } else {
                numberInWords.append(
                    this.basicNumberConverter.convertHundreds(disassembler.getHundreds())
                )
            }
        }
        if (numberAfterHundredsConverting < 3) {
            return this.convertNumberBetweenZeroAndTwo(
                    numberInWords,
                    numberAfterHundredsConverting
            )
        }
        if (numberInWords.isNotEmpty()) {
            // TODO: Localization for different languages
            numberInWords.append(" و")
        }
        return numberInWords.append(
            this.convertNumberBetweenThreeAndNinetyNine(
                ThreeDigitsNumber.of(numberAfterHundredsConverting, number.getSign())
            )
        ).toString()
    }

    private fun getTwoHundredsWordDependingOnNumberSign(sign: NumberSign): String {
        // TODO: Localization for different languages
        return if (sign === NumberSign.POSITIVE) "مئتا" else "مئتي"
    }

    private fun convertNumberBetweenZeroAndTwo(numberInWords: StringBuilder, number: Int): String {
        if (numberInWords.isNotEmpty()) {
            numberInWords.append(" ")
                    .append(this.quantitativeNumberNames.nameWhenEqualsOne) //هذا للمئات، من مثل مئة ألف أو تسعمئة مليون
        }
        if (number != 0 && numberInWords.isNotEmpty()) {
            // TODO: Localization for different languages
            numberInWords.append(" و")
        }
        if (number == 1) {
            numberInWords.append(
                    this.quantitativeNumberNames.nameWhenEqualsOne
            )
        } else if (number == 2) {
            numberInWords.append(
                    this.quantitativeNumberNames.nameWhenEqualsTwo
            )
        }
        return numberInWords.toString()
    }

    private fun convertNumberBetweenThreeAndNinetyNine(number: ThreeDigitsNumber): String {
        val disassembler = ThreeDigitsNumberDisassembler(number)
        return when {
            number.getNumber() < 10 -> {
                convertOnes(disassembler.getOnes())
            }
            number.getNumber() in 11..19 -> {
                convertComposedNumber(
                        disassembler.getComposedNumber()
                )
            }
            else -> {
                convertTensWithOnes(disassembler)
            }
        }
    }

    private fun convertOnes(ones: Int): String {
        return this.basicNumberConverter.convertOnes(ones) + " " + this.quantitativeNumberNames.nameWhenBetweenThreeAndTen
    }

    private fun convertComposedNumber(composedNumber: Int): String {
        return (this.basicNumberConverter.convertComposedNumbers(composedNumber)
                + " " + this.quantitativeNumberNames.nameWhenBetweenElevenAndNinetyNine)
    }

    private fun convertTensWithOnes(disassembler: ThreeDigitsNumberDisassembler): String {
        if (disassembler.getThreeDigitsNumber().getNumber() == 10) return convertTen()
        val numberInWords = StringBuilder()
        if (disassembler.getThreeDigitsNumber().containsOnes()) {
            // TODO: Localization for different languages
            numberInWords.append(
                    this.basicNumberConverter.convertOnes(
                            disassembler.getOnes()
                    )
            ).append(" و").append(this.basicNumberConverter.convertTens(disassembler.getTens()))
        } else {
            numberInWords.append(
                    this.basicNumberConverter.convertTens(disassembler.getTens())
            )
        }
        return numberInWords.append(" ")
            .append(this.quantitativeNumberNames.nameWhenBetweenElevenAndNinetyNine)
            .toString()
    }

    private fun convertTen(): String {
        return (this.basicNumberConverter.convertTens(10)
                + " " + this.quantitativeNumberNames.nameWhenBetweenThreeAndTen)
    }
}