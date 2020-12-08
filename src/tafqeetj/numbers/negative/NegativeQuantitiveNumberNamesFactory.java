package tafqeetj.numbers.negative;

import tafqeetj.numbers.QuantitiveNumberNames;
import tafqeetj.numbers.QuantitiveNumberNamesFactory;

public class NegativeQuantitiveNumberNamesFactory implements QuantitiveNumberNamesFactory {
    private final static QuantitiveNumberNames thousand;
    private final static QuantitiveNumberNames million;
    private final static QuantitiveNumberNames billion;
    private final static QuantitiveNumberNames trillion;

    static {
        thousand = new QuantitiveNumberNames(
                "ألف",
                "ألفين",
                "آلاف",
                "ألفًا"
        );
        million = new QuantitiveNumberNames(
                "مليون",
                "مليونين",
                "ملايين",
                "مليونًا"
        );
        billion = new QuantitiveNumberNames(
                "مليار",
                "مليارين",
                "مليارات",
                "مليارًا"
        );
        trillion = new QuantitiveNumberNames(
                "ترليون",
                "ترليونين",
                "ترليونات",
                "ترليونًا"
        );
    }

    private static QuantitiveNumberNamesFactory instance;

    private NegativeQuantitiveNumberNamesFactory() {
    }

    public synchronized static QuantitiveNumberNamesFactory getInstance() {
        if (instance == null)
            instance = new NegativeQuantitiveNumberNamesFactory();
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