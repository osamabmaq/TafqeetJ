package tafqeetj.numbers;

import java.util.HashMap;
import java.util.Map;

public class FractionalRatioNames {
    private static final Map<Integer, String> fractionalRatioNamesMap = new HashMap<Integer, String>();

    static {
        fractionalRatioNamesMap.put(1, "بالعشرة");
        fractionalRatioNamesMap.put(2, "بالمئة");
        fractionalRatioNamesMap.put(3, "بالألف");
        fractionalRatioNamesMap.put(4, "بالعشرة آلاف");
        fractionalRatioNamesMap.put(5, "بالمئة ألف");
        fractionalRatioNamesMap.put(6, "بالمليون");
        fractionalRatioNamesMap.put(7, "بالعشرة ملايين");
        fractionalRatioNamesMap.put(8, "بالمئة مليون");
        fractionalRatioNamesMap.put(9, "بالمليار");
        fractionalRatioNamesMap.put(10, "بالعشرة مليارات");
        fractionalRatioNamesMap.put(11, "بالمئة مليار");
        fractionalRatioNamesMap.put(12, "بالترليون");
        fractionalRatioNamesMap.put(13, "بالعشرة ترليونات");
        fractionalRatioNamesMap.put(14, "بالمئة ترليون");
        fractionalRatioNamesMap.put(15, "بالكوادرليون");
    }

    private FractionalRatioNames() {}

    public static String getRatio(int numberOfFractionalDigits) {
        return fractionalRatioNamesMap.get(numberOfFractionalDigits);
    }
}