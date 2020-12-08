package tafqeetj.converters;

import java.util.ArrayList;
import java.util.List;

public class IntegerInWords {
    private String trillions;
    private String billions;
    private String millions;
    private String thousands;
    private String basicNumberGroup;

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

    public void setBasicNumberGroup(String basicNumberGroup) {
        this.basicNumberGroup = basicNumberGroup;
    }

    public boolean isTrillionsPresent(){
        return trillions != null && !trillions.isEmpty();
    }
    public boolean isBillionsPresent(){
        return billions != null && !billions.isEmpty();
    }
    public boolean isMillionsPresent(){
        return millions != null && !millions.isEmpty();
    }
    public boolean isThousandsPresent(){
        return thousands != null && !thousands.isEmpty();
    }
    public boolean isBasicNumberGroupPresent(){
        return basicNumberGroup != null && !basicNumberGroup.isEmpty();
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
        return String.join(" و", numberInWords);
    }
}