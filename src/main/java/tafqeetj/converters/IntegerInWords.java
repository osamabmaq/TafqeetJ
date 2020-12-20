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
        return this.trillions != null && !this.trillions.isEmpty();
    }

    public boolean isBillionsPresent() {
        return this.billions != null && !this.billions.isEmpty();
    }

    public boolean isMillionsPresent() {
        return this.millions != null && !this.millions.isEmpty();
    }

    public boolean isThousandsPresent() {
        return this.thousands != null && !this.thousands.isEmpty();
    }

    public boolean isBasicNumberGroupPresent() {
        return this.basicNumberGroup != null && !this.basicNumberGroup.isEmpty();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        IntegerInWords that = (IntegerInWords) other;
        return this.sign == that.sign
                && Objects.equals(this.trillions, that.trillions) && Objects.equals(this.billions, that.billions)
                && Objects.equals(this.millions, that.millions) && Objects.equals(this.thousands, that.thousands)
                && Objects.equals(this.basicNumberGroup, that.basicNumberGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.sign, this.trillions, this.billions, this.millions, this.thousands, this.basicNumberGroup);
    }

    @Override
    public String toString() {
        List<String> numberInWords = new ArrayList<>();
        if (isTrillionsPresent()) {
            numberInWords.add(this.trillions);
        }
        if (isBillionsPresent()) {
            numberInWords.add(this.billions);
        }
        if (isMillionsPresent()) {
            numberInWords.add(this.millions);
        }
        if (isThousandsPresent()) {
            numberInWords.add(this.thousands);
        }
        if (isBasicNumberGroupPresent()) {
            numberInWords.add(this.basicNumberGroup);
        }
        return (this.sign == NumberSign.POSITIVE ? "" : "سالب ") + String.join(" و", numberInWords);
    }
}