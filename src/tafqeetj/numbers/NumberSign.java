package tafqeetj.numbers;

import tafqeetj.converters.BasicNumberConverter;
import tafqeetj.converters.BasicNumberConverterFactory;
import tafqeetj.converters.QuantitiveNumberConverterFactory;
import tafqeetj.converters.negative.NegativeQuantitiveNumberConvertersFactory;
import tafqeetj.converters.positive.PositiveQuantitiveNumberConvertersFactory;
import tafqeetj.numbers.negative.NegativeBasicNumberPlacesNames;
import tafqeetj.numbers.positive.PositiveBasicNumbersPLacesNames;

import java.math.BigDecimal;
import java.math.BigInteger;

public enum NumberSign {
    POSITIVE(
            PositiveQuantitiveNumberConvertersFactory.getInstance(),
            BasicNumberConverterFactory.getPositiveConverter(),
            PositiveBasicNumbersPLacesNames.getInstance()
    ),
    NEGATIVE(
            NegativeQuantitiveNumberConvertersFactory.getInstance(),
            BasicNumberConverterFactory.getNegativeConverter(),
            NegativeBasicNumberPlacesNames.getInstance()
    );

    private final QuantitiveNumberConverterFactory quantitiveNumberConverterFactory;
    private final BasicNumberConverter basicNumberConverter;
    private final BasicNumberPlacesNames basicNumberPlacesNames;

    NumberSign(QuantitiveNumberConverterFactory quantitiveNumberConverterFactory,
               BasicNumberConverter basicNumberConverter,
               BasicNumberPlacesNames basicNumberPlacesNames) {
        this.quantitiveNumberConverterFactory = quantitiveNumberConverterFactory;
        this.basicNumberConverter = basicNumberConverter;
        this.basicNumberPlacesNames = basicNumberPlacesNames;
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

    public static NumberSign signOf(long number) {
        if (number >= 0)
            return POSITIVE;
        return NEGATIVE;
    }

    public static NumberSign signOf(byte number) {
        if (number >= 0)
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