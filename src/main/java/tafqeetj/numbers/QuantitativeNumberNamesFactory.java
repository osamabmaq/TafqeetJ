package tafqeetj.numbers;

public abstract class QuantitativeNumberNamesFactory {
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

    public QuantitiveNumberNames getThousands() {
        return thousands;
    }

    public QuantitiveNumberNames getMillions() {
        return millions;
    }

    public QuantitiveNumberNames getBillions() {
        return billions;
    }

    public QuantitiveNumberNames getTrillions() {
        return trillions;
    }
}
