package io.github.osamabmaq.tafqeetj.numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThreeDigitsNumberTest {
    @Test
    void should_ThrowException_WhenGivingNumberBiggerThan999OrLessThan0() {
        assertAll(() -> {
            assertThrows(IllegalArgumentException.class, () -> ThreeDigitsNumber.of(-1, NumberSign.POSITIVE));
            assertThrows(IllegalArgumentException.class, () -> ThreeDigitsNumber.of(-1, NumberSign.NEGATIVE));
            assertThrows(IllegalArgumentException.class, () -> ThreeDigitsNumber.of(1000, NumberSign.POSITIVE));
            assertThrows(IllegalArgumentException.class, () -> ThreeDigitsNumber.of(1000, NumberSign.NEGATIVE));
        });
    }

    @Test
    void should_ReturnTrueIfContainsOnes_OtherwiseReturnFalse() {
        for (int i = 0; i < 1000; i++) {
            ThreeDigitsNumber positiveNumber = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumber negativeNumber = ThreeDigitsNumber.of(i, NumberSign.NEGATIVE);
            assertEquals((i % 100) % 10 != 0, positiveNumber.containsOnes(), "When positive");
            assertEquals((i % 100) % 10 != 0, negativeNumber.containsOnes(), "When negative");
        }
    }

    @Test
    void should_ReturnTrueIfContainsTens_OtherwiseReturnFalse() {
        for (int i = 0; i < 1000; i++) {
            ThreeDigitsNumber positiveNumber = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumber negativeNumber = ThreeDigitsNumber.of(i, NumberSign.NEGATIVE);
            assertEquals((i % 100) / 10 != 0, positiveNumber.containsTens(), "When positive");
            assertEquals((i % 100) / 10 != 0, negativeNumber.containsTens(), "When negative");
        }
    }

    @Test
    void should_ReturnTrueIfContainsComposedNumber_OtherwiseReturnFalse() {
        for (int i = 0; i < 1000; i++) {
            ThreeDigitsNumber positiveNumber = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumber negativeNumber = ThreeDigitsNumber.of(i, NumberSign.NEGATIVE);
            final boolean expected = ((i % 100) % 10 != 0) /*ones*/ && (i % 100) / 10 == 1/*ten*/;
            assertEquals(expected, positiveNumber.containsComposedNumber(), "When positive");
            assertEquals(expected, negativeNumber.containsComposedNumber(), "When negative");
        }
    }

    @Test
    void should_ReturnTrueIfContainsHundreds_OtherwiseReturnFalse() {
        for (int i = 0; i < 1000; i++) {
            ThreeDigitsNumber positiveNumber = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumber negativeNumber = ThreeDigitsNumber.of(i, NumberSign.NEGATIVE);
            assertEquals(i / 100 != 0, positiveNumber.containsHundreds(), "When positive");
            assertEquals(i / 100 != 0, negativeNumber.containsHundreds(), "When negative");
        }
    }
}