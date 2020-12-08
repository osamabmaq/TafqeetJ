package tafqeetj.converters;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Tafqeet {
    private static Tafqeet instance;
    private final IntegerToWordsConverter integerConverter = IntegerToWordsConverter.getInstance();
    private final DecimalToWordsConverter decimalConverter = DecimalToWordsConverter.getInstance();

    private Tafqeet() {
    }

    public static synchronized Tafqeet getInstance() {
        if (instance == null)
            instance = new Tafqeet();
        return instance;
    }

    public String doTafqeet(int number) {
        if (number == Integer.MIN_VALUE)
            return doTafqeet((long) number);
        return integerConverter.convert(number);
    }

    public String doTafqeet(long number) {
        return integerConverter.convert(number);
    }

    public String doTafqeet(BigInteger number) {
        return integerConverter.convert(number);
    }

    public String doTafqeet(BigDecimal number) {
        return decimalConverter.convert(number);
    }
}