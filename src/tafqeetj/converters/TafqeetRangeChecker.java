package tafqeetj.converters;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TafqeetRangeChecker {
    public static final long INT_PRIMITIVES_MIN_SUPPORTED_VALUE = -999_999_999_999_999L;
    public static final long INT_PRIMITIVES_MAX_SUPPORTED_VALUE = 999_999_999_999_999L;
    public static final BigInteger BI_MIN_ACCEPTED_VALUE = BigInteger.valueOf(INT_PRIMITIVES_MIN_SUPPORTED_VALUE);
    public static final BigInteger BI_MAX_ACCEPTED_VALUE = BigInteger.valueOf(INT_PRIMITIVES_MAX_SUPPORTED_VALUE);
    public static final int MAX_NUM_OF_DIGITS_LEFT_DECIMAL_POINT = 15;
    public static final int MAX_NUM_OF_DIGITS_RIGHT_DECIMAL_POINT = 15;

    private TafqeetRangeChecker() {
    }

    public static boolean isOutOfRange(int number) {
        return false; //All int datatype values are in the range
    }

    public static boolean isOutOfRange(byte number) {
        return false; //All byte datatype values are in the range
    }

    public static boolean isOutOfRange(short number) {
        return false; //All false datatype values are in the range
    }

    public static boolean isOutOfRange(long number) {
        return number < INT_PRIMITIVES_MIN_SUPPORTED_VALUE || number > INT_PRIMITIVES_MAX_SUPPORTED_VALUE;
    }

    public static boolean isOutOfRange(BigInteger number) {
        return number.compareTo(BI_MIN_ACCEPTED_VALUE) < 0 || number.compareTo(BI_MAX_ACCEPTED_VALUE) > 0;
    }

    public static boolean isOutOfRange(BigDecimal number) {
        String[] numberLeftAndRight = number.abs().toPlainString().split("\\.");
        if (numberLeftAndRight[0].length() > MAX_NUM_OF_DIGITS_LEFT_DECIMAL_POINT)
            return true;
        return numberLeftAndRight.length == 2
                && removeTrailingZeroes(numberLeftAndRight[1]).length() > MAX_NUM_OF_DIGITS_RIGHT_DECIMAL_POINT;
    }

    private static String removeTrailingZeroes(String number) {
        int end = number.length();
        for (int i = number.length() - 1; i > 0; i--)
            if (number.charAt(i) == '0')
                end = i;
            else break;
        return number.substring(0, end);
    }
}