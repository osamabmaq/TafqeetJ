package io.github.osamabmaq.tafqeetj.numbers.negative;

import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNamesFactory;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;

public class NegativeQuantitiveNumberNamesFactory implements QuantitiveNumberNamesFactory {
    private final static QuantitiveNumberNames thousands;
    private final static QuantitiveNumberNames millions;
    private final static QuantitiveNumberNames billions;
    private final static QuantitiveNumberNames trillions;

    static {
        thousands = new QuantitiveNumberNames(
                "ألف",
                "ألفين",
                "آلاف",
                "ألفًا"
        );
        millions = new QuantitiveNumberNames(
                "مليون",
                "مليونين",
                "ملايين",
                "مليونًا"
        );
        billions = new QuantitiveNumberNames(
                "مليار",
                "مليارين",
                "مليارات",
                "مليارًا"
        );
        trillions = new QuantitiveNumberNames(
                "ترليون",
                "ترليونين",
                "ترليونات",
                "ترليونًا"
        );
    }

    private static NegativeQuantitiveNumberNamesFactory instance;

    private NegativeQuantitiveNumberNamesFactory() {
    }

    public synchronized static NegativeQuantitiveNumberNamesFactory getInstance() {
        if (instance == null)
            instance = new NegativeQuantitiveNumberNamesFactory();
        return instance;
    }

    @Override
    public QuantitiveNumberNames getThousands() {
        return thousands;
    }

    @Override
    public QuantitiveNumberNames getMillions() {
        return millions;
    }

    @Override
    public QuantitiveNumberNames getBillions() {
        return billions;
    }

    @Override
    public QuantitiveNumberNames getTrillions() {
        return trillions;
    }
}