package tafqeetj.numbers;

import java.util.Map;

public class DecimalRatioNames {
    private static final Map<Integer, String> decimalRatioName = Map.ofEntries(
            Map.entry(1, "بالعشرة"),
            Map.entry(2, "بالمئة"),
            Map.entry(3, "بالألف"),
            Map.entry(4, "بالعشرة آلاف"),
            Map.entry(5, "بالمئة ألف"),
            Map.entry(6, "بالمليون"),
            Map.entry(7, "بالعشرة ملايين"),
            Map.entry(8, "بالمئة مليون"),
            Map.entry(9, "بالمليار"),
            Map.entry(10, "بالعشرة مليارات"),
            Map.entry(11, "بالمئة مليار"),
            Map.entry(12, "بالترليون"),
            Map.entry(13, "بالعشرة ترليونات"),
            Map.entry(14, "بالمئة ترليون"),
            Map.entry(15, "بالكوادرليون")
    );

    private DecimalRatioNames() {
    }

    public static String getRatio(int numberOfDecimalDigits) {
        return decimalRatioName.get(numberOfDecimalDigits);
    }
}