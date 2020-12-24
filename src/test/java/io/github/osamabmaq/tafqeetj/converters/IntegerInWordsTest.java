package io.github.osamabmaq.tafqeetj.converters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerInWordsTest {
    private IntegerInWords integerInWords;

    @BeforeEach
    void setupIntegerInWordsObject() {
        integerInWords = new IntegerInWords();
    }

    @Nested
    class TestToStringGeneration {
        @Test
        void should_GenerateBasicNumbers_WhenSettingOnlyBasicNumber() {
            integerInWords.setBasicNumberGroup("مئة وخمسة وستون");
            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertEquals("مئة وخمسة وستون", integerInWords.toString());
        }

        @Test
        void should_GenerateThousands_WhenSettingOnlyThousands() {
            integerInWords.setThousands("مئتا ألف");
            assertTrue(integerInWords.isThousandsPresent());
            assertEquals("مئتا ألف", integerInWords.toString());
        }

        @Test
        void should_GenerateMillions_WhenSettingOnlyMillions() {
            integerInWords.setMillions("مليونان");
            assertTrue(integerInWords.isMillionsPresent());
            assertEquals("مليونان", integerInWords.toString());
        }

        @Test
        void should_GenerateBillions_WhenSettingOnlyBillions() {
            integerInWords.setBillions("مئة مليار ومليار");
            assertTrue(integerInWords.isBillionsPresent());
            assertEquals("مئة مليار ومليار", integerInWords.toString());
        }

        @Test
        void should_GenerateTrillions_WhenSettingOnlyTrillions() {
            integerInWords.setTrillions("ترليون");
            assertTrue(integerInWords.isTrillionsPresent());
            assertEquals("ترليون", integerInWords.toString());
        }

        @Test
        void should_GenerateBasicNumbersWithThousands_WhenSettingOnlyBasicNumberAndThousands() {
            integerInWords.setBasicNumberGroup("اثنان");
            integerInWords.setThousands("أحد عشر ألفًا");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isThousandsPresent());

            assertEquals("أحد عشر ألفًا واثنان", integerInWords.toString());
        }

        @Test
        void should_GenerateBasicNumbersWithMillions_WhenSettingOnlyBasicNumberAndMillions() {
            integerInWords.setBasicNumberGroup("اثنا عشر");
            integerInWords.setMillions("خمسة وستون مليونًا");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isMillionsPresent());

            assertEquals("خمسة وستون مليونًا واثنا عشر", integerInWords.toString());
        }

        @Test
        void should_GenerateBasicNumbersWithBillions_WhenSettingOnlyBasicNumberAndBillions() {
            integerInWords.setBasicNumberGroup("واحد");
            integerInWords.setBillions("ملياران");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isBillionsPresent());

            assertEquals("ملياران وواحد", integerInWords.toString());
        }

        @Test
        void should_GenerateBasicNumbersWithTrillions_WhenSettingOnlyBasicNumberAndTrillions() {
            integerInWords.setBasicNumberGroup("مئة");
            integerInWords.setTrillions("مئة ترليون");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isTrillionsPresent());

            assertEquals("مئة ترليون ومئة", integerInWords.toString());
        }

        @Test
        void should_GenerateThousandsWithMillions_WhenSettingOnlyThousandsAndMillions() {
            integerInWords.setMillions("تسعمئة وتسعة وتسعون مليونًا");
            integerInWords.setThousands("مئة ألف وألف");

            assertTrue(integerInWords.isMillionsPresent());
            assertTrue(integerInWords.isThousandsPresent());

            assertEquals("تسعمئة وتسعة وتسعون مليونًا ومئة ألف وألف", integerInWords.toString());
        }

        @Test
        void should_GenerateMillionsWithBillions_WhenSettingOnlyMillionsAndBillions() {
            integerInWords.setMillions("تسعة عشر مليونًا");
            integerInWords.setBillions("ثلاثة مليارات");

            assertTrue(integerInWords.isMillionsPresent());
            assertTrue(integerInWords.isBillionsPresent());

            assertEquals("ثلاثة مليارات وتسعة عشر مليونًا", integerInWords.toString());
        }

        @Test
        void should_GenerateBillionsWithTrillions_WhenSettingOnlyBillionsAndTrillions() {
            integerInWords.setBillions("تسعة مليارات");
            integerInWords.setTrillions("ستمئة وستة وستون ترليونًا");

            assertTrue(integerInWords.isBillionsPresent());
            assertTrue(integerInWords.isTrillionsPresent());

            assertFalse(integerInWords.isBasicNumberGroupPresent());
            assertFalse(integerInWords.isMillionsPresent());
            assertFalse(integerInWords.isThousandsPresent());

            assertEquals("ستمئة وستة وستون ترليونًا وتسعة مليارات", integerInWords.toString());
        }

        @Test
        void should_GenerateAllNumbersGroups_WhenSettingAllNumbersGroups() {
            integerInWords.setBasicNumberGroup("مئة وخمسة وستون");
            integerInWords.setThousands("مئتا ألف");
            integerInWords.setMillions("مليونان");
            integerInWords.setBillions("مئة مليار ومليار");
            integerInWords.setTrillions("ترليون");

            assertEquals("ترليون ومئة مليار ومليار ومليونان ومئتا ألف ومئة وخمسة وستون", integerInWords.toString());
        }
    }

    @Nested
    class TestReturningTrueWhenCallingIsSetForAlreadySetGroups {

        @Test
        void should_GenerateBasicNumbers_WhenSettingOnlyBasicNumber() {
            integerInWords.setBasicNumberGroup("مئة وخمسة وستون");
            assertTrue(integerInWords.isBasicNumberGroupPresent());
        }

        @Test
        void should_GenerateThousands_WhenSettingOnlyThousands() {
            integerInWords.setThousands("مئتا ألف");
            assertTrue(integerInWords.isThousandsPresent());
        }

        @Test
        void should_GenerateMillions_WhenSettingOnlyMillions() {
            integerInWords.setMillions("مليونان");
            assertTrue(integerInWords.isMillionsPresent());
        }

        @Test
        void should_GenerateBillions_WhenSettingOnlyBillions() {
            integerInWords.setBillions("مئة مليار ومليار");
            assertTrue(integerInWords.isBillionsPresent());
        }

        @Test
        void should_GenerateTrillions_WhenSettingOnlyTrillions() {
            integerInWords.setTrillions("ترليون");
            assertTrue(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateBasicNumbersWithThousands_WhenSettingOnlyBasicNumberAndThousands() {
            integerInWords.setBasicNumberGroup("اثنان");
            integerInWords.setThousands("أحد عشر ألفًا");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isThousandsPresent());
        }

        @Test
        void should_GenerateBasicNumbersWithMillions_WhenSettingOnlyBasicNumberAndMillions() {
            integerInWords.setBasicNumberGroup("اثنا عشر");
            integerInWords.setMillions("خمسة وستون مليونًا");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isMillionsPresent());
        }

        @Test
        void should_GenerateBasicNumbersWithBillions_WhenSettingOnlyBasicNumberAndBillions() {
            integerInWords.setBasicNumberGroup("واحد");
            integerInWords.setBillions("ملياران");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isBillionsPresent());
        }

        @Test
        void should_GenerateBasicNumbersWithTrillions_WhenSettingOnlyBasicNumberAndTrillions() {
            integerInWords.setBasicNumberGroup("مئة");
            integerInWords.setTrillions("مئة ترليون");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateThousandsWithMillions_WhenSettingOnlyThousandsAndMillions() {
            integerInWords.setMillions("تسعمئة وتسعة وتسعون مليونًا");
            integerInWords.setThousands("مئة ألف وألف");

            assertTrue(integerInWords.isMillionsPresent());
            assertTrue(integerInWords.isThousandsPresent());
        }

        @Test
        void should_GenerateMillionsWithBillions_WhenSettingOnlyMillionsAndBillions() {
            integerInWords.setMillions("تسعة عشر مليونًا");
            integerInWords.setBillions("ثلاثة مليارات");

            assertTrue(integerInWords.isMillionsPresent());
            assertTrue(integerInWords.isBillionsPresent());
        }

        @Test
        void should_GenerateBillionsWithTrillions_WhenSettingOnlyBillionsAndTrillions() {
            integerInWords.setBillions("تسعة مليارات");
            integerInWords.setTrillions("ستمئة وستة وستون ترليونًا");

            assertTrue(integerInWords.isBillionsPresent());
            assertTrue(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateAllNumbersGroups_WhenSettingAllNumbersGroups() {
            integerInWords.setBasicNumberGroup("مئة وخمسة وستون");
            integerInWords.setThousands("مئتا ألف");
            integerInWords.setMillions("مليونان");
            integerInWords.setBillions("مئة مليار ومليار");
            integerInWords.setTrillions("ترليون");

            assertTrue(integerInWords.isBasicNumberGroupPresent());
            assertTrue(integerInWords.isThousandsPresent());
            assertTrue(integerInWords.isMillionsPresent());
            assertTrue(integerInWords.isBillionsPresent());
            assertTrue(integerInWords.isTrillionsPresent());
        }
    }

    @Nested
    class TestReturningFalseWhenCallingIsSetForNotSetGroups {

        @Test
        void should_GenerateBasicNumbers_WhenSettingOnlyBasicNumber() {
            integerInWords.setBasicNumberGroup("مئة وخمسة وستون");
            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isMillionsPresent());
            assertFalse(integerInWords.isBillionsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }
        @Test
        void should_GenerateThousands_WhenSettingOnlyThousands() {
            integerInWords.setThousands("مئتا ألف");
            assertFalse(integerInWords.isBasicNumberGroupPresent());
            assertFalse(integerInWords.isMillionsPresent());
            assertFalse(integerInWords.isBillionsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateMillions_WhenSettingOnlyMillions() {
            integerInWords.setMillions("مليونان");
            assertFalse(integerInWords.isBasicNumberGroupPresent());
            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isBillionsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateBillions_WhenSettingOnlyBillions() {
            integerInWords.setBillions("مئة مليار ومليار");
            assertFalse(integerInWords.isBasicNumberGroupPresent());
            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isMillionsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateTrillions_WhenSettingOnlyTrillions() {
            integerInWords.setTrillions("ترليون");
            assertFalse(integerInWords.isBasicNumberGroupPresent());
            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isMillionsPresent());
            assertFalse(integerInWords.isBillionsPresent());
        }

        @Test
        void should_GenerateBasicNumbersWithThousands_WhenSettingOnlyBasicNumberAndThousands() {
            integerInWords.setBasicNumberGroup("اثنان");
            integerInWords.setThousands("أحد عشر ألفًا");

            assertFalse(integerInWords.isMillionsPresent());
            assertFalse(integerInWords.isBillionsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateBasicNumbersWithMillions_WhenSettingOnlyBasicNumberAndMillions() {
            integerInWords.setBasicNumberGroup("اثنا عشر");
            integerInWords.setMillions("خمسة وستون مليونًا");

            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isBillionsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateBasicNumbersWithBillions_WhenSettingOnlyBasicNumberAndBillions() {
            integerInWords.setBasicNumberGroup("واحد");
            integerInWords.setBillions("ملياران");

            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isMillionsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateBasicNumbersWithTrillions_WhenSettingOnlyBasicNumberAndTrillions() {
            integerInWords.setBasicNumberGroup("مئة");
            integerInWords.setTrillions("مئة ترليون");

            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isMillionsPresent());
            assertFalse(integerInWords.isBillionsPresent());
        }

        @Test
        void should_GenerateThousandsWithMillions_WhenSettingOnlyThousandsAndMillions() {
            integerInWords.setMillions("تسعمئة وتسعة وتسعون مليونًا");
            integerInWords.setThousands("مئة ألف وألف");

            assertFalse(integerInWords.isBasicNumberGroupPresent());
            assertFalse(integerInWords.isBillionsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateMillionsWithBillions_WhenSettingOnlyMillionsAndBillions() {
            integerInWords.setMillions("تسعة عشر مليونًا");
            integerInWords.setBillions("ثلاثة مليارات");

            assertFalse(integerInWords.isBasicNumberGroupPresent());
            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isTrillionsPresent());
        }

        @Test
        void should_GenerateBillionsWithTrillions_WhenSettingOnlyBillionsAndTrillions() {
            integerInWords.setBillions("تسعة مليارات");
            integerInWords.setTrillions("ستمئة وستة وستون ترليونًا");

            assertFalse(integerInWords.isBasicNumberGroupPresent());
            assertFalse(integerInWords.isThousandsPresent());
            assertFalse(integerInWords.isMillionsPresent());
        }
    }
}