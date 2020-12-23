package io.github.osamabmaq.tafqeetj.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantitiveNumberNamesTest {
    private QuantitiveNumberNames quantitiveNumberNames;

    @BeforeEach
    void setupQuantitiveNumberNamesObject() {
        quantitiveNumberNames = new QuantitiveNumberNames(
                "مليون",
                "مليونان",
                "ملايين",
                "مليونًا"
        );
    }

    @Test
    void should_Return_مليون_WhenGettingNameWhenEqualsOne() {
        assertEquals("مليون", quantitiveNumberNames.getNameWhenEqualsOne());
    }

    @Test
    void should_Return_مليونان_WhenGettingNameWhenEqualsTwo() {
        assertEquals("مليونان", quantitiveNumberNames.getNameWhenEqualsTwo());
    }

    @Test
    void should_Return_ملايين_WhenGettingNameBetweenThreeAndTen() {
        assertEquals("ملايين", quantitiveNumberNames.getNameWhenBetweenThreeAndTen());
    }

    @Test
    void should_Return_مليونًا_WhenGettingNameWhenBetweenElevenAndNinetyNine() {
        assertEquals("مليونًا", quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine());
    }
}