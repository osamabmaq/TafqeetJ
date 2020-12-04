package tafqeetj.numbers;

import java.util.Objects;

public class ThreeDigitsNumber {
    private final int number;

    private ThreeDigitsNumber(int number) {
        if (number < 0 || number > 999)
            throw new IllegalArgumentException("Number must be between 1 and 999 inclusive "+number);
        this.number = number;
    }

    public static ThreeDigitsNumber of(int number) {
        return new ThreeDigitsNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public boolean containsHundreds() {
        return number / 100 != 0;
    }

    public boolean containsTens() {
        return (number % 100) / 10 != 0;
    }

    public boolean containsOnes() {
        return (number % 100) % 10 != 0;
    }

    public boolean containsComposedNumber() {
        return containsTens() && containsOnes() && (number % 100) / 10 == 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreeDigitsNumber that = (ThreeDigitsNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "ThreeDigitsNumber{" +
                "number=" + number +
                '}';
    }
}