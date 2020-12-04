package tafqeetj.converters;

import tafqeetj.numbers.BasicNumbersPLacesNamesMapsFactory;
import tafqeetj.numbers.ThreeDigitsNumber;

import java.util.Map;

public class NumberToWordsConverter {
    private final NumberToThreeDigitsNumberGroupsDivider divider = new NumberToThreeDigitsNumberGroupsDivider();

    public String convert(int number) {
        if (number == 0)
            return BasicNumbersPLacesNamesMapsFactory.getOnesMap().get(0);
        if (number < 0)
            return convertNegativeNumber(number);
        return convertNumber(divider.divide(number)).toString();
    }

    private String convertNegativeNumber(int number) {
        number = Math.abs(number);
        return ("سالب ") + convertNumber(divider.divide(number)).toString();
    }

    private NumberInWords convertNumber(Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        NumberInWords numberInWords = new NumberInWords();
        numberInWords.setTrillions(convertThreeDigitsNumberIfPresent("trillions", threeDigitsNumberMap));
        numberInWords.setBillions(convertThreeDigitsNumberIfPresent("billions", threeDigitsNumberMap));
        numberInWords.setMillions(convertThreeDigitsNumberIfPresent("millions", threeDigitsNumberMap));
        numberInWords.setThousands(convertThreeDigitsNumberIfPresent("thousands", threeDigitsNumberMap));
        numberInWords.setBasicNumberGroup(convertBasicNumberIfPresent(threeDigitsNumberMap));
        return numberInWords;
    }

    private String convertBasicNumberIfPresent(Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        if (threeDigitsNumberMap.containsKey("basicNumberGroup"))
            return BasicNumberToWordsConverter.getInstance()
                    .convert(threeDigitsNumberMap.get("basicNumberGroup"));
        return "";
    }

    private String convertThreeDigitsNumberIfPresent(String numberGroupName,
                                                     Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        if (threeDigitsNumberMap.containsKey(numberGroupName))
            return QuantitiveNumberToWordsConvertersFactory.getConverter(numberGroupName)
                    .convert(threeDigitsNumberMap.get(numberGroupName));
        return "";
    }
}