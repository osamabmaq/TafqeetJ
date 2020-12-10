package tafqeetj.converters;

import java.util.Objects;

public class DecimalInWords {
    private IntegerInWords numberLeftTheComma;
    private IntegerInWords numberRightTheComma;
    private String decimalLengthName;

    public void setNumberLeftTheComma(IntegerInWords numberLeftTheComma) {
        this.numberLeftTheComma = numberLeftTheComma;
    }

    public void setNumberRightTheComma(IntegerInWords numberRightTheComma) {
        this.numberRightTheComma = numberRightTheComma;
    }

    public void setDecimalLengthName(String decimalLengthName) {
        this.decimalLengthName = decimalLengthName;
    }

    public IntegerInWords getNumberLeftTheComma() {
        return numberLeftTheComma;
    }

    public IntegerInWords getNumberRightTheComma() {
        return numberRightTheComma;
    }

    public String getDecimalLengthName() {
        return decimalLengthName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecimalInWords that = (DecimalInWords) o;
        return numberLeftTheComma.equals(that.numberLeftTheComma)
                && numberRightTheComma.equals(that.numberRightTheComma)
                && Objects.equals(decimalLengthName, that.decimalLengthName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberLeftTheComma, numberRightTheComma, decimalLengthName);
    }

    @Override
    public String toString() {
        StringBuilder numberInWords = new StringBuilder();
        numberInWords.append(numberLeftTheComma);
        numberInWords.append(" فاصلة ").append(numberRightTheComma);
        if (!numberRightTheComma.equals(IntegerInWords.ZERO))
            numberInWords.append(" ").append(decimalLengthName);
        return numberInWords.toString();
    }
}