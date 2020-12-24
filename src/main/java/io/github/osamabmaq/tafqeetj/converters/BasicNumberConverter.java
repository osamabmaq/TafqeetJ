package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.BasicNumberPlacesNames;
import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;

public class BasicNumberConverter {
    private final BasicNumberPlacesNames basicNumberPlacesNames;

    public BasicNumberConverter(BasicNumberPlacesNames basicNumberPlacesNames) {
        this.basicNumberPlacesNames = basicNumberPlacesNames;
    }

    public String convert(ThreeDigitsNumber number) {
        ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
        StringBuilder numberInWords = new StringBuilder();
        if (number.containsHundreds()) {
            numberInWords.append(convertHundreds(disassembler.getHundreds()));
            if (number.getNumber() % 100 == 0)
                return numberInWords.toString();
            numberInWords.append(" و");
        }

        if (number.containsComposedNumber())
            return numberInWords.append(convertComposedNumbers(disassembler.getComposedNumber())).toString();

        if (number.containsOnes())
            numberInWords.append(convertOnes(disassembler.getOnes()));

        if (number.containsTens()) {
            if (number.containsOnes())
                numberInWords.append(" و");
            numberInWords.append(convertTens(disassembler.getTens()));
        }
        return numberInWords.toString();
    }

    public String convertOnes(int number) {
        return basicNumberPlacesNames.getOnesMap().get(number);
    }

    public String convertComposedNumbers(int number) {
        return basicNumberPlacesNames.getComposedNumbersMap().get(number);
    }

    public String convertTens(int number) {
        return basicNumberPlacesNames.getTensMap().get(number);
    }

    public String convertHundreds(int number) {
        return basicNumberPlacesNames.getHundredsMap().get(number);
    }
}