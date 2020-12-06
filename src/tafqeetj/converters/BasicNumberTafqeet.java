package tafqeetj.converters;

import tafqeetj.numbers.BasicNumberPlacesNames;
import tafqeetj.numbers.ThreeDigitsNumber;

public class BasicNumberTafqeet {
    private final BasicNumberPlacesNames basicNumberPlacesNames;

    public BasicNumberTafqeet(BasicNumberPlacesNames basicNumberPlacesNames) {
        this.basicNumberPlacesNames = basicNumberPlacesNames;
    }

    public String convert(ThreeDigitsNumber threeDigitsNumber) {
        ThreeDigitsNumberDisassembler numberDisassembler = new ThreeDigitsNumberDisassembler(threeDigitsNumber);
        StringBuilder numberInWords = new StringBuilder();
        if (threeDigitsNumber.containsHundreds()) {
            numberInWords.append(convertHundreds(numberDisassembler.getHundreds()));
            if (threeDigitsNumber.getNumber() % 100 == 0)
                return numberInWords.toString();
        }

        if (numberInWords.length() != 0)
            numberInWords.append(" و");

        if (threeDigitsNumber.containsComposedNumber())
            return numberInWords.append(convertComposedNumbers(numberDisassembler.getComposedNumber()))
                    .toString();

        if (threeDigitsNumber.containsOnes())
            numberInWords.append(convertOnes(numberDisassembler.getOnes()));

        if (threeDigitsNumber.containsTens()) {
            if (threeDigitsNumber.containsOnes())
                numberInWords.append(" و");
            numberInWords.append(convertTens(numberDisassembler.getTens()));
        }
        return numberInWords.toString();
    }

    public String convertOnes(int number) {
        if (!basicNumberPlacesNames.getOnesMap().containsKey(number))
            throw new IllegalArgumentException(number + " is not a one");
        return basicNumberPlacesNames.getOnesMap().get(number);
    }

    public String convertComposedNumbers(int number) {
        if (!basicNumberPlacesNames.getComposedNumbersMap().containsKey(number))
            throw new IllegalArgumentException(number + " is not a composed number");
        return basicNumberPlacesNames.getComposedNumbersMap().get(number);
    }

    public String convertTens(int number) {
        if (!basicNumberPlacesNames.getTensMap().containsKey(number))
            throw new IllegalArgumentException(number + " is not a ten");
        return basicNumberPlacesNames.getTensMap().get(number);
    }

    public String convertHundreds(int number) {
        if (!basicNumberPlacesNames.getHundredsMap().containsKey(number))
            throw new IllegalArgumentException(number + " is not a hundred");
        return basicNumberPlacesNames.getHundredsMap().get(number);
    }
}