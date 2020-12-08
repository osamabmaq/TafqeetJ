package tafqeetj.numbers.negative;

import tafqeetj.numbers.BasicNumberPlacesNames;

import java.util.Map;

public class NegativeBasicNumberPlacesNames implements BasicNumberPlacesNames {
    private final static Map<Integer, String> ones;
    private final static Map<Integer, String> composedNumbers;
    private final static Map<Integer, String> tens;
    private final static Map<Integer, String> hundreds;

    static {
        ones = Map.ofEntries(
                Map.entry(0, "صفر"),
                Map.entry(1, "واحد"),
                Map.entry(2, "اثنين"),
                Map.entry(3, "ثلاثة"),
                Map.entry(4, "أربعة"),
                Map.entry(5, "خمسة"),
                Map.entry(6, "ستة"),
                Map.entry(7, "سبعة"),
                Map.entry(8, "ثمانية"),
                Map.entry(9, "تسعة")
        );
        composedNumbers = Map.ofEntries(
                Map.entry(11, "أحد عشر"),
                Map.entry(12, "اثني عشر"),
                Map.entry(13, "ثلاثة عشر"),
                Map.entry(14, "أربعة عشر"),
                Map.entry(15, "خمسة عشر"),
                Map.entry(16, "ستة عشر"),
                Map.entry(17, "سبعة عشر"),
                Map.entry(18, "ثمانية عشر"),
                Map.entry(19, "تسعة عشر")
        );
        tens = Map.ofEntries(
                Map.entry(10, "عشرة"),
                Map.entry(20, "عشرين"),
                Map.entry(30, "ثلاثين"),
                Map.entry(40, "أربعين"),
                Map.entry(50, "خمسين"),
                Map.entry(60, "ستين"),
                Map.entry(70, "سبعين"),
                Map.entry(80, "ثمانين"),
                Map.entry(90, "تسعين")
        );
        hundreds = Map.ofEntries(
                Map.entry(100, "مئة"),
                Map.entry(200, "مئتين"),
                Map.entry(300, "ثلاثمئة"),
                Map.entry(400, "أربعمئة"),
                Map.entry(500, "خمسمئة"),
                Map.entry(600, "ستمئة"),
                Map.entry(700, "سبعمئة"),
                Map.entry(800, "ثمانمئة"),
                Map.entry(900, "تسعمئة")
        );
    }

    private static NegativeBasicNumberPlacesNames instance;

    private NegativeBasicNumberPlacesNames() {
    }

    public synchronized static NegativeBasicNumberPlacesNames getInstance() {
        if (instance == null)
            instance = new NegativeBasicNumberPlacesNames();
        return instance;
    }

    @Override
    public Map<Integer, String> getOnesMap() {
        return ones;
    }

    @Override
    public Map<Integer, String> getComposedNumbersMap() {
        return composedNumbers;
    }

    @Override
    public Map<Integer, String> getTensMap() {
        return tens;
    }

    @Override
    public Map<Integer, String> getHundredsMap() {
        return hundreds;
    }
}