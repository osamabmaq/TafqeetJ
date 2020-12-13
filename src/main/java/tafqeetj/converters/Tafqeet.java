package tafqeetj.converters;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Tafqeet {
    private final IntegerToWordsConverter integerConverter = IntegerToWordsConverter.getInstance();
    private final DecimalToWordsConverter decimalConverter = DecimalToWordsConverter.getInstance();

    private static Tafqeet instance;

    private Tafqeet() {
    }

    public static synchronized Tafqeet getInstance() {
        if (Tafqeet.instance == null) {
            Tafqeet.instance = new Tafqeet();
        }
        return Tafqeet.instance;
    }

    public String doTafqeet(int number) {
        return this.integerConverter.convert(number).toString();
    }

    public String doTafqeet(byte number) {
        return this.integerConverter.convert(number).toString();
    }

    public String doTafqeet(short number) {
        return this.integerConverter.convert(number).toString();
    }

    public String doTafqeet(long number) {
        return this.integerConverter.convert(number).toString();
    }

    public String doTafqeet(BigInteger number) {
        return this.integerConverter.convert(number).toString();
    }

    public String doTafqeet(BigDecimal number) {
        return this.decimalConverter.convert(number).toString();
    }
}