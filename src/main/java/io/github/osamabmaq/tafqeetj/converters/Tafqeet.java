package io.github.osamabmaq.tafqeetj.converters;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Tafqeet {
    private final IntegerToWordsConverter integerConverter = IntegerToWordsConverter.getInstance();
    private final DecimalToWordsConverter decimalConverter = DecimalToWordsConverter.getInstance();

    private static Tafqeet instance;

    private Tafqeet() {
    }

    public static synchronized Tafqeet getInstance() {
        if (instance == null)
            instance = new Tafqeet();
        return instance;
    }

    public String doTafqeet(int number) {
        return integerConverter.convert(number).toString();
    }

    public String doTafqeet(byte number) {
        return integerConverter.convert(number).toString();
    }

    public String doTafqeet(short number) {
        return integerConverter.convert(number).toString();
    }

    public String doTafqeet(long number) {
        return integerConverter.convert(number).toString();
    }

    public String doTafqeet(BigInteger number) {
        return integerConverter.convert(number).toString();
    }

    public String doTafqeet(BigDecimal number) {
        return decimalConverter.convert(number).toString();
    }
}