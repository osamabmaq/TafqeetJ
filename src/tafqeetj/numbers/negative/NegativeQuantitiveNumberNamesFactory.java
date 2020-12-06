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

    private static NegativeQuantitiveNumberNamesFactory instance;

    private NegativeQuantitiveNumberNamesFactory() {
    }

    public synchronized static NegativeQuantitiveNumberNamesFactory getInstance() {
        if (instance == null)
            instance = new NegativeQuantitiveNumberNamesFactory();
        return instance;
    }

    public QuantitiveNumberNames getThousands() {
        return thousand;
    }

    public QuantitiveNumberNames getMillions() {
        return million;
    }

    public QuantitiveNumberNames getBillions() {
        return billion;
    }

    public QuantitiveNumberNames getTrillions() {
        return trillion;
    }
}
