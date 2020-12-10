package tafqeetj.converters;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TafqeetRangeChecker {
    public static final long INT_PRIMITIVES_MIN_ACCEPTED_VALUE = -999_999_999_999_999L;
    public static final long INT_PRIMITIVES_MAX_ACCEPTED_VALUE = 999_999_999_999_999L;
    public static final BigInteger BI_MIN_ACCEPTED_VALUE = BigInteger.valueOf(INT_PRIMITIVES_MIN_ACCEPTED_VALUE);
    public static final BigInteger BI_MAX_ACCEPTED_VALUE = BigInteger.valueOf(INT_PRIMITIVES_MAX_ACCEPTED_VALUE);
    public static final BigDecimal BD_MIN_ACCEPTED_VALUE = new BigDecimal("-999999999999999.000000000000001");
    public static final BigDecimal BD_MAX_ACCEPTED_VALUE = new BigDecimal("999999999999999.999999999999999");

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
        return number < INT_PRIMITIVES_MIN_ACCEPTED_VALUE || number > INT_PRIMITIVES_MAX_ACCEPTED_VALUE;
    }

    public static boolean isOutOfRange(BigInteger number) {
        return number.compareTo(BI_MIN_ACCEPTED_VALUE) < 0 || number.compareTo(BI_MAX_ACCEPTED_VALUE) > 0;
    }

    public static boolean isOutOfRange(BigDecimal number) {
        return number.compareTo(BD_MIN_ACCEPTED_VALUE) < 0 || number.compareTo(BD_MAX_ACCEPTED_VALUE) > 0;
    }
}