package tafqeetj.converters;

import tafqeetj.numbers.QuantitiveNumberNamesFactory;

public class QuantitiveNumberToWordsConvertersFactory {
    private final static QuantitiveNumberToWordsConverter thousandsConverter =
            new QuantitiveNumberToWordsConverter(QuantitiveNumberNamesFactory.getThousand());
    private final static QuantitiveNumberToWordsConverter millionsConverter =
            new QuantitiveNumberToWordsConverter(QuantitiveNumberNamesFactory.getMillion());
    private final static QuantitiveNumberToWordsConverter billionsConverter =
            new QuantitiveNumberToWordsConverter(QuantitiveNumberNamesFactory.getBillion());
    private final static QuantitiveNumberToWordsConverter trillionsConverter =
            new QuantitiveNumberToWordsConverter(QuantitiveNumberNamesFactory.getTrillion());
    private QuantitiveNumberToWordsConvertersFactory(){}

    public static QuantitiveNumberToWordsConverter getThousandsConverter() {
        return thousandsConverter;
    }

    public static QuantitiveNumberToWordsConverter getMillionsConverter() {
        return millionsConverter;
    }

    public static QuantitiveNumberToWordsConverter getBillionsConverter() {
        return billionsConverter;
    }

    public static QuantitiveNumberToWordsConverter getTrillionsConverter() {
        return trillionsConverter;
    }
}
