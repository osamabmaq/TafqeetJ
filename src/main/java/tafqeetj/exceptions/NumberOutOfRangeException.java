package tafqeetj.exceptions;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberOutOfRangeException extends RuntimeException {
    public NumberOutOfRangeException(long number) {
        super("Out of range value: " + number);
    }
    public NumberOutOfRangeException(BigInteger number) {
        super("Out of range value: " + number);
    }
    public NumberOutOfRangeException(BigDecimal number) {
        super("Out of range value: " + number.toPlainString());
    }
}