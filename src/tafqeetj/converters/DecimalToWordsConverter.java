package tafqeetj.converters;

import tafqeetj.exceptions.NumberOutOfRangeException;
import tafqeetj.numbers.NumberSign;

import java.math.BigDecimal;
import java.util.Map;

public class DecimalToWordsConverter {
    private final Map<Integer, String> decimalLengthName = Map.ofEntries(
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
    private final IntegerToWordsConverter converter = IntegerToWordsConverter.getInstance();

    private static DecimalToWordsConverter instance;

    private DecimalToWordsConverter() {
    }

    public static DecimalToWordsConverter getInstance() {
        if (instance == null)
            instance = new DecimalToWordsConverter();
        return instance;
    }

    public String convert(BigDecimal number) {
        NumberSign sign = NumberSign.signOf(number);
        number = number.abs();
        String[] numberLeftAndRight = number.toPlainString().split("\\.");
        if (numberLeftAndRight.length == 2)
            numberLeftAndRight[1] = removeTrailingZeroes(numberLeftAndRight[1]);
        if (numberLeftAndRight[0].length() > 15 ||
                (numberLeftAndRight.length == 2 && numberLeftAndRight[1].length() > 15))
            throw new NumberOutOfRangeException();

        String rightNumberConverted = "";
        String leftNumberConverted = "";
        if (sign == NumberSign.POSITIVE)
            leftNumberConverted = converter.convert(Long.parseLong(numberLeftAndRight[0]));
        else
            leftNumberConverted = converter.convert(Long.parseLong("-" + numberLeftAndRight[0]));

        if (numberLeftAndRight.length == 2)
            rightNumberConverted = converter.convert(Long.parseLong("-" + numberLeftAndRight[1]))
                    .replace("سالب ", "");
        int leftNumberLength = 0;
        if (!leftNumberConverted.equals(""))
            leftNumberLength = removeTrailingZeroes(numberLeftAndRight[1]).length();
        StringBuilder numberConverted = new StringBuilder();
        if (leftNumberConverted.equals("صفر") && sign == NumberSign.NEGATIVE)
            numberConverted.append("سالب ");
        numberConverted.append(leftNumberConverted);
        numberConverted.append(" فاصلة ");
        numberConverted.append(rightNumberConverted);
        if (rightNumberConverted.equals("صفر"))
            return numberConverted.toString();
        return numberConverted.append(" ")
                .append(decimalLengthName.get(leftNumberLength))
                .toString();
    }

    private String removeTrailingZeroes(String number) {
        int end = number.length();
        for (int i = number.length() - 1; i > 0; i--)
            if (number.charAt(i) == '0')
                end = i;
            else break;
        return number.substring(0, end);
    }
}