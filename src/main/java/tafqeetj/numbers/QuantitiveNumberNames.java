package tafqeetj.numbers;

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
    public String toString() {
        return "QuantitiveNumberNames{" +
                "nameWhenEqualsOne='" + nameWhenEqualsOne + '\'' +
                ", nameWhenEqualsTwo='" + nameWhenEqualsTwo + '\'' +
                ", nameWhenBetweenThreeAndTen='" + nameWhenBetweenThreeAndTen + '\'' +
                ", nameWhenBetweenElevenAndNinetyNine='" + nameWhenBetweenElevenAndNinetyNine + '\'' +
                '}';
    }
}