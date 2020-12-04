package tafqeetj.numbers;

public class QuantitiveNumberNamesFactory {
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

    private QuantitiveNumberNamesFactory() {
    }

    public static QuantitiveNumberNames getThousands() {
        return thousand;
    }

    public static QuantitiveNumberNames getMillions() {
        return million;
    }

    public static QuantitiveNumberNames getBillions() {
        return billion;
    }

    public static QuantitiveNumberNames getTrillions() {
        return trillion;
    }
}