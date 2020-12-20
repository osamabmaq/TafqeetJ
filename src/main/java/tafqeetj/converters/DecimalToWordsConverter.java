package tafqeetj.converters;

import tafqeetj.exceptions.NumberOutOfRangeException;
import tafqeetj.numbers.FractionalRatioNames;
import tafqeetj.numbers.NumberSign;

import java.math.BigDecimal;

class DecimalToWordsConverter {
    private final IntegerToWordsConverter converter = IntegerToWordsConverter.getInstance();

    private static DecimalToWordsConverter instance;

    private DecimalToWordsConverter() {
    }

    public synchronized static DecimalToWordsConverter getInstance() {
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
        int fractionalLength = 0;
        if (numberLeftAndRight.length == 2)
            fractionalLength = numberLeftAndRight[1].length();
        return buildDecimalInWords(leftNumber, rightNumber, fractionalLength);
    }

    private IntegerInWords convertLeftNumber(String leftNumber) {
        IntegerInWords number;
        number = converter.convert(Long.parseLong(leftNumber));
        if (leftNumber.startsWith("-"))
            number.setSign(NumberSign.NEGATIVE);
        return number;
    }

    private IntegerInWords convertRightNumber(String rightNumber) {
        //يرسل الرقم يمين الفاصلة العشرية كسالب ليعامل معاملة المضاف إليه ويجر
        IntegerInWords number = converter.convert(Long.parseLong("-" + rightNumber));
        //يتم تعيين الإشارة الموجبة كي لا يتم وضع كلمة سالب قبل الرقم يمين الفاصلة العشرية
        number.setSign(NumberSign.POSITIVE);
        return number;
    }

    private DecimalInWords buildDecimalInWords(IntegerInWords leftNumber,
                                               IntegerInWords rightNumber, int fractionalLength) {
        DecimalInWords decimalInWords = new DecimalInWords();
        decimalInWords.setNumberLeftDecimalPoint(leftNumber);
        decimalInWords.setNumberRightDecimalPoint(rightNumber);
        if (!leftNumber.toString().equals(""))
            decimalInWords.setFractionalRatioName(FractionalRatioNames.getRatio(fractionalLength));
        return decimalInWords;
    }
}