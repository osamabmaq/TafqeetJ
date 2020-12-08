package tafqeetj.numbers.positive;

import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.QuantitiveNumberNamesFactory;

public class PositiveQuantitiveNumberNamesFactory implements QuantitiveNumberNamesFactory {
    private final static QuantitiveNumberNames thousand;
    private final static QuantitiveNumberNames million;
    private final static QuantitiveNumberNames billion;
    private final static QuantitiveNumberNames trillion;

    static {
        thousand = new QuantitiveNumberNames(
                "ألف",
                "ألفان",
                "آلاف",
                "ألفًا"
        );
        million = new QuantitiveNumberNames(
                "مليون",
                "مليونان",
                "ملايين",
                "مليونًا"
        );
        billion = new QuantitiveNumberNames(
                "مليار",
                "ملياران",
                "مليارات",
                "مليارًا"
        );
        trillion = new QuantitiveNumberNames(
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
        return thousand;
    }

    @Override
    public QuantitiveNumberNames getMillions() {
        return million;
    }

    @Override
    public QuantitiveNumberNames getBillions() {
        return billion;
    }

    @Override
    public QuantitiveNumberNames getTrillions() {
        return trillion;
    }
}