package io.github.osamabmaq.tafqeetj.converters.positive;

import io.github.osamabmaq.tafqeetj.converters.BasicNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.converters.QuantitiveNumberConverter;
import io.github.osamabmaq.tafqeetj.converters.QuantitiveNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;
import io.github.osamabmaq.tafqeetj.numbers.positive.PositiveQuantitiveNumberNamesFactory;

import java.util.Map;

public class PositiveQuantitiveNumberConvertersFactory implements QuantitiveNumberConverterFactory {
    private final Map<String, QuantitiveNumberConverter> positiveConvertersMap;
    private static PositiveQuantitiveNumberConvertersFactory instance;

    private PositiveQuantitiveNumberConvertersFactory() {
        PositiveQuantitiveNumberNamesFactory positivesFactory = PositiveQuantitiveNumberNamesFactory.getInstance();
        positiveConvertersMap = Map.ofEntries(
                Map.entry("thousands", createQuantitiveConverter(positivesFactory.getThousands())),
                Map.entry("millions", createQuantitiveConverter(positivesFactory.getMillions())),
                Map.entry("billions", createQuantitiveConverter(positivesFactory.getBillions())),
                Map.entry("trillions", createQuantitiveConverter(positivesFactory.getTrillions()))
        );
    }

    public synchronized static PositiveQuantitiveNumberConvertersFactory getInstance() {
        if (instance == null)
            instance = new PositiveQuantitiveNumberConvertersFactory();
        return instance;
    }

    @Override
    public QuantitiveNumberConverter getConverter(String name) {
        if (positiveConvertersMap.containsKey(name))
            return positiveConvertersMap.get(name);
        else
            throw new IllegalArgumentException("There is no converter with name " + name);
    }

    private QuantitiveNumberConverter createQuantitiveConverter(QuantitiveNumberNames names) {
        return new QuantitiveNumberConverter(names, BasicNumberConverterFactory.getPositiveConverter());
    }
}