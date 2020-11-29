package tafqeetj.numbers;

import java.util.Objects;

public class QuantitiveNumberNames {
    private final String nameWhenEqualsOne;
    private final String nameWhenEqualsTwo;
    private final String nameWhenBetweenThreeAndTen; //Inclusive
    private final String nameWhenBetweenElevenAndNinetyNine; //Inclusive

    public QuantitiveNumberNames(String nameWhenEqualsOne,
                                 String nameWhenEqualsTwo,
                                 String nameWhenBetweenThreeAndTen,
                                 String nameWhenBetweenElevenAndNinetyNine) {
        this.nameWhenEqualsOne = nameWhenEqualsOne;
        this.nameWhenEqualsTwo = nameWhenEqualsTwo;
        this.nameWhenBetweenThreeAndTen = nameWhenBetweenThreeAndTen;
        this.nameWhenBetweenElevenAndNinetyNine = nameWhenBetweenElevenAndNinetyNine;
    }

    public String getNameWhenEqualsOne() {
        return nameWhenEqualsOne;
    }

    public String getNameWhenEqualsTwo() {
        return nameWhenEqualsTwo;
    }

    public String getNameWhenBetweenThreeAndTen() {
        return nameWhenBetweenThreeAndTen;
    }

    public String getNameWhenBetweenElevenAndNinetyNine() {
        return nameWhenBetweenElevenAndNinetyNine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantitiveNumberNames that = (QuantitiveNumberNames) o;
        return nameWhenEqualsOne.equals(that.nameWhenEqualsOne) &&
                nameWhenEqualsTwo.equals(that.nameWhenEqualsTwo) &&
                nameWhenBetweenThreeAndTen.equals(that.nameWhenBetweenThreeAndTen) &&
                nameWhenBetweenElevenAndNinetyNine.equals(that.nameWhenBetweenElevenAndNinetyNine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nameWhenEqualsOne,
                nameWhenEqualsTwo,
                nameWhenBetweenThreeAndTen,
                nameWhenBetweenElevenAndNinetyNine
        );
    }

    @Override
    public String toString() {
        return "QuantitiveNumberNames{" +
                "nameWhenEqualsOne='" + nameWhenEqualsOne + '\'' +
                ", nameWhenEqualsTwo='" + nameWhenEqualsTwo + '\'' +
                ", nameWhenBetweenThreeAndTen='" + nameWhenBetweenThreeAndTen + '\'' +
                ", nameWhenBetweenElevenAndNinetyNine='" + nameWhenBetweenElevenAndNinetyNine + '\'' +
                '}';
    }
}