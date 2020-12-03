package tafqeetj.converters;

import tafqeetj.numbers.BasicNumbersPLacesNamesMapsFactory;
import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.ThreeDigitsNumber;

public class QuantitiveNumberToWordsConverter {
    private final QuantitiveNumberNames quantitiveNumberNames;

    public QuantitiveNumberToWordsConverter(QuantitiveNumberNames quantitiveNumberNames) {
        this.quantitiveNumberNames = quantitiveNumberNames;
    }

    public String convert(ThreeDigitsNumber threeDigitsNumber) {
        StringBuilder numberInWords = new StringBuilder();
        ThreeDigitsNumberDisassembler numberDisassembler = new ThreeDigitsNumberDisassembler(threeDigitsNumber);
        int numberAfterHundredsConverting = threeDigitsNumber.getNumber();

        if (threeDigitsNumber.containsHundreds()) {
            numberAfterHundredsConverting = threeDigitsNumber.getNumber() % 100;
            if (numberDisassembler.getHundreds() == 200 && numberAfterHundredsConverting < 3)
                numberInWords.append("مئتا");
            else
                numberInWords.append(convertHundreds(numberDisassembler.getHundreds()));
        }

        if (numberAfterHundredsConverting < 3)
            return convertNumberBetweenZeroAndTwo(numberInWords, numberAfterHundredsConverting);

        if (numberInWords.length() != 0)
            numberInWords.append(" و");
        numberInWords.append(convertNumberBetweenThreeAndNinetyNine(numberAfterHundredsConverting));
        return numberInWords.toString();
    }

    private String convertNumberBetweenZeroAndTwo(StringBuilder numberInWords, int number) {
        if (number == 0)
            numberInWords.append(" ")
                    .append(quantitiveNumberNames.getNameWhenEqualsOne());
        else if (number == 1) {
            if (numberInWords.length() != 0)
                numberInWords.append(" ")
                        .append(quantitiveNumberNames.getNameWhenEqualsOne())
                        .append(" و");
            numberInWords.append(quantitiveNumberNames.getNameWhenEqualsOne());
        } else if (number == 2) {
            if (numberInWords.length() != 0)
                numberInWords.append(" ")
                        .append(quantitiveNumberNames.getNameWhenEqualsOne())
                        .append(" و");
            numberInWords.append(quantitiveNumberNames.getNameWhenEqualsTwo());
        }
        return numberInWords.toString();
    }

    private String convertNumberBetweenThreeAndNinetyNine(int number) {
        StringBuilder numberInWords = new StringBuilder();
        ThreeDigitsNumberDisassembler numberDisassembler =
                new ThreeDigitsNumberDisassembler(ThreeDigitsNumber.of(number));
        if (number > 2 && number < 10)
            numberInWords.append(convertOnes(numberDisassembler.getOnes()))
                    .append(" ")
                    .append(quantitiveNumberNames.getNameWhenBetweenThreeAndTen());
        else if (number == 10)
            numberInWords.append(convertTens(10))
                    .append(" ")
                    .append(quantitiveNumberNames.getNameWhenBetweenThreeAndTen());
        else if (number > 10 && number < 20)
            numberInWords.append(convertComposedNumbers(numberDisassembler.getComposedNumber()))
                    .append(" ")
                    .append(quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine());
        else if (number > 19) {
            if (numberDisassembler.getThreeDigitsNumber().containsOnes())
                numberInWords.append(convertOnes(numberDisassembler.getOnes()))
                        .append(" و")
                        .append(convertTens(numberDisassembler.getTens()));
            else numberInWords.append(convertTens(numberDisassembler.getTens()));
            numberInWords.append(" ")
                    .append(quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine());
        }
        return numberInWords.toString();
    }

    private String convertHundreds(int hundreds) {
        return BasicNumbersPLacesNamesMapsFactory.getHundreds().get(hundreds);
    }

    private String convertTens(int tens) {
        return BasicNumbersPLacesNamesMapsFactory.getTens().get(tens);
    }

    private String convertOnes(int ones) {
        return BasicNumbersPLacesNamesMapsFactory.getOnes().get(ones);
    }

    private String convertComposedNumbers(int composedNumber) {
        return BasicNumbersPLacesNamesMapsFactory.getComposedNumbers().get(composedNumber);
    }
}