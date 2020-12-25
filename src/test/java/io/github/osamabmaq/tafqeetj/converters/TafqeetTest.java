package io.github.osamabmaq.tafqeetj.converters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TafqeetTest {
    private Tafqeet tafqeet;

    @BeforeEach
    void setupTafqeetObject() {
        tafqeet = Tafqeet.getInstance();
    }

    @Test
    void should_GenerateOne_WhenPassingOne_doTafqeetByte() {
        assertEquals("واحد", tafqeet.doTafqeet((byte) 1));
    }

    @Test
    void should_GenerateOne_WhenPassingOne_doTafqeetShort() {
        assertEquals("واحد", tafqeet.doTafqeet((short) 1));
    }

    @Test
    void should_GenerateOne_WhenPassingOne_doTafqeetInt() {
        assertEquals("واحد", tafqeet.doTafqeet((int) 1));
    }

    @Test
    void should_GenerateOne_WhenPassingOne_doTafqeetLong() {
        assertEquals("واحد", tafqeet.doTafqeet(1L));
    }

    @Test
    void should_GenerateOne_WhenPassingOne_doTafqeetBigInteger() {
        assertEquals("واحد", tafqeet.doTafqeet(BigInteger.ONE));
    }

    @Test
    void should_GenerateOnePointOne_WhenPassingOnePointOne_doTafqeetBigDecimal() {
        assertEquals("واحد فاصلة واحد بالعشرة", tafqeet.doTafqeet(BigDecimal.valueOf(1.1)));
    }
}