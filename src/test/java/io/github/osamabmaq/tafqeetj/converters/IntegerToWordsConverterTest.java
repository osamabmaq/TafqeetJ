package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.NumberSign;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToWordsConverterTest {
    private IntegerToWordsConverter converter;

    @BeforeEach
    void setupConverterObject() {
        converter = IntegerToWordsConverter.getInstance();
    }

    @Test
    void testConvertingByteMethod() {
        assertEquals(IntegerInWords.createZero(), converter.convert((byte) 0));
        assertEquals(getOneInWords(), converter.convert((byte) 1));
        assertEquals(getMinusOneInWords(), converter.convert((byte) -1));
        assertEquals(getByteMaxValueInWords(), converter.convert(Byte.MAX_VALUE));
        assertEquals(getByteMinValueInWords(), converter.convert(Byte.MIN_VALUE));
    }

    @Test
    void testConvertingShortMethod() {
        assertEquals(IntegerInWords.createZero(), converter.convert((short) 0));
        assertEquals(getOneInWords(), converter.convert((short) 1));
        assertEquals(getMinusOneInWords(), converter.convert((short) -1));
        assertEquals(getShortMaxValueInWords(), converter.convert(Short.MAX_VALUE));
        assertEquals(getShortMinValueInWords(), converter.convert(Short.MIN_VALUE));
    }

    @Test
    void testConvertingIntMethod() {
        assertEquals(IntegerInWords.createZero(), converter.convert((int) 0));
        assertEquals(getOneInWords(), converter.convert((int) 1));
        assertEquals(getMinusOneInWords(), converter.convert((int) -1));
        assertEquals(get199InWords(), converter.convert((int) 199));
        assertEquals(getMinus199InWords(), converter.convert((int) -199));
        assertEquals(getIntegerMaxValueInWords(), converter.convert(Integer.MAX_VALUE));
        assertEquals(getIntegerMinValueInWords(), converter.convert(Integer.MIN_VALUE));
    }

    @Test
    void testConvertingLongMethod() {
        assertEquals(IntegerInWords.createZero(), converter.convert(0L));
        assertEquals(getOneInWords(), converter.convert(1L));
        assertEquals(getMinusOneInWords(), converter.convert(-1L));
        assertEquals(get199InWords(), converter.convert(199L));
        assertEquals(getMinus199InWords(), converter.convert(-199L));
        assertEquals(getINTMaxSupportedValueInWords(), converter.convert(
                TafqeetRangeChecker.INT_PRIMITIVES_MAX_SUPPORTED_VALUE)
        );
        assertEquals(getINTMinSupportedValueInWords(), converter.convert(
                TafqeetRangeChecker.INT_PRIMITIVES_MIN_SUPPORTED_VALUE
        ));
    }

    @Test
    void testConvertingBigIntegerMethod() {
        assertEquals(IntegerInWords.createZero(), converter.convert(BigInteger.ZERO));
        assertEquals(getOneInWords(), converter.convert(BigInteger.ONE));
        assertEquals(getMinusOneInWords(), converter.convert(BigInteger.valueOf(-1L)));
        assertEquals(get199InWords(), converter.convert(BigInteger.valueOf(199L)));
        assertEquals(getMinus199InWords(), converter.convert(BigInteger.valueOf(-199L)));
        assertEquals(getINTMaxSupportedValueInWords(), converter.convert(
                TafqeetRangeChecker.BI_MAX_ACCEPTED_VALUE)
        );
        assertEquals(getINTMinSupportedValueInWords(), converter.convert(
                TafqeetRangeChecker.BI_MIN_ACCEPTED_VALUE
        ));
    }

    public static IntegerInWords getOneInWords() {
        IntegerInWords oneInWords = new IntegerInWords();
        oneInWords.setBasicNumberGroup("واحد");
        return oneInWords;
    }

    public static IntegerInWords getMinusOneInWords() {
        IntegerInWords minusOneInWords = new IntegerInWords();
        minusOneInWords.setBasicNumberGroup("واحد");
        minusOneInWords.setSign(NumberSign.NEGATIVE);
        return minusOneInWords;
    }

    public static IntegerInWords get199InWords() {
        IntegerInWords _199InWords = new IntegerInWords();
        _199InWords.setBasicNumberGroup("مئة وتسعة وتسعون");
        return _199InWords;
    }

    public static IntegerInWords getMinus199InWords() {
        IntegerInWords _Minus199InWords = new IntegerInWords();
        _Minus199InWords.setBasicNumberGroup("مئة وتسعة وتسعين");
        _Minus199InWords.setSign(NumberSign.NEGATIVE);
        return _Minus199InWords;
    }

    public static IntegerInWords getIntegerMinValueInWords() {
        IntegerInWords integerMinValueInWords = new IntegerInWords();
        integerMinValueInWords.setBasicNumberGroup("ستمئة وثمانية وأربعين");
        integerMinValueInWords.setThousands("أربعمئة وثلاثة وثمانين ألفًا");
        integerMinValueInWords.setMillions("مئة وسبعة وأربعين مليونًا");
        integerMinValueInWords.setBillions("مليارين");
        integerMinValueInWords.setSign(NumberSign.NEGATIVE);
        return integerMinValueInWords;
    }

    public static IntegerInWords getIntegerMaxValueInWords() {
        IntegerInWords integerMaxValueInWords = new IntegerInWords();
        integerMaxValueInWords.setBasicNumberGroup("ستمئة وسبعة وأربعون");
        integerMaxValueInWords.setThousands("أربعمئة وثلاثة وثمانون ألفًا");
        integerMaxValueInWords.setMillions("مئة وسبعة وأربعون مليونًا");
        integerMaxValueInWords.setBillions("ملياران");
        return integerMaxValueInWords;
    }

    public static IntegerInWords getByteMinValueInWords() {
        IntegerInWords byteMinValueInWords = new IntegerInWords();
        byteMinValueInWords.setBasicNumberGroup("مئة وثمانية وعشرين");
        byteMinValueInWords.setSign(NumberSign.NEGATIVE);
        return byteMinValueInWords;
    }

    public static IntegerInWords getByteMaxValueInWords() {
        IntegerInWords byteMaxValueInWords = new IntegerInWords();
        byteMaxValueInWords.setBasicNumberGroup("مئة وسبعة وعشرون");
        return byteMaxValueInWords;
    }


    public static IntegerInWords getShortMinValueInWords() {
        IntegerInWords shortMinValueInWords = new IntegerInWords();
        shortMinValueInWords.setThousands("اثنين وثلاثين ألفًا");
        shortMinValueInWords.setBasicNumberGroup("سبعمئة وثمانية وستين");
        shortMinValueInWords.setSign(NumberSign.NEGATIVE);
        return shortMinValueInWords;
    }

    public static IntegerInWords getShortMaxValueInWords() {
        IntegerInWords shortMaxValueInWords = new IntegerInWords();
        shortMaxValueInWords.setThousands("اثنان وثلاثون ألفًا");
        shortMaxValueInWords.setBasicNumberGroup("سبعمئة وسبعة وستون");
        return shortMaxValueInWords;
    }

    public static IntegerInWords getINTMinSupportedValueInWords() {
        IntegerInWords intMinSupportedValue = new IntegerInWords();
        intMinSupportedValue.setBasicNumberGroup("تسعمئة وتسعة وتسعين");
        intMinSupportedValue.setThousands("تسعمئة وتسعة وتسعين ألفًا");
        intMinSupportedValue.setMillions("تسعمئة وتسعة وتسعين مليونًا");
        intMinSupportedValue.setBillions("تسعمئة وتسعة وتسعين مليارًا");
        intMinSupportedValue.setTrillions("تسعمئة وتسعة وتسعين ترليونًا");
        intMinSupportedValue.setSign(NumberSign.NEGATIVE);
        return intMinSupportedValue;
    }

    public static IntegerInWords getINTMaxSupportedValueInWords() {
        IntegerInWords intMaxSupportedValue = new IntegerInWords();
        intMaxSupportedValue.setBasicNumberGroup("تسعمئة وتسعة وتسعون");
        intMaxSupportedValue.setThousands("تسعمئة وتسعة وتسعون ألفًا");
        intMaxSupportedValue.setMillions("تسعمئة وتسعة وتسعون مليونًا");
        intMaxSupportedValue.setBillions("تسعمئة وتسعة وتسعون مليارًا");
        intMaxSupportedValue.setTrillions("تسعمئة وتسعة وتسعون ترليونًا");
        return intMaxSupportedValue;
    }
}