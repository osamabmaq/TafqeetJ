package tafqeetj.converters;

import tafqeetj.exceptions.NumberOutOfRangeException;
import tafqeetj.numbers.DecimalRatioNames;
import tafqeetj.numbers.NumberSign;

import java.math.BigDecimal;

public class DecimalToWordsConverter {
    private final IntegerToWordsConverter converter = IntegerToWordsConverter.getInstance();

    private static DecimalToWordsConverter instance;

    private DecimalToWordsConverter() {
    }

    public static DecimalToWordsConverter getInstance() {
        if (instance == null)
            instance = new DecimalToWordsConverter();
        return instance;
    }

    public DecimalInWords convert(BigDecimal number) {
        if (TafqeetRangeChecker.isOutOfRange(number))
            throw new NumberOutOfRangeException(number);
        String[] numberLeftAndRight = number.toPlainString().split("\\.");
        if (numberLeftAndRight.length == 2)
            numberLeftAndRight[1] = removeTrailingZeroes(numberLeftAndRight[1]);
        return convertToDecimalInWords(numberLeftAndRight);
    }

    private String removeTrailingZeroes(String number) {
        int end = number.length();
        for (int i = number.length() - 1; i > 0; i--)
            if (number.charAt(i) == '0')
                end = i;
            else break;
        return number.substring(0, end);
    }

    private DecimalInWords convertToDecimalInWords(String[] numberLeftAndRight) {
        IntegerInWords leftNumber = convertLeftNumber(numberLeftAndRight[0]);
        IntegerInWords rightNumber = convertRightNumber((numberLeftAndRight.length == 2 ? numberLeftAndRight[1] : "0"));
        int decimalLength = 0;
        if (numberLeftAndRight.length == 2)
            decimalLength = numberLeftAndRight[1].length();
        return buildDecimalInWords(decimalLength, rightNumber, leftNumber);
    }

    private IntegerInWords convertLeftNumber(String leftNumber) {
        IntegerInWords number;
        number = converter.convert(Long.parseLong(leftNumber));
        if (leftNumber.startsWith("-"))
            number.setSign(NumberSign.NEGATIVE);
        return number;
    }

    private IntegerInWords convertRightNumber(String rightNumber) {
        IntegerInWords number = converter.convert(Long.parseLong("-" + rightNumber));
        number.setSign(NumberSign.POSITIVE);
        return number;
    }

    private DecimalInWords buildDecimalInWords(int decimalLength,
                                               IntegerInWords rightNumber, IntegerInWords leftNumber) {
        DecimalInWords decimalInWords = new DecimalInWords();
        decimalInWords.setNumberLeftTheComma(leftNumber);
        decimalInWords.setNumberRightTheComma(rightNumber);
        if (!leftNumber.toString().equals(""))
            decimalInWords.setDecimalLengthName(DecimalRatioNames.getRatio(decimalLength));
        return decimalInWords;
    }
}