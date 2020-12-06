package tafqeetj.converters;

import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.ThreeDigitsNumber;

public class QuantitiveNumberToWordsConverter {
    private final QuantitiveNumberNames quantitiveNumberNames;
    private final BasicNumberTafqeet basicNumberConverter;

    public QuantitiveNumberToWordsConverter(QuantitiveNumberNames quantitiveNumberNames,
                                            BasicNumberTafqeet basicNumberConverter) {
        this.quantitiveNumberNames = quantitiveNumberNames;
        this.basicNumberConverter = basicNumberConverter;
    }

    public String convert(ThreeDigitsNumber threeDigitsNumber) {
        if (threeDigitsNumber.getNumber() == 0)
            return "";
        StringBuilder numberInWords = new StringBuilder();
        ThreeDigitsNumberDisassembler numberDisassembler = new ThreeDigitsNumberDisassembler(threeDigitsNumber);
        int numberAfterHundredsConverting = threeDigitsNumber.getNumber();

        if (threeDigitsNumber.containsHundreds()) {
            numberAfterHundredsConverting = threeDigitsNumber.getNumber() % 100;
            if (numberDisassembler.getHundreds() == 200 && numberAfterHundredsConverting < 3)
                numberInWords.append("مئتا");
            else
                numberInWords.append(basicNumberConverter.convertHundreds(numberDisassembler.getHundreds()));
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
        ThreeDigitsNumberDisassembler numberDisassembler =
                new ThreeDigitsNumberDisassembler(ThreeDigitsNumber.of(number));
        if (number < 10)
            return convertOnes(numberDisassembler);
        else if (number == 10)
            return convertTen();
        else if (number < 20)
            return convertComposedNumber(numberDisassembler);
        else
            return convertTensWithOnes(numberDisassembler);
    }

    private String convertOnes(ThreeDigitsNumberDisassembler numberDisassembler) {
        return basicNumberConverter.convertOnes(numberDisassembler.getOnes()) +
                " " +
                quantitiveNumberNames.getNameWhenBetweenThreeAndTen();
    }

    private String convertTen() {
        return basicNumberConverter.convertTens(10)
                + " "
                + quantitiveNumberNames.getNameWhenBetweenThreeAndTen();
    }

    private String convertComposedNumber(ThreeDigitsNumberDisassembler numberDisassembler) {
       return basicNumberConverter.convertComposedNumbers(numberDisassembler.getComposedNumber())
                + " "
                + quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine();
    }

    private String convertTensWithOnes(ThreeDigitsNumberDisassembler numberDisassembler) {
        StringBuilder numberInWords = new StringBuilder();
        if (numberDisassembler.getThreeDigitsNumber().containsOnes())
            numberInWords.append(basicNumberConverter.convertOnes(numberDisassembler.getOnes()))
                    .append(" و")
                    .append(basicNumberConverter.convertTens(numberDisassembler.getTens()));
        else
            numberInWords.append(basicNumberConverter.convertTens(numberDisassembler.getTens()));

        return numberInWords.append(" ")
                .append(quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine())
                .toString();
    }
}