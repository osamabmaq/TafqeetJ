package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.NumberSign;
import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDigitsNumberDisassemblerTest {
    @Test
    void should_ReturnOnesNumber_WhenPassingNumberContainsOnes() {
        for (int i = 1; i < 10; i++) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertEquals(i, disassembler.getOnes(), "When passing " + i);
        }
    }

    @Test
    void should_ThrowException_WhenGettingOnesFromNumberDoesNotContainOnes() {
        for (int i = 0; i < 100; i += 10) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertThrows(IllegalStateException.class, disassembler::getOnes, "When passing " + i);
        }
        for (int i = 0; i < 1_000; i += 100) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertThrows(IllegalStateException.class, disassembler::getOnes, "When passing " + i);
        }
    }

    @Test
    void should_ReturnTensNumber_WhenPassingNumberContainsTens() {
        for (int i = 10; i < 100; i += 10) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertEquals(i, disassembler.getTens(), "When passing " + i);
        }
    }

    @Test
    void should_ThrowException_WhenGettingTensFromNumberDoesNotContainTens() {
        for (int i = 0; i < 10; i++) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertThrows(IllegalStateException.class, disassembler::getTens, "When passing " + i);
        }
        for (int i = 0; i < 1_000; i += 100) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertThrows(IllegalStateException.class, disassembler::getTens, "When passing " + i);
        }
    }

    @Test
    void should_ReturnComposedNumber_WhenPassingNumberContainsComposedNumber() {
        for (int i = 11; i < 20; i++) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertEquals(i, disassembler.getComposedNumber(), "When passing " + i);
        }
    }

    @Test
    void should_ThrowException_WhenGettingComposedNumberFromNumberDoesNotContainComposedNumber() {
        for (int i = 0; i < 10; i++) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertThrows(IllegalStateException.class, disassembler::getComposedNumber, "When passing " + i);
        }
        for (int i = 0; i < 100; i += 10) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertThrows(IllegalStateException.class, disassembler::getComposedNumber, "When passing " + i);
        }
        for (int i = 0; i < 1_000; i += 100) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertThrows(IllegalStateException.class, disassembler::getComposedNumber, "When passing " + i);
        }
    }

    @Test
    void should_ReturnHundredsNumber_WhenPassingNumberContainsHundredsNumber() {
        for (int i = 100; i < 1_000; i += 100) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertEquals(i, disassembler.getHundreds(), "When passing " + i);
        }
    }

    @Test
    void should_ThrowException_WhenGettingHundredsFromNumberDoesNotContainHundredsNumber() {
        for (int i = 0; i < 99; i++) {
            ThreeDigitsNumber number = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
            ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
            assertThrows(IllegalStateException.class, disassembler::getHundreds, "When passing " + i);
        }
    }
}