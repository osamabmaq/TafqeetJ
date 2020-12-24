package io.github.osamabmaq.tafqeetj.numbers;

import java.util.Objects;

public class ThreeDigitsNumber {
    private final int number;
    private final NumberSign sign;

    private ThreeDigitsNumber(int number, NumberSign sign) {
        if (number < 0 || number > 999)
            throw new IllegalArgumentException("Number must be between 0 and 999 inclusive: " + number);
        this.number = number;
        this.sign = sign;
    }

    public static ThreeDigitsNumber of(int number, NumberSign sign) {
        return new ThreeDigitsNumber(number, sign);
    }

    public int getNumber() {
        return number;
    }

    public NumberSign getSign() {
        return sign;
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
        return number == that.number && sign == that.sign;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, sign);
    }

    @Override
    public String toString() {
        return "ThreeDigitsNumber{" +
                "number=" + number +
                ", sign=" + sign +
                '}';
    }
}