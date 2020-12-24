package io.github.osamabmaq.tafqeetj.converters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalInWordsTest {
    @Test
    void should_GenerateTheSameDataAsProvided() {
        DecimalInWords decimal = new DecimalInWords(
                createLeftNumber(), createRightNumber(), "بالكوادرليون"
        );
        String expected = "ترليون ومئة مليار ومليار ومليونان ومئتا ألف ومئة وخمسة وستون"
                + " فاصلة "
                + "ترليون ومئة مليار ومليار ومليونين ومئتي ألف ومئة وخمسة وستين"
                + " بالكوادرليون";
        assertEquals(expected, decimal.toString());
    }

    @Test
    void should_GenerateZeroPointRightNumberAndFractionalRatioName_WhenPassingZeroAndRightNumberAndFractionalRatioName() {
        DecimalInWords decimal = new DecimalInWords(
                IntegerInWords.ZERO, createRightNumber(), "بالكوادرليون"
        );
        String expected = "صفر"
                + " فاصلة "
                + "ترليون ومئة مليار ومليار ومليونين ومئتي ألف ومئة وخمسة وستين"
                + " بالكوادرليون";
        assertEquals(expected, decimal.toString());
    }

    @Test
    void should_GenerateLeftNumberPointZero_WhenPassingLeftNumberPointZero() {
        DecimalInWords decimal = new DecimalInWords(
                createLeftNumber(), IntegerInWords.ZERO, ""
        );
        String expected = "ترليون ومئة مليار ومليار ومليونان ومئتا ألف ومئة وخمسة وستون"
                + " فاصلة "
                + "صفر";
        assertEquals(expected, decimal.toString());
    }

    @Test
    void should_GenerateZeroPointZero_WhenPassingZeroPointZero() {
        DecimalInWords decimal = new DecimalInWords(
                IntegerInWords.ZERO, IntegerInWords.ZERO, ""
        );
        String expected = "صفر"
                + " فاصلة "
                + "صفر";
        assertEquals(expected, decimal.toString());
    }

    private IntegerInWords createLeftNumber() {
        IntegerInWords number = new IntegerInWords();
        number.setBasicNumberGroup("مئة وخمسة وستون");
        number.setThousands("مئتا ألف");
        number.setMillions("مليونان");
        number.setBillions("مئة مليار ومليار");
        number.setTrillions("ترليون");
        return number;
    }

    private IntegerInWords createRightNumber() {
        IntegerInWords number = new IntegerInWords();
        number.setBasicNumberGroup("مئة وخمسة وستين");
        number.setThousands("مئتي ألف");
        number.setMillions("مليونين");
        number.setBillions("مئة مليار ومليار");
        number.setTrillions("ترليون");
        return number;
    }
}