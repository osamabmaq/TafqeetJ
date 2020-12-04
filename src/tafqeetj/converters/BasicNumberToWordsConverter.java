package tafqeetj.converters;

import tafqeetj.numbers.BasicNumbersPLacesNamesMapsFactory;
import tafqeetj.numbers.ThreeDigitsNumber;

public class BasicNumberToWordsConverter {
    private static BasicNumberToWordsConverter instance;

    private BasicNumberToWordsConverter() {
    }

    public static synchronized BasicNumberToWordsConverter getInstance() {
        if (instance == null)
            instance = new BasicNumberToWordsConverter();
        return instance;
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
        if (!BasicNumbersPLacesNamesMapsFactory.getOnesMap().containsKey(number))
            throw new IllegalArgumentException(number + " is not a one");
        return BasicNumbersPLacesNamesMapsFactory.getOnesMap().get(number);
    }

    public String convertComposedNumbers(int number) {
        if (!BasicNumbersPLacesNamesMapsFactory.getComposedNumbersMap().containsKey(number))
            throw new IllegalArgumentException(number + " is not a composed number");
        return BasicNumbersPLacesNamesMapsFactory.getComposedNumbersMap().get(number);
    }

    public String convertTens(int number) {
        if (!BasicNumbersPLacesNamesMapsFactory.getTensMap().containsKey(number))
            throw new IllegalArgumentException(number + " is not a ten");
        return BasicNumbersPLacesNamesMapsFactory.getTensMap().get(number);
    }

    public String convertHundreds(int number) {
        if (!BasicNumbersPLacesNamesMapsFactory.getHundredsMap().containsKey(number))
            throw new IllegalArgumentException(number + " is not a hundred");
        return BasicNumbersPLacesNamesMapsFactory.getHundredsMap().get(number);
    }
}