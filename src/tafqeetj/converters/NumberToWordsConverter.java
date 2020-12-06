package tafqeetj.converters;

import tafqeetj.numbers.ThreeDigitsNumber;

import java.util.Map;

public class NumberToWordsConverter {
    private final NumberToThreeDigitsNumberGroupsDivider divider = new NumberToThreeDigitsNumberGroupsDivider();
    private final BasicNumberTafqeet basicNumberTafqeet;
    private final QuantitiveNumberTafqeetFactory quantitiveNumberTafqeetFactory;

    public NumberToWordsConverter(BasicNumberTafqeet basicNumberTafqeet,
                                  QuantitiveNumberTafqeetFactory quantitiveNumberTafqeetFactory){
        this.basicNumberTafqeet = basicNumberTafqeet;
        this.quantitiveNumberTafqeetFactory = quantitiveNumberTafqeetFactory;
    }

    public String convert(int number) {
        if (number == 0)
            return "صفر";
        return convertNumber(divider.divide(number)).toString();
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
            return basicNumberTafqeet.convert(threeDigitsNumberMap.get("basicNumberGroup"));
        return "";
    }

    private String convertThreeDigitsNumberIfPresent(String numberGroupName,
                                                     Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        if (threeDigitsNumberMap.containsKey(numberGroupName))
            return quantitiveNumberTafqeetFactory.getTafqeetObject(numberGroupName)
                    .convert(threeDigitsNumberMap.get(numberGroupName));
        return "";
    }
}