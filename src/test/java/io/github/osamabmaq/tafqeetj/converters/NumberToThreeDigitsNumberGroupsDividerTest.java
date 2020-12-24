package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.NumberSign;
import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NumberToThreeDigitsNumberGroupsDividerTest {
    private NumberToThreeDigitsNumberGroupsDivider divider;

    @BeforeEach
    void setupDividerObject() {
        divider = new NumberToThreeDigitsNumberGroupsDivider();
    }

    @Nested
    class TestWhenPassingPositiveNumber {
        @Test
        void should_ReturnMapContainsBasicNumberGroup_WhenPassingPositiveNumberBetween0And999() {
            for (int i = 0; i < 1_000; i++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(i);
                ThreeDigitsNumber basicNumberGroup = ThreeDigitsNumber.of(i, NumberSign.POSITIVE);
                assertEquals(basicNumberGroup, numbersGroupsMap.get("basicNumberGroup"));
                assertEquals(1, numbersGroupsMap.size(), "Should have exactly one entry");
            }
        }

        @Test
        void should_ReturnMapContainsThousandsGroup_WhenPassingPositiveNumberBetween1_000And999_999() {
            for (int i = 1_000, k = 1; i < 1_000_000; i += 1_000, k++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(i);
                ThreeDigitsNumber thousandsGroup = ThreeDigitsNumber.of(k, NumberSign.POSITIVE);
                assertEquals(thousandsGroup, numbersGroupsMap.get("thousands"));
                assertEquals(2, numbersGroupsMap.size(), "Should have exactly two entries");
            }
        }

        @Test
        void should_ReturnMapContainsMillionsGroup_WhenPassingPositiveNumberBetween1_000_000And999_999_999() {
            for (int i = 1_000_000, k = 1; i < 1_000_000_000; i += 1_000_000, k++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(i);
                ThreeDigitsNumber millionsGroup = ThreeDigitsNumber.of(k, NumberSign.POSITIVE);
                assertEquals(millionsGroup, numbersGroupsMap.get("millions"));
                assertEquals(3, numbersGroupsMap.size(), "Should have exactly three entries");
            }
        }

        @Test
        void should_ReturnMapContainsBillionsGroup_WhenPassingPositiveNumberBetween1_000_000_000And999_999_999_999() {
            int k = 1;
            for (long i = 1_000_000_000; i < 1_000_000_000_000L; i += 1_000_000_000, k++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(i);
                ThreeDigitsNumber billionsGroup = ThreeDigitsNumber.of(k, NumberSign.POSITIVE);
                assertEquals(billionsGroup, numbersGroupsMap.get("billions"));
                assertEquals(4, numbersGroupsMap.size(), "Should have exactly four entries");
            }
        }

        @Test
        void should_ReturnMapContainsTrillionsGroup_WhenPassingPositiveNumberBetween1_000_000_000_000And999_999_999_999_999() {
            int k = 1;
            for (long i = 1_000_000_000_000L; i < 1_000_000_000_000_000L; i += 1_000_000_000_000L, k++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(i);
                ThreeDigitsNumber billionsGroup = ThreeDigitsNumber.of(k, NumberSign.POSITIVE);
                assertEquals(billionsGroup, numbersGroupsMap.get("trillions"));
                assertEquals(5, numbersGroupsMap.size(), "Should have exactly five entries");
            }
        }
    }

    @Nested
    class TestWhenPassingNegativeNumber {
        @Test
        void should_ReturnMapContainsBasicNumberGroup_WhenPassingNegativeNumberBetween0And999() {
            for (int i = 1 /*Shouldn't pass 0 because it can't be negative*/; i < 1_000; i++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(-i);
                ThreeDigitsNumber basicNumberGroup = ThreeDigitsNumber.of(i, NumberSign.NEGATIVE);
                assertEquals(basicNumberGroup, numbersGroupsMap.get("basicNumberGroup"));
                assertEquals(1, numbersGroupsMap.size(), "Should have exactly one entry");
            }
        }

        @Test
        void should_ReturnMapContainsThousandsGroup_WhenPassingPositiveNumberBetween1_000And999_999() {
            for (int i = 1_000, k = 1; i < 1_000_000; i += 1_000, k++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(-i);
                ThreeDigitsNumber thousandsGroup = ThreeDigitsNumber.of(k, NumberSign.NEGATIVE);
                assertEquals(thousandsGroup, numbersGroupsMap.get("thousands"));
                assertEquals(2, numbersGroupsMap.size(), "Should have exactly two entries");
            }
        }

        @Test
        void should_ReturnMapContainsMillionsGroup_WhenPassingPositiveNumberBetween1_000_000And999_999_999() {
            for (int i = 1_000_000, k = 1; i < 1_000_000_000; i += 1_000_000, k++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(-i);
                ThreeDigitsNumber millionsGroup = ThreeDigitsNumber.of(k, NumberSign.NEGATIVE);
                assertEquals(millionsGroup, numbersGroupsMap.get("millions"));
                assertEquals(3, numbersGroupsMap.size(), "Should have exactly three entries");
            }
        }

        @Test
        void should_ReturnMapContainsBillionsGroup_WhenPassingPositiveNumberBetween1_000_000_000And999_999_999_999() {
            int k = 1;
            for (long i = 1_000_000_000; i < 1_000_000_000_000L; i += 1_000_000_000, k++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(-i);
                ThreeDigitsNumber billionsGroup = ThreeDigitsNumber.of(k, NumberSign.NEGATIVE);
                assertEquals(billionsGroup, numbersGroupsMap.get("billions"));
                assertEquals(4, numbersGroupsMap.size(), "Should have exactly four entries");
            }
        }

        @Test
        void should_ReturnMapContainsTrillionsGroup_WhenPassingPositiveNumberBetween1_000_000_000_000And999_999_999_999_999() {
            int k = 1;
            for (long i = 1_000_000_000_000L; i < 1_000_000_000_000_000L; i += 1_000_000_000_000L, k++) {
                final Map<String, ThreeDigitsNumber> numbersGroupsMap = divider.divide(-i);
                ThreeDigitsNumber billionsGroup = ThreeDigitsNumber.of(k, NumberSign.NEGATIVE);
                assertEquals(billionsGroup, numbersGroupsMap.get("trillions"));
                assertEquals(5, numbersGroupsMap.size(), "Should have exactly five entries");
            }
        }
    }
}