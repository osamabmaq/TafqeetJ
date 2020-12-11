package tafqeetj.converters;

import tafqeetj.numbers.NumberSign;
import tafqeetj.numbers.positive.PositiveBasicNumbersPLacesNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IntegerInWords {
    private NumberSign sign = NumberSign.POSITIVE;
    private String trillions;
    private String billions;
    private String millions;
    private String thousands;
    private String basicNumberGroup;

    public static final IntegerInWords ZERO;

    static {
        ZERO = new IntegerInWords();
        ZERO.setBasicNumberGroup(PositiveBasicNumbersPLacesNames.getInstance().getOnesMap().get(0));
    }

    public void setTrillions(String trillions) {
        this.trillions = trillions;
    }

    public void setBillions(String billions) {
        this.billions = billions;
    }

    public void setMillions(String millions) {
        this.millions = millions;
    }

    public void setThousands(String thousands) {
        this.thousands = thousands;
    }

    public void setSign(NumberSign sign) {
        this.sign = sign;
    }

    public void setBasicNumberGroup(String basicNumberGroup) {
        this.basicNumberGroup = basicNumberGroup;
    }

    public boolean isTrillionsPresent() {
        return trillions != null && !trillions.isEmpty();
    }

    public boolean isBillionsPresent() {
        return billions != null && !billions.isEmpty();
    }

    public boolean isMillionsPresent() {
        return millions != null && !millions.isEmpty();
    }

    public boolean isThousandsPresent() {
        return thousands != null && !thousands.isEmpty();
    }

    public boolean isBasicNumberGroupPresent() {
        return basicNumberGroup != null && !basicNumberGroup.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerInWords that = (IntegerInWords) o;
        return sign == that.sign
                && Objects.equals(trillions, that.trillions) && Objects.equals(billions, that.billions)
                && Objects.equals(millions, that.millions) && Objects.equals(thousands, that.thousands)
                && Objects.equals(basicNumberGroup, that.basicNumberGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sign, trillions, billions, millions, thousands, basicNumberGroup);
    }

    @Override
    public String toString() {
        List<String> numberInWords = new ArrayList<>();
        if (isTrillionsPresent())
            numberInWords.add(trillions);
        if (isBillionsPresent())
            numberInWords.add(billions);
        if (isMillionsPresent())
            numberInWords.add(millions);
        if (isThousandsPresent())
            numberInWords.add(thousands);
        if (isBasicNumberGroupPresent())
            numberInWords.add(basicNumberGroup);
        return (sign == NumberSign.POSITIVE ? "" : "سالب ") + String.join(" و", numberInWords);
    }
}