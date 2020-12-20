package tafqeetj.converters.negative;

import tafqeetj.converters.BasicNumberConverterFactory;
import tafqeetj.converters.QuantitiveNumberConverterFactory;
import tafqeetj.converters.QuantitiveNumberConverter;
import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.QuantitativeNumberNamesFactory;
import tafqeetj.numbers.negative.NegativeQuantitativeNumberNamesFactory;

import java.util.HashMap;
import java.util.Map;

public class NegativeQuantitiveNumberConvertersFactory implements QuantitiveNumberConverterFactory {
    private final Map<String, QuantitiveNumberConverter> negativeConvertersMap;
    private static NegativeQuantitiveNumberConvertersFactory instance;

    private NegativeQuantitiveNumberConvertersFactory() {
        QuantitativeNumberNamesFactory negativesFactory = NegativeQuantitativeNumberNamesFactory.getInstance();
        this.negativeConvertersMap = new HashMap<String, QuantitiveNumberConverter>();
        this.negativeConvertersMap.put("thousands", this.createQuantitativeConverter(negativesFactory.getThousands()));
        this.negativeConvertersMap.put("millions", this.createQuantitativeConverter(negativesFactory.getMillions()));
        this.negativeConvertersMap.put("billions", this.createQuantitativeConverter(negativesFactory.getBillions()));
        this.negativeConvertersMap.put("trillions", this.createQuantitativeConverter(negativesFactory.getTrillions()));
    }

    public synchronized static NegativeQuantitiveNumberConvertersFactory getInstance() {
        if (NegativeQuantitiveNumberConvertersFactory.instance == null) {
            NegativeQuantitiveNumberConvertersFactory.instance = new NegativeQuantitiveNumberConvertersFactory();
        }
        return NegativeQuantitiveNumberConvertersFactory.instance;
    }

    @Override
    public QuantitiveNumberConverter getConverter(String name) {
        if (this.negativeConvertersMap.containsKey(name)) {
            return this.negativeConvertersMap.get(name);
        } else {
            throw new IllegalArgumentException("There is no converter with name " + name);
        }
    }

    private QuantitiveNumberConverter createQuantitativeConverter(QuantitiveNumberNames names) {
        return new QuantitiveNumberConverter(names, BasicNumberConverterFactory.getNegativeConverter());
    }
}