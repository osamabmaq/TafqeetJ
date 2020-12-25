package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.NumberSign;
import io.github.osamabmaq.tafqeetj.numbers.positive.PositiveBasicNumbersPLacesNames;

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

    public static IntegerInWords createZero() {
        IntegerInWords zero = new IntegerInWords();
        zero.setBasicNumberGroup(PositiveBasicNumbersPLacesNames.getInstance().getOnesMap().get(0));
        return zero;
    }

    public void setTrillions(String trillions) {
        if (trillions.isEmpty())
            return;
        this.trillions = trillions;
    }

    public void setBillions(String billions) {
        if (billions.isEmpty())
            return;
        this.billions = billions;
    }

    public void setMillions(String millions) {
        if (millions.isEmpty())
            return;
        this.millions = millions;
    }

    public void setThousands(String thousands) {
        if (thousands.isEmpty())
            return;
        this.thousands = thousands;
    }


    public void setBasicNumberGroup(String basicNumberGroup) {
        if (basicNumberGroup.isEmpty())
            return;
        this.basicNumberGroup = basicNumberGroup;
    }

    public void setSign(NumberSign sign) {
        if (sign == null)
            return;
        this.sign = sign;
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

    public NumberSign getSign() {
        return sign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerInWords that = (IntegerInWords) o;
        return sign == that.sign
                && Objects.equals(trillions, that.trillions)
                && Objects.equals(billions, that.billions)
                && Objects.equals(millions, that.millions)
                && Objects.equals(thousands, that.thousands)
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