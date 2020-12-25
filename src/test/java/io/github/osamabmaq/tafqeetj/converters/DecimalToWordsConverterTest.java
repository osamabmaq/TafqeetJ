package io.github.osamabmaq.tafqeetj.converters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static io.github.osamabmaq.tafqeetj.numbers.NumberSign.*;
import static org.junit.jupiter.api.Assertions.*;
import static io.github.osamabmaq.tafqeetj.converters.IntegerToWordsConverterTest.*;

class DecimalToWordsConverterTest {
    private DecimalToWordsConverter converter;

    @BeforeEach
    void setupConverterObject() {
        converter = DecimalToWordsConverter.getInstance();
    }

    @Test
    void testNumberPointZero() {
        assertEquals(getZeroPointZero(), converter.convert(new BigDecimal("0.0")));
        assertEquals(getMaxValuePointZero(), converter.convert(
                new BigDecimal(TafqeetRangeChecker.BI_MAX_ACCEPTED_VALUE + ".0"))
        );
        assertEquals(getMinusMinValuePointZero(), converter.convert(
                new BigDecimal(TafqeetRangeChecker.BI_MIN_ACCEPTED_VALUE + ".0"))
        );
    }

    @Test
    void testZeroPointNumber() {
        assertEquals(getZeroPointMaxValue(), converter.convert(
                new BigDecimal("0." + TafqeetRangeChecker.BI_MAX_ACCEPTED_VALUE))
        );
        assertEquals(getMinusZeroPointMinValue(), converter.convert(
                new BigDecimal("-0." + TafqeetRangeChecker.BI_MAX_ACCEPTED_VALUE))
        );
    }

    @Test
    void testNumberPointNumber() {
        assertEquals(getMaxValuePointMaxValue(), converter.convert(
                new BigDecimal(
                        TafqeetRangeChecker.BI_MAX_ACCEPTED_VALUE
                                + "."
                                + TafqeetRangeChecker.BI_MAX_ACCEPTED_VALUE
                )
                )
        );
        assertEquals(getMinusMinValuePointMinValue(), converter.convert(
                new BigDecimal(
                        TafqeetRangeChecker.BI_MIN_ACCEPTED_VALUE
                                + "."
                                + TafqeetRangeChecker.BI_MAX_ACCEPTED_VALUE
                )
                )
        );
    }

    public static DecimalInWords getZeroPointZero() {
        return new DecimalInWords(IntegerInWords.createZero(), IntegerInWords.createZero(), "");
    }

    public static DecimalInWords getZeroPointMaxValue() {
        return new DecimalInWords(
                IntegerInWords.createZero(),
                getFractionalMaxSupportedValue(),
                "بالكوادرليون"
        );
    }

    public static DecimalInWords getMaxValuePointZero() {
        return new DecimalInWords(
                getINTMaxSupportedValueInWords(),
                IntegerInWords.createZero(),
                ""
        );
    }

    public static DecimalInWords getMaxValuePointMaxValue() {
        return new DecimalInWords(
                getINTMaxSupportedValueInWords(),
                getFractionalMaxSupportedValue(),
                "بالكوادرليون"
        );
    }

    public static DecimalInWords getMinusZeroPointMinValue() {
        return new DecimalInWords(
                getMinusZero(),
                getFractionalMaxSupportedValue(),
                "بالكوادرليون"
        );
    }

    public static DecimalInWords getMinusMinValuePointZero() {
        return new DecimalInWords(
                getINTMinSupportedValueInWords(),
                IntegerInWords.createZero(),
                ""
        );
    }

    public static DecimalInWords getMinusMinValuePointMinValue() {
        return new DecimalInWords(getINTMinSupportedValueInWords(),
                getFractionalMaxSupportedValue(),
                "بالكوادرليون"
        );
    }

    public static IntegerInWords getFractionalMaxSupportedValue() {
        IntegerInWords fractionalMaxSupportedValue = IntegerToWordsConverterTest.getINTMinSupportedValueInWords();
        fractionalMaxSupportedValue.setSign(POSITIVE);
        return fractionalMaxSupportedValue;
    }

    public static IntegerInWords getMinusZero() {
        IntegerInWords minusZero = new IntegerInWords();
        minusZero.setBasicNumberGroup("صفر");
        minusZero.setSign(NEGATIVE);
        return minusZero;
    }
}