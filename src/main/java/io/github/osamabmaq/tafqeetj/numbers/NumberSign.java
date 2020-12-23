package io.github.osamabmaq.tafqeetj.numbers;

import io.github.osamabmaq.tafqeetj.converters.BasicNumberConverter;
import io.github.osamabmaq.tafqeetj.converters.BasicNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.converters.QuantitiveNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.converters.negative.NegativeQuantitiveNumberConvertersFactory;
import io.github.osamabmaq.tafqeetj.converters.positive.PositiveQuantitiveNumberConvertersFactory;

import java.math.BigDecimal;
import java.math.BigInteger;

public enum NumberSign {
    POSITIVE(
            PositiveQuantitiveNumberConvertersFactory.getInstance(),
            BasicNumberConverterFactory.getPositiveConverter()
    ),
    NEGATIVE(
            NegativeQuantitiveNumberConvertersFactory.getInstance(),
            BasicNumberConverterFactory.getNegativeConverter()
    );

    private final QuantitiveNumberConverterFactory quantitiveNumberConverterFactory;
    private final BasicNumberConverter basicNumberConverter;

    NumberSign(QuantitiveNumberConverterFactory quantitiveNumberConverterFactory,
               BasicNumberConverter basicNumberConverter) {
        this.quantitiveNumberConverterFactory = quantitiveNumberConverterFactory;
        this.basicNumberConverter = basicNumberConverter;
    }

    public QuantitiveNumberConverterFactory getQuantitiveNumberConverterFactory() {
        return quantitiveNumberConverterFactory;
    }

    public BasicNumberConverter getBasicNumberConverter() {
        return basicNumberConverter;
    }

    public static NumberSign signOf(int number) {
        if (number >= 0)
            return POSITIVE;
        return NEGATIVE;
    }

    public static NumberSign signOf(byte number) {
        if (number >= 0)
            return POSITIVE;
        return NEGATIVE;
    }

    public static NumberSign signOf(short number) {
        if (number >= 0)
            return POSITIVE;
        return NEGATIVE;
    }

    public static NumberSign signOf(long number) {
        if (number >= 0L)
            return POSITIVE;
        return NEGATIVE;
    }

    public static NumberSign signOf(BigInteger number) {
        if (number.signum() >= 0)
            return POSITIVE;
        return NEGATIVE;
    }

    public static NumberSign signOf(BigDecimal number) {
        if (number.signum() >= 0)
            return POSITIVE;
        return NEGATIVE;
    }
}