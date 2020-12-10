package tafqeetj.converters;

import tafqeetj.exceptions.NumberOutOfRangeException;
import tafqeetj.numbers.NumberSign;
import tafqeetj.numbers.ThreeDigitsNumber;

import java.math.BigInteger;
import java.util.Map;

class IntegerToWordsConverter {
    private final NumberToThreeDigitsNumberGroupsDivider divider = new NumberToThreeDigitsNumberGroupsDivider();
    private static IntegerToWordsConverter instance;

    private IntegerToWordsConverter() {
    }

    public synchronized static IntegerToWordsConverter getInstance() {
        if (instance == null)
            instance = new IntegerToWordsConverter();
        return instance;
    }

    public IntegerInWords convert(int number) {
        return convert((long) number);
    }

    public IntegerInWords convert(byte number) {
        return convert((long) number);
    }

    public IntegerInWords convert(short number) {
        return convert((long) number);
    }

    public IntegerInWords convert(BigInteger number) {
        if (TafqeetRangeChecker.isOutOfRange(number))
            throw new NumberOutOfRangeException();
        return convert(number.longValue());
    }

    public IntegerInWords convert(long number) {
        if (TafqeetRangeChecker.isOutOfRange(number))
            throw new NumberOutOfRangeException();
        if (number == 0)
            return IntegerInWords.ZERO;
        IntegerInWords convertedNumber = convertNumber(divider.divide(number));
        if (number < 0)
            convertedNumber.setSign(NumberSign.NEGATIVE);
        return convertedNumber;
    }

    private IntegerInWords convertNumber(Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        IntegerInWords integerInWords = new IntegerInWords();
        integerInWords.setTrillions(convertThreeDigitsNumberIfPresent("trillions", threeDigitsNumberMap));
        integerInWords.setBillions(convertThreeDigitsNumberIfPresent("billions", threeDigitsNumberMap));
        integerInWords.setMillions(convertThreeDigitsNumberIfPresent("millions", threeDigitsNumberMap));
        integerInWords.setThousands(convertThreeDigitsNumberIfPresent("thousands", threeDigitsNumberMap));
        integerInWords.setBasicNumberGroup(convertBasicNumberIfPresent(threeDigitsNumberMap));
        return integerInWords;
    }

    private String convertBasicNumberIfPresent(Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        if (threeDigitsNumberMap.containsKey("basicNumberGroup")) {
            ThreeDigitsNumber number = threeDigitsNumberMap.get("basicNumberGroup");
            return number.getSign()
                    .getBasicNumberConverter()
                    .convert(number);
        }
        return "";
    }

    private String convertThreeDigitsNumberIfPresent(String numberGroupName,
                                                     Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        if (threeDigitsNumberMap.containsKey(numberGroupName)) {
            ThreeDigitsNumber number = threeDigitsNumberMap.get(numberGroupName);
            return number.getSign()
                    .getQuantitiveNumberConverterFactory()
                    .getConverter(numberGroupName)
                    .convert(number);
        }
        return "";
    }
}