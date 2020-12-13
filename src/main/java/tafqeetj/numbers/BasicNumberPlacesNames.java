package tafqeetj.numbers;

import java.util.HashMap;
import java.util.Map;

public abstract class BasicNumberPlacesNames {
    private final static Map<Integer, String> ones;
    private final static Map<Integer, String> composedNumbers;
    private final static Map<Integer, String> tens;
    private final static Map<Integer, String> hundreds;

    static {
        ones = new HashMap<Integer, String>();
        ones.put(0, "صفر");
        ones.put(1, "واحد");
        ones.put(2, "اثنين");
        ones.put(3, "ثلاثة");
        ones.put(4, "أربعة");
        ones.put(5, "خمسة");
        ones.put(6, "ستة");
        ones.put(7, "سبعة");
        ones.put(8, "ثمانية");
        ones.put(9, "تسعة");

        composedNumbers = new HashMap<Integer, String>();
        composedNumbers.put(11, "أحد عشر");
        composedNumbers.put(12, "اثني عشر");
        composedNumbers.put(13, "ثلاثة عشر");
        composedNumbers.put(14, "أربعة عشر");
        composedNumbers.put(15, "خمسة عشر");
        composedNumbers.put(16, "ستة عشر");
        composedNumbers.put(17, "سبعة عشر");
        composedNumbers.put(18, "ثمانية عشر");
        composedNumbers.put(19, "تسعة عشر");

        tens = new HashMap<Integer, String>();
        tens.put(10, "عشرة");
        tens.put(20, "عشرين");
        tens.put(30, "ثلاثين");
        tens.put(40, "أربعين");
        tens.put(50, "خمسين");
        tens.put(60, "ستين");
        tens.put(70, "سبعين");
        tens.put(80, "ثمانين");
        tens.put(90, "تسعين");

        hundreds = new HashMap<Integer, String>();
        hundreds.put(100, "مئة");
        hundreds.put(200, "مئتين");
        hundreds.put(300, "ثلاثمئة");
        hundreds.put(400, "أربعمئة");
        hundreds.put(500, "خمسمئة");
        hundreds.put(600, "ستمئة");
        hundreds.put(700, "سبعمئة");
        hundreds.put(800, "ثمانمئة");
        hundreds.put(900, "تسعمئة");
    }

    public Map<Integer, String> getOnesMap() {
        return ones;
    }

    public Map<Integer, String> getComposedNumbersMap() {
        return composedNumbers;
    }

    public Map<Integer, String> getTensMap() {
        return tens;
    }

    public Map<Integer, String> getHundredsMap() {
        return hundreds;
    }
}