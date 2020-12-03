package tafqeetj.converters;

import tafqeetj.numbers.ThreeDigitsNumber;

import java.util.Objects;

public class ThreeDigitsNumberDisassembler {
    private final ThreeDigitsNumber threeDigitsNumber;

    public ThreeDigitsNumberDisassembler(ThreeDigitsNumber threeDigitsNumber) {
        this.threeDigitsNumber = Objects.requireNonNull(threeDigitsNumber);
    }

    public ThreeDigitsNumber getThreeDigitsNumber(){
        return threeDigitsNumber;
    }

    public int getHundreds() {
        if (!threeDigitsNumber.containsHundreds())
            throw new IllegalStateException("Number does not contain hundreds");
        return (threeDigitsNumber.getNumber() / 100) * 100;
    }

    public int getTens() {
        if (!threeDigitsNumber.containsTens())
            throw new IllegalStateException("Number does not contain tens");
        return ((threeDigitsNumber.getNumber() % 100) / 10) * 10;
    }

    public int getComposedNumber() {
        if (!threeDigitsNumber.containsComposedNumber())
            throw new IllegalStateException("Number does not contain composed number");
        return threeDigitsNumber.getNumber() % 100;
    }

    public int getOnes() {
        if (!threeDigitsNumber.containsOnes())
            throw new IllegalStateException("Number does not contain ones");
        return (threeDigitsNumber.getNumber() % 100) % 10;
    }
}