package io.github.osamabmaq.tafqeetj.converters;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.github.osamabmaq.tafqeetj.converters.TafqeetRangeChecker.*;
import static org.junit.jupiter.api.Assertions.*;

class TafqeetRangeCheckerTest {
    @Nested
    class TestCheckingSupportedValues {

        @Test
        void should_ReturnFalse_WhenCheckingIntDatatypeValues() {
            assertFalse(isOutOfRange(Integer.MAX_VALUE));
            assertFalse(isOutOfRange(Integer.MIN_VALUE));
            for (int i = -1000; i <= 1000; i++)
                assertFalse(isOutOfRange(i));
        }

        @Test
        void should_ReturnFalse_WhenCheckingByteDatatypeValues() {
            for (byte i = Byte.MIN_VALUE; i < Byte.MAX_VALUE; i++)
                assertFalse(isOutOfRange(i));
            assertFalse(isOutOfRange(Byte.MAX_VALUE));
        }

        @Test
        void should_ReturnFalse_WhenCheckingShortDatatypeValues() {
            for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++)
                assertFalse(isOutOfRange(i));
            assertFalse(isOutOfRange(Short.MAX_VALUE));
        }

        @Test
        void should_ReturnFalse_WhenCheckingSupportedLongDatatypeValues() {
            assertFalse(isOutOfRange(INT_PRIMITIVES_MAX_SUPPORTED_VALUE));
            assertFalse(isOutOfRange(INT_PRIMITIVES_MIN_SUPPORTED_VALUE));
            StringBuilder positiveNumber = new StringBuilder("9");
            StringBuilder negativeNumber = new StringBuilder("-9");
            for (int i = 0; i < 15 /*Max number of digits supported is 15*/; i++) {
                assertFalse(isOutOfRange(Long.parseLong(positiveNumber.toString())));
                assertFalse(isOutOfRange(Long.parseLong(negativeNumber.toString())));
                positiveNumber.append("9");
                negativeNumber.append("9");
            }
        }

        @Test
        void should_ReturnFalse_WhenCheckingSupportedBigIntegerDatatypeValues() {
            assertFalse(isOutOfRange(BI_MAX_ACCEPTED_VALUE));
            assertFalse(isOutOfRange(BI_MIN_ACCEPTED_VALUE));
            StringBuilder positiveNumber = new StringBuilder("9");
            StringBuilder negativeNumber = new StringBuilder("-9");
            for (int i = 0; i < 15 /*Max number of digits supported is 15*/; i++) {
                assertFalse(isOutOfRange(new BigInteger(positiveNumber.toString())));
                assertFalse(isOutOfRange(new BigInteger(negativeNumber.toString())));
                positiveNumber.append("9");
                negativeNumber.append("9");
            }
        }

        @Test
        void should_ReturnFalse_WhenCheckingSupportedBigDecimalDatatypeValues() {
            assertFalse(isOutOfRange(new BigDecimal("0." + BI_MAX_ACCEPTED_VALUE.toString())));
            assertFalse(isOutOfRange(new BigDecimal(BI_MAX_ACCEPTED_VALUE.toString() + ".0")));
            assertFalse(isOutOfRange(new BigDecimal("-0." + BI_MAX_ACCEPTED_VALUE.toString())));
            assertFalse(isOutOfRange(new BigDecimal(BI_MIN_ACCEPTED_VALUE.toString() + ".0")));

            StringBuilder positiveNumber = new StringBuilder("9");
            StringBuilder negativeNumber = new StringBuilder("-9");

            for (int i = 0; i < 15 /*Max number of digits supported is 15*/; i++) {
                assertFalse(isOutOfRange(new BigDecimal(positiveNumber.toString() + "." + positiveNumber.toString())));
                assertFalse(isOutOfRange(new BigDecimal(negativeNumber.toString() + "." + positiveNumber.toString())));
                assertFalse(isOutOfRange(new BigDecimal("0." + positiveNumber.toString())));
                assertFalse(isOutOfRange(new BigDecimal("-0." + positiveNumber.toString())));
                assertFalse(isOutOfRange(new BigDecimal(positiveNumber.toString() + ".0")));
                assertFalse(isOutOfRange(new BigDecimal(negativeNumber.toString() + ".0")));
                positiveNumber.append("9");
                negativeNumber.append("9");
            }
        }
    }
    @Nested
    class TestUnsupportedValues{
        @Test
        void should_ReturnTrue_WhenCheckingUnsupportedLongDatatypeValues() {
            assertTrue(isOutOfRange(Long.MAX_VALUE));
            assertTrue(isOutOfRange(Long.MIN_VALUE));
            for (long i = INT_PRIMITIVES_MAX_SUPPORTED_VALUE+1; i <INT_PRIMITIVES_MAX_SUPPORTED_VALUE+1000 ; i++)
                assertTrue(isOutOfRange(i));
            for (long i = INT_PRIMITIVES_MIN_SUPPORTED_VALUE-1; i > INT_PRIMITIVES_MIN_SUPPORTED_VALUE-1000; i--)
                assertTrue(isOutOfRange(i));
        }

        @Test
        void should_ReturnTrue_WhenCheckingUnsupportedBigIntegerDatatypeValues() {
            assertTrue(isOutOfRange(new BigInteger(String.valueOf(Long.MAX_VALUE))));
            assertTrue(isOutOfRange(new BigInteger(String.valueOf(Long.MIN_VALUE))));
            BigInteger i = BI_MAX_ACCEPTED_VALUE.add(BigInteger.ONE);
            BigInteger limit = i.add(new BigInteger("1000"));
            while (i.compareTo(limit) < 1) {
                assertTrue(isOutOfRange(i));
                i = i.add(BigInteger.ONE);
            }
            i = BI_MIN_ACCEPTED_VALUE.subtract(BigInteger.ONE);
            limit = i.subtract(new BigInteger("1000"));
            while (i.compareTo(limit) > -1) {
                assertTrue(isOutOfRange(i));
                i = i.subtract(BigInteger.ONE);
            }
        }

        @Test
        void should_ReturnTrue_WhenCheckingUnsupportedBigDecimalDatatypeValues() {
            assertTrue(isOutOfRange(new BigDecimal("0.0" + BI_MAX_ACCEPTED_VALUE.toString())));
            assertTrue(isOutOfRange(new BigDecimal(BI_MAX_ACCEPTED_VALUE.toString() + "0.0")));
            assertTrue(isOutOfRange(new BigDecimal("-0.0" + BI_MAX_ACCEPTED_VALUE.toString())));
            assertTrue(isOutOfRange(new BigDecimal(BI_MIN_ACCEPTED_VALUE.toString() + "0.0")));

            BigInteger positiveNumber = BI_MAX_ACCEPTED_VALUE.add(BigInteger.TWO);
            BigInteger negativeNumber = BI_MIN_ACCEPTED_VALUE.subtract(BigInteger.TWO);

            for (int i = 0; i < 1000; i++) {
                assertTrue(isOutOfRange(new BigDecimal(positiveNumber.toString() + "." + positiveNumber.toString())));
                assertTrue(isOutOfRange(new BigDecimal(negativeNumber.toString() + "." + positiveNumber.toString())));
                assertTrue(isOutOfRange(new BigDecimal(positiveNumber.toString() + ".0")));
                assertTrue(isOutOfRange(new BigDecimal(negativeNumber.toString() + ".0")));
                positiveNumber = positiveNumber.add(BigInteger.ONE);
                negativeNumber = negativeNumber.subtract(BigInteger.ONE);
            }
        }
    }
}