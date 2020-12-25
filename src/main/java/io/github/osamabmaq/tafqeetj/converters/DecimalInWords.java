package io.github.osamabmaq.tafqeetj.converters;

import java.util.Objects;

public class DecimalInWords {
    private final IntegerInWords numberLeftDecimalPoint;
    private final IntegerInWords numberRightDecimalPoint;
    private final String fractionalRatioName;

    public DecimalInWords(IntegerInWords numberLeftDecimalPoint,
                          IntegerInWords numberRightDecimalPoint,
                          String fractionalRatioName) {
        this.numberLeftDecimalPoint = Objects.requireNonNull(numberLeftDecimalPoint);
        this.numberRightDecimalPoint = Objects.requireNonNull(numberRightDecimalPoint);
        if (numberRightDecimalPoint.equals(IntegerInWords.createZero()))
            fractionalRatioName = "";
        this.fractionalRatioName = Objects.requireNonNull(fractionalRatioName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecimalInWords that = (DecimalInWords) o;
        return numberLeftDecimalPoint.equals(that.numberLeftDecimalPoint)
                && numberRightDecimalPoint.equals(that.numberRightDecimalPoint)
                && fractionalRatioName.equals(that.fractionalRatioName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberLeftDecimalPoint, numberRightDecimalPoint, fractionalRatioName);
    }

    @Override
    public String toString() {
        StringBuilder numberInWords = new StringBuilder();
        numberInWords.append(numberLeftDecimalPoint.toString());
        numberInWords.append(" فاصلة ").append(numberRightDecimalPoint.toString());
        if (!fractionalRatioName.isEmpty())
            numberInWords.append(" ").append(fractionalRatioName);
        return numberInWords.toString();
    }
}