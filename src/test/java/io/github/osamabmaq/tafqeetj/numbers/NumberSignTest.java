package io.github.osamabmaq.tafqeetj.numbers;

import io.github.osamabmaq.tafqeetj.converters.negative.NegativeQuantitiveNumberConvertersFactory;
import io.github.osamabmaq.tafqeetj.converters.positive.PositiveQuantitiveNumberConvertersFactory;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class NumberSignTest {
    private final NumberSign positive = NumberSign.POSITIVE;
    private final NumberSign negative = NumberSign.NEGATIVE;

    @Test
    void should_ReturnPositiveQuantitiveNumberConvertersFactory_WhenGettingQuantitiveNumberConverterFactory() {
        assertEquals(
                PositiveQuantitiveNumberConvertersFactory.class,
                positive.getQuantitiveNumberConverterFactory().getClass()
        );
    }

    @Test
    void should_ReturnNegativeQuantitiveNumberConvertersFactory_WhenGettingQuantitiveNumberConverterFactory() {
        assertEquals(
                NegativeQuantitiveNumberConvertersFactory.class,
                negative.getQuantitiveNumberConverterFactory().getClass()
        );
    }

    @Test
    void should_ReturnNEGATIVE_WhenAskingForSignOfNegativeValues() {
        assertAll(() -> {
            assertEquals(negative, NumberSign.signOf(-1));
            assertEquals(negative, NumberSign.signOf((byte) -1));
            assertEquals(negative, NumberSign.signOf((short) -1));
            assertEquals(negative, NumberSign.signOf(-1L));
            assertEquals(negative, NumberSign.signOf(new BigInteger("-1")));
            assertEquals(negative, NumberSign.signOf(new BigDecimal("-1.0")));
            assertEquals(negative, NumberSign.signOf(new BigDecimal("-0.1")));
        });
    }

    @Test
    void should_ReturnPOSITIVE_WhenAskingForSignOfMinusZero() {
        assertAll(() -> {
            assertEquals(positive, NumberSign.signOf(new BigInteger("-0")));
            assertEquals(positive, NumberSign.signOf(new BigDecimal("-0.0")));
        });
    }

    @Test
    void should_returnPOSITIVE_WhenAskingForSignOfPositiveValues() {
        assertAll(() -> {
            assertEquals(positive, NumberSign.signOf(1));
            assertEquals(positive, NumberSign.signOf((byte) 1));
            assertEquals(positive, NumberSign.signOf((short) 1));
            assertEquals(positive, NumberSign.signOf(1L));
            assertEquals(positive, NumberSign.signOf(new BigInteger("1")));
            assertEquals(positive, NumberSign.signOf(new BigDecimal("1.0")));
            assertEquals(positive, NumberSign.signOf(new BigDecimal("0.1")));
        });
    }
}