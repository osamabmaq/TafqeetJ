package tafqeetj.converters.positive;

import tafqeetj.converters.BasicNumberConverterFactory;
import tafqeetj.converters.QuantitiveNumberConverterFactory;
import tafqeetj.converters.QuantitiveNumberConverter;
import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.positive.PositiveQuantitativeNumberNamesFactory;

import java.util.HashMap;
import java.util.Map;

public class PositiveQuantitiveNumberConvertersFactory implements QuantitiveNumberConverterFactory {
    private final Map<String, QuantitiveNumberConverter> positiveConvertersMap;
    private static PositiveQuantitiveNumberConvertersFactory instance;

    private PositiveQuantitiveNumberConvertersFactory() {
        PositiveQuantitativeNumberNamesFactory positivesFactory = PositiveQuantitativeNumberNamesFactory.getInstance();
        this.positiveConvertersMap = new HashMap<String, QuantitiveNumberConverter>();
        this.positiveConvertersMap.put("thousands", this.createQuantitativeConverter(positivesFactory.getThousands()));
        this.positiveConvertersMap.put("millions", this.createQuantitativeConverter(positivesFactory.getMillions()));
        this.positiveConvertersMap.put("billions", this.createQuantitativeConverter(positivesFactory.getBillions()));
        this.positiveConvertersMap.put("trillions", this.createQuantitativeConverter(positivesFactory.getTrillions()));
    }

    public synchronized static PositiveQuantitiveNumberConvertersFactory getInstance() {
        if (PositiveQuantitiveNumberConvertersFactory.instance == null) {
            PositiveQuantitiveNumberConvertersFactory.instance = new PositiveQuantitiveNumberConvertersFactory();
        }
        return PositiveQuantitiveNumberConvertersFactory.instance;
    }

    @Override
    public QuantitiveNumberConverter getConverter(String name) {
        if (this.positiveConvertersMap.containsKey(name)) {
            return this.positiveConvertersMap.get(name);
        } else {
            throw new IllegalArgumentException("There is no converter with name " + name);
        }
    }

    private QuantitiveNumberConverter createQuantitativeConverter(QuantitiveNumberNames names) {
        return new QuantitiveNumberConverter(names, BasicNumberConverterFactory.getPositiveConverter());
    }
}