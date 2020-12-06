package tafqeetj.converters.positive;

import tafqeetj.converters.BasicNumberTafqeetFactory;
import tafqeetj.converters.QuantitiveNumberTafqeetFactory;
import tafqeetj.converters.QuantitiveNumberToWordsConverter;
import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.positive.PositiveQuantitiveNumberNamesFactory;

public class PositiveQuantitiveNumberTafqeetFactory implements QuantitiveNumberTafqeetFactory {
    private final QuantitiveNumberToWordsConverter positiveThousandsConverter;
    private final QuantitiveNumberToWordsConverter positiveMillionsConverter;
    private final QuantitiveNumberToWordsConverter positiveBillionsConverter;
    private final QuantitiveNumberToWordsConverter positiveTrillionsConverter;

    private static PositiveQuantitiveNumberTafqeetFactory instance;

    private PositiveQuantitiveNumberTafqeetFactory() {
        PositiveQuantitiveNumberNamesFactory positivesFactory = PositiveQuantitiveNumberNamesFactory.getInstance();
        positiveThousandsConverter = createQuantitiveConverter(positivesFactory.getThousands());
        positiveMillionsConverter = createQuantitiveConverter(positivesFactory.getMillions());
        positiveBillionsConverter = createQuantitiveConverter(positivesFactory.getBillions());
        positiveTrillionsConverter = createQuantitiveConverter(positivesFactory.getTrillions());
    }

    public synchronized static PositiveQuantitiveNumberTafqeetFactory getInstance() {
        if (instance == null)
            instance = new PositiveQuantitiveNumberTafqeetFactory();
        return instance;
    }

    @Override
    public QuantitiveNumberToWordsConverter getTafqeetObject(String converterName) {
        if (converterName.equals("trillions"))
            return positiveTrillionsConverter;
        else if (converterName.equals("billions"))
            return positiveBillionsConverter;
        else if (converterName.equals("millions"))
            return positiveMillionsConverter;
        else if (converterName.equals("thousands"))
            return positiveThousandsConverter;
        else
            throw new IllegalArgumentException("There is no converter with name " + converterName);
    }

    private QuantitiveNumberToWordsConverter createQuantitiveConverter(QuantitiveNumberNames thousands) {
        return new QuantitiveNumberToWordsConverter(thousands,
                BasicNumberTafqeetFactory.getPositiveConverter());
    }
}