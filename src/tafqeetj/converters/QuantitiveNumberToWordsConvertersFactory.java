package tafqeetj.converters;

import tafqeetj.numbers.QuantitiveNumberNamesFactory;

public class QuantitiveNumberToWordsConvertersFactory {
    private final static QuantitiveNumberToWordsConverter thousandsConverter =
            new QuantitiveNumberToWordsConverter(QuantitiveNumberNamesFactory.getThousands());
    private final static QuantitiveNumberToWordsConverter millionsConverter =
            new QuantitiveNumberToWordsConverter(QuantitiveNumberNamesFactory.getMillions());
    private final static QuantitiveNumberToWordsConverter billionsConverter =
            new QuantitiveNumberToWordsConverter(QuantitiveNumberNamesFactory.getBillions());
    private final static QuantitiveNumberToWordsConverter trillionsConverter =
            new QuantitiveNumberToWordsConverter(QuantitiveNumberNamesFactory.getTrillions());

    private QuantitiveNumberToWordsConvertersFactory() {
    }

    public static QuantitiveNumberToWordsConverter getConverter(String converterName) {
        if (converterName.equals("trillions"))
            return trillionsConverter;
        else if (converterName.equals("billions"))
            return billionsConverter;
        else if (converterName.equals("millions"))
            return millionsConverter;
        else if (converterName.equals("thousands"))
            return thousandsConverter;
        else
            throw new IllegalArgumentException("There is no converter with name " + converterName);
    }
}
