package tafqeetj.numbers;

public class ThreeDigitsNumber {
    private final int number;

    private ThreeDigitsNumber(int number) {
        if (number < 1 || number > 999)
            throw new IllegalArgumentException("Number must be between 1 and 999 inclusive");
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
}