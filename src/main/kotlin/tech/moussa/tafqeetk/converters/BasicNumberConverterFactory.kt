package tech.moussa.tafqeetk.converters

import tech.moussa.tafqeetk.numbers.negative.NegativeBasicNumberPlacesNames
import tech.moussa.tafqeetk.numbers.positive.PositiveBasicNumbersPlacesNames

object BasicNumberConverterFactory {
    val positiveConverter = BasicNumberConverter(PositiveBasicNumbersPlacesNames.getInstance())
    val negativeConverter = BasicNumberConverter(NegativeBasicNumberPlacesNames.getInstance())
}