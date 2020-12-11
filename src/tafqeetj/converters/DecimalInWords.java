package tafqeetj.converters;

import java.util.Objects;

public class DecimalInWords {
    private IntegerInWords numberLeftDecimalPoint;
    private IntegerInWords numberRightDecimalPoint;
    private String fractionalRatioName;

    public void setNumberLeftDecimalPoint(IntegerInWords numberLeftDecimalPoint) {
        this.numberLeftDecimalPoint = numberLeftDecimalPoint;
    }

    public void setNumberRightDecimalPoint(IntegerInWords numberRightDecimalPoint) {
        this.numberRightDecimalPoint = numberRightDecimalPoint;
    }

    public void setFractionalRatioName(String decimalLengthName) {
        this.fractionalRatioName = decimalLengthName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecimalInWords that = (DecimalInWords) o;
        return numberLeftDecimalPoint.equals(that.numberLeftDecimalPoint)
                && numberRightDecimalPoint.equals(that.numberRightDecimalPoint)
                && Objects.equals(fractionalRatioName, that.fractionalRatioName);
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
        if (!numberRightDecimalPoint.equals(IntegerInWords.ZERO))
            numberInWords.append(" ").append(fractionalRatioName);
        return numberInWords.toString();
    }
}