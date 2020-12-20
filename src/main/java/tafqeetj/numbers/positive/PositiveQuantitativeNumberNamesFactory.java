package tafqeetj.numbers.positive;

import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.QuantitativeNumberNamesFactory;

public class PositiveQuantitativeNumberNamesFactory extends QuantitativeNumberNamesFactory {


    private static PositiveQuantitativeNumberNamesFactory instance;

    private PositiveQuantitativeNumberNamesFactory() {
    }

    public synchronized static PositiveQuantitativeNumberNamesFactory getInstance() {
        if (instance == null)
            instance = new PositiveQuantitativeNumberNamesFactory();
        return instance;
    }
}