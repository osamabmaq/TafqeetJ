package tafqeetj.numbers.negative;

import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.QuantitativeNumberNamesFactory;

public class NegativeQuantitativeNumberNamesFactory extends QuantitativeNumberNamesFactory {

    private static NegativeQuantitativeNumberNamesFactory instance;

    private NegativeQuantitativeNumberNamesFactory() {
    }

    public synchronized static NegativeQuantitativeNumberNamesFactory getInstance() {
        if (instance == null)
            instance = new NegativeQuantitativeNumberNamesFactory();
        return instance;
    }
}