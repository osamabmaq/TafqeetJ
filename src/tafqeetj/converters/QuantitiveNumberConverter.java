package tafqeetj.converters;

import tafqeetj.numbers.NumberSign;
import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.ThreeDigitsNumber;

public class QuantitiveNumberConverter {
    private final QuantitiveNumberNames quantitiveNumberNames;
    private final BasicNumberConverter basicNumberConverter;

    public QuantitiveNumberConverter(QuantitiveNumberNames quantitiveNumberNames,
                                     BasicNumberConverter basicNumberConverter) {
        this.quantitiveNumberNames = quantitiveNumberNames;
        this.basicNumberConverter = basicNumberConverter;
    }

    public String convert(ThreeDigitsNumber number) {
        if (number.getNumber() == 0)
            return "";
        StringBuilder numberInWords = new StringBuilder();
        ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
        int numberAfterHundredsConverting = number.getNumber();

        if (number.containsHundreds()) {
            numberAfterHundredsConverting = number.getNumber() % 100;
            if (disassembler.getHundreds() == 200 && numberAfterHundredsConverting < 3)
                numberInWords.append(getTwoHundredsWordDependingOnNumberSign(number.getSign()));
            else
                numberInWords.append(basicNumberConverter.convertHundreds(disassembler.getHundreds()));
        }

        if (numberAfterHundredsConverting < 3)
            return convertNumberBetweenZeroAndTwo(numberInWords, numberAfterHundredsConverting);

        if (numberInWords.length() != 0)
            numberInWords.append(" و");
        return numberInWords.append(convertNumberBetweenThreeAndNinetyNine(
                ThreeDigitsNumber.of(numberAfterHundredsConverting, number.getSign())))
                .toString();
    }

    private String getTwoHundredsWordDependingOnNumberSign(NumberSign sign) {
        if (sign == NumberSign.POSITIVE)
            return "مئتا";
        return "مئتي";
    }

    private String convertNumberBetweenZeroAndTwo(StringBuilder numberInWords, int number) {
        if (numberInWords.length() != 0)
            numberInWords.append(" ").append(quantitiveNumberNames.getNameWhenEqualsOne()); //هذا للمئات، من مثل مئة ألف أو تسعمئة مليون
        if (number != 0 && numberInWords.length() != 0)
            numberInWords.append(" و");
        if (number == 1)
            numberInWords.append(quantitiveNumberNames.getNameWhenEqualsOne());
        else if (number == 2)
            numberInWords.append(quantitiveNumberNames.getNameWhenEqualsTwo());
        return numberInWords.toString();
    }

    private String convertNumberBetweenThreeAndNinetyNine(ThreeDigitsNumber number) {
        ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
        if (number.getNumber() < 10)
            return convertOnes(disassembler.getOnes());
        else if (number.getNumber() > 10 && number.getNumber() < 20)
            return convertComposedNumber(disassembler.getComposedNumber());
        else
            return convertTensWithOnes(disassembler);
    }

    private String convertOnes(int ones) {
        return basicNumberConverter.convertOnes(ones) + " " + quantitiveNumberNames.getNameWhenBetweenThreeAndTen();
    }


    private String convertComposedNumber(int composedNumber) {
        return basicNumberConverter.convertComposedNumbers(composedNumber)
                + " " + quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine();
    }

    private String convertTensWithOnes(ThreeDigitsNumberDisassembler disassembler) {
        if (disassembler.getThreeDigitsNumber().getNumber() == 10)
            return convertTen();
        StringBuilder numberInWords = new StringBuilder();
        if (disassembler.getThreeDigitsNumber().containsOnes())
            numberInWords.append(basicNumberConverter.convertOnes(disassembler.getOnes()))
                    .append(" و")
                    .append(basicNumberConverter.convertTens(disassembler.getTens()));
        else
            numberInWords.append(basicNumberConverter.convertTens(disassembler.getTens()));

        return numberInWords.append(" ")
                .append(quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine())
                .toString();
    }

    private String convertTen() {
        return basicNumberConverter.convertTens(10)
                + " " + quantitiveNumberNames.getNameWhenBetweenThreeAndTen();
    }
}