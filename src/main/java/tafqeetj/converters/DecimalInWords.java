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
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        DecimalInWords that = (DecimalInWords) other;
        return this.numberLeftDecimalPoint.equals(that.numberLeftDecimalPoint)
                && this.numberRightDecimalPoint.equals(that.numberRightDecimalPoint)
                && Objects.equals(this.fractionalRatioName, that.fractionalRatioName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.numberLeftDecimalPoint, this.numberRightDecimalPoint, this.fractionalRatioName);
    }

    @Override
    public String toString() {
        StringBuilder numberInWords = new StringBuilder();
        numberInWords.append(this.numberLeftDecimalPoint.toString());
        numberInWords.append(" فاصلة ").append(this.numberRightDecimalPoint.toString());
        if (!this.numberRightDecimalPoint.equals(IntegerInWords.ZERO)) {
            numberInWords.append(" ").append(this.fractionalRatioName);
        }
        return numberInWords.toString();
    }
}