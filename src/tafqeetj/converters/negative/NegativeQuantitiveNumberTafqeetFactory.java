package tafqeetj.converters.negative;

import tafqeetj.converters.BasicNumberTafqeetFactory;
import tafqeetj.converters.QuantitiveNumberTafqeetFactory;
import tafqeetj.converters.QuantitiveNumberToWordsConverter;
import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.QuantitiveNumberNamesFactory;
import tafqeetj.numbers.negative.NegativeQuantitiveNumberNamesFactory;

public class NegativeQuantitiveNumberTafqeetFactory implements QuantitiveNumberTafqeetFactory {
    private final QuantitiveNumberToWordsConverter negativeThousandsConverter;

    private final QuantitiveNumberToWordsConverter negativeMillionsConverter;

    private final QuantitiveNumberToWordsConverter negativeBillionsConverter;

    private final QuantitiveNumberToWordsConverter negativeTrillionsConverter;

    private static NegativeQuantitiveNumberTafqeetFactory instance;

    private NegativeQuantitiveNumberTafqeetFactory() {
        QuantitiveNumberNamesFactory negativeQuantitivesFactory = NegativeQuantitiveNumberNamesFactory.getInstance();
        negativeThousandsConverter = createQuantitiveConverter(negativeQuantitivesFactory.getThousands());
        negativeMillionsConverter = createQuantitiveConverter(negativeQuantitivesFactory.getMillions());
        negativeBillionsConverter = createQuantitiveConverter(negativeQuantitivesFactory.getBillions());
        negativeTrillionsConverter = createQuantitiveConverter(negativeQuantitivesFactory.getTrillions());
    }


    public synchronized static NegativeQuantitiveNumberTafqeetFactory getInstance() {
        if (instance == null)
            instance = new NegativeQuantitiveNumberTafqeetFactory();
        return instance;
    }

    @Override
    public QuantitiveNumberToWordsConverter getTafqeetObject(String converterName) {
        if (converterName.equals("trillions"))
            return negativeTrillionsConverter;
        else if (converterName.equals("billions"))
            return negativeBillionsConverter;
        else if (converterName.equals("millions"))
            return negativeMillionsConverter;
        else if (converterName.equals("thousands"))
            return negativeThousandsConverter;
        else
            throw new IllegalArgumentException("There is no converter with name " + converterName);
    }

    private QuantitiveNumberToWordsConverter createQuantitiveConverter(QuantitiveNumberNames thousands) {
        return new QuantitiveNumberToWordsConverter(thousands, BasicNumberTafqeetFactory.getNegativeConverter());
    }
}