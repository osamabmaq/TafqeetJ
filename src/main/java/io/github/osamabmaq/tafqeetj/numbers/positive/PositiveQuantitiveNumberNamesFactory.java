package io.github.osamabmaq.tafqeetj.numbers.positive;

import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNamesFactory;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;

public class PositiveQuantitiveNumberNamesFactory implements QuantitiveNumberNamesFactory {
    private final static QuantitiveNumberNames thousands;
    private final static QuantitiveNumberNames millions;
    private final static QuantitiveNumberNames billions;
    private final static QuantitiveNumberNames trillions;

    static {
        thousands = new QuantitiveNumberNames(
                "ألف",
                "ألفان",
                "آلاف",
                "ألفًا"
        );
        millions = new QuantitiveNumberNames(
                "مليون",
                "مليونان",
                "ملايين",
                "مليونًا"
        );
        billions = new QuantitiveNumberNames(
                "مليار",
                "ملياران",
                "مليارات",
                "مليارًا"
        );
        trillions = new QuantitiveNumberNames(
                "ترليون",
                "ترليونان",
                "ترليونات",
                "ترليونًا"
        );
    }

    private static PositiveQuantitiveNumberNamesFactory instance;

    private PositiveQuantitiveNumberNamesFactory() {
    }

    public synchronized static PositiveQuantitiveNumberNamesFactory getInstance() {
        if (instance == null)
            instance = new PositiveQuantitiveNumberNamesFactory();
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