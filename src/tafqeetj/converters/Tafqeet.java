package tafqeetj.converters;

import tafqeetj.converters.negative.NegativeQuantitiveNumberTafqeetFactory;
import tafqeetj.converters.positive.PositiveQuantitiveNumberTafqeetFactory;

public class Tafqeet {
    private static Tafqeet instance;
    private final NumberToWordsConverter positiveConverter = new NumberToWordsConverter(
            BasicNumberTafqeetFactory.getPositiveConverter(),
            PositiveQuantitiveNumberTafqeetFactory.getInstance()
    );
    private final NumberToWordsConverter negativeConverter = new NumberToWordsConverter(
            BasicNumberTafqeetFactory.getNegativeConverter(),
            NegativeQuantitiveNumberTafqeetFactory.getInstance()
    );

    private Tafqeet() {
    }

    public static synchronized Tafqeet getInstance() {
        if (instance == null)
            instance = new Tafqeet();
        return instance;
    }

    public String doTafqeet(int number) {
        if (number < 0)
            return "سالب " + negativeConverter.convert(Math.abs(number));
        return positiveConverter.convert(number);
    }
}