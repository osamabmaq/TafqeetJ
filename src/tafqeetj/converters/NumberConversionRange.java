package tafqeetj.converters;

import java.math.BigInteger;

public class NumberConversionRange {
    public static final long MIN_ACCEPTED_VALUE = -999_999_999_999_999L;
    public static final long MAX_ACCEPTED_VALUE = 999_999_999_999_999L;
    public static final int MAX_FRACTION_DIGITS_NUMBER = 15;
    private static final BigInteger BIG_MIN_ACCEPTED_VALUE = BigInteger.valueOf(MIN_ACCEPTED_VALUE);
    private static final BigInteger BIG_MAX_ACCEPTED_VALUE = BigInteger.valueOf(MAX_ACCEPTED_VALUE);

    private NumberConversionRange() {
    }

    public static boolean isOutOfRange(int number) {
        return false; //All int datatype values are in the range
    }

    public static boolean isOutOfRange(long number) {
        return number < MIN_ACCEPTED_VALUE || number > MAX_ACCEPTED_VALUE;
    }

    public static boolean isOutOfRange(byte number){
        return false; //All byte datatype values are in the range
    }

    public static boolean isOutOfRange(BigInteger number) {
        return number.compareTo(BIG_MIN_ACCEPTED_VALUE) < 0 || number.compareTo(BIG_MAX_ACCEPTED_VALUE) > 0;
    }
}