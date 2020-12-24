package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.github.osamabmaq.tafqeetj.numbers.NumberSign.POSITIVE;
import static org.junit.jupiter.api.Assertions.*;

class BasicNumberConverterTest {
    @Nested
    class TestWithPositiveNumbers {
        private BasicNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = BasicNumberConverterFactory.getPositiveConverter();
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("صفر", converter.convertOnes(0));
                        assertEquals("واحد", converter.convertOnes(1));
                        assertEquals("اثنان", converter.convertOnes(2));
                        assertEquals("ثلاثة", converter.convertOnes(3));
                        assertEquals("أربعة", converter.convertOnes(4));
                        assertEquals("خمسة", converter.convertOnes(5));
                        assertEquals("ستة", converter.convertOnes(6));
                        assertEquals("سبعة", converter.convertOnes(7));
                        assertEquals("ثمانية", converter.convertOnes(8));
                        assertEquals("تسعة", converter.convertOnes(9));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر", converter.convertComposedNumbers(11));
                        assertEquals("اثنا عشر", converter.convertComposedNumbers(12));
                        assertEquals("ثلاثة عشر", converter.convertComposedNumbers(13));
                        assertEquals("أربعة عشر", converter.convertComposedNumbers(14));
                        assertEquals("خمسة عشر", converter.convertComposedNumbers(15));
                        assertEquals("ستة عشر", converter.convertComposedNumbers(16));
                        assertEquals("سبعة عشر", converter.convertComposedNumbers(17));
                        assertEquals("ثمانية عشر", converter.convertComposedNumbers(18));
                        assertEquals("تسعة عشر", converter.convertComposedNumbers(19));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة", converter.convertTens(10));
                        assertEquals("عشرون", converter.convertTens(20));
                        assertEquals("ثلاثون", converter.convertTens(30));
                        assertEquals("أربعون", converter.convertTens(40));
                        assertEquals("خمسون", converter.convertTens(50));
                        assertEquals("ستون", converter.convertTens(60));
                        assertEquals("سبعون", converter.convertTens(70));
                        assertEquals("ثمانون", converter.convertTens(80));
                        assertEquals("تسعون", converter.convertTens(90));
                    }
            );
        }

        @Test
        void should_GenerateHundredsNumber_WhenPassingHundredsNumber() {
            assertAll(() -> {
                        assertEquals("مئة", converter.convertHundreds(100));
                        assertEquals("مئتان", converter.convertHundreds(200));
                        assertEquals("ثلاثمئة", converter.convertHundreds(300));
                        assertEquals("أربعمئة", converter.convertHundreds(400));
                        assertEquals("خمسمئة", converter.convertHundreds(500));
                        assertEquals("ستمئة", converter.convertHundreds(600));
                        assertEquals("سبعمئة", converter.convertHundreds(700));
                        assertEquals("ثمانمئة", converter.convertHundreds(800));
                        assertEquals("تسعمئة", converter.convertHundreds(900));
                    }
            );
        }


        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثون", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("واحد وثلاثون", converter.convert(ThreeDigitsNumber.of(31, POSITIVE)));
                        assertEquals("اثنان وثلاثون", converter.convert(ThreeDigitsNumber.of(32, POSITIVE)));
                        assertEquals("ثلاثة وثلاثون", converter.convert(ThreeDigitsNumber.of(33, POSITIVE)));
                        assertEquals("أربعة وثلاثون", converter.convert(ThreeDigitsNumber.of(34, POSITIVE)));
                        assertEquals("خمسة وثلاثون", converter.convert(ThreeDigitsNumber.of(35, POSITIVE)));
                        assertEquals("ستة وثلاثون", converter.convert(ThreeDigitsNumber.of(36, POSITIVE)));
                        assertEquals("سبعة وثلاثون", converter.convert(ThreeDigitsNumber.of(37, POSITIVE)));
                        assertEquals("ثمانية وثلاثون", converter.convert(ThreeDigitsNumber.of(38, POSITIVE)));
                        assertEquals("تسعة وثلاثون", converter.convert(ThreeDigitsNumber.of(39, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة وواحد", converter.convert(ThreeDigitsNumber.of(101, POSITIVE)));
                        assertEquals("مئة واثنان", converter.convert(ThreeDigitsNumber.of(102, POSITIVE)));
                        assertEquals("مئة وثلاثة", converter.convert(ThreeDigitsNumber.of(103, POSITIVE)));
                        assertEquals("مئة وأربعة", converter.convert(ThreeDigitsNumber.of(104, POSITIVE)));
                        assertEquals("مئة وخمسة", converter.convert(ThreeDigitsNumber.of(105, POSITIVE)));
                        assertEquals("مئة وستة", converter.convert(ThreeDigitsNumber.of(106, POSITIVE)));
                        assertEquals("مئة وسبعة", converter.convert(ThreeDigitsNumber.of(107, POSITIVE)));
                        assertEquals("مئة وثمانية", converter.convert(ThreeDigitsNumber.of(108, POSITIVE)));
                        assertEquals("مئة وتسعة", converter.convert(ThreeDigitsNumber.of(109, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة وأحد عشر", converter.convert(ThreeDigitsNumber.of(111, POSITIVE)));
                        assertEquals("مئة واثنا عشر", converter.convert(ThreeDigitsNumber.of(112, POSITIVE)));
                        assertEquals("مئة وثلاثة عشر", converter.convert(ThreeDigitsNumber.of(113, POSITIVE)));
                        assertEquals("مئة وأربعة عشر", converter.convert(ThreeDigitsNumber.of(114, POSITIVE)));
                        assertEquals("مئة وخمسة عشر", converter.convert(ThreeDigitsNumber.of(115, POSITIVE)));
                        assertEquals("مئة وستة عشر", converter.convert(ThreeDigitsNumber.of(116, POSITIVE)));
                        assertEquals("مئة وسبعة عشر", converter.convert(ThreeDigitsNumber.of(117, POSITIVE)));
                        assertEquals("مئة وثمانية عشر", converter.convert(ThreeDigitsNumber.of(118, POSITIVE)));
                        assertEquals("مئة وتسعة عشر", converter.convert(ThreeDigitsNumber.of(119, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة وعشرة", converter.convert(ThreeDigitsNumber.of(110, POSITIVE)));
                        assertEquals("مئة وعشرون", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وثلاثون", converter.convert(ThreeDigitsNumber.of(130, POSITIVE)));
                        assertEquals("مئة وأربعون", converter.convert(ThreeDigitsNumber.of(140, POSITIVE)));
                        assertEquals("مئة وخمسون", converter.convert(ThreeDigitsNumber.of(150, POSITIVE)));
                        assertEquals("مئة وستون", converter.convert(ThreeDigitsNumber.of(160, POSITIVE)));
                        assertEquals("مئة وسبعون", converter.convert(ThreeDigitsNumber.of(170, POSITIVE)));
                        assertEquals("مئة وثمانون", converter.convert(ThreeDigitsNumber.of(180, POSITIVE)));
                        assertEquals("مئة وتسعون", converter.convert(ThreeDigitsNumber.of(190, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرون", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وواحد وعشرون", converter.convert(ThreeDigitsNumber.of(121, POSITIVE)));
                        assertEquals("مئة واثنان وعشرون", converter.convert(ThreeDigitsNumber.of(122, POSITIVE)));
                        assertEquals("مئة وثلاثة وعشرون", converter.convert(ThreeDigitsNumber.of(123, POSITIVE)));
                        assertEquals("مئة وأربعة وعشرون", converter.convert(ThreeDigitsNumber.of(124, POSITIVE)));
                        assertEquals("مئة وخمسة وعشرون", converter.convert(ThreeDigitsNumber.of(125, POSITIVE)));
                        assertEquals("مئة وستة وعشرون", converter.convert(ThreeDigitsNumber.of(126, POSITIVE)));
                        assertEquals("مئة وسبعة وعشرون", converter.convert(ThreeDigitsNumber.of(127, POSITIVE)));
                        assertEquals("مئة وثمانية وعشرون", converter.convert(ThreeDigitsNumber.of(128, POSITIVE)));
                        assertEquals("مئة وتسعة وعشرون", converter.convert(ThreeDigitsNumber.of(129, POSITIVE)));
                    }
            );
        }
    }

    @Nested
    class TestWithNegativeNumbers {
        private BasicNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = BasicNumberConverterFactory.getNegativeConverter();
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("صفر", converter.convertOnes(0));
                        assertEquals("واحد", converter.convertOnes(1));
                        assertEquals("اثنين", converter.convertOnes(2));
                        assertEquals("ثلاثة", converter.convertOnes(3));
                        assertEquals("أربعة", converter.convertOnes(4));
                        assertEquals("خمسة", converter.convertOnes(5));
                        assertEquals("ستة", converter.convertOnes(6));
                        assertEquals("سبعة", converter.convertOnes(7));
                        assertEquals("ثمانية", converter.convertOnes(8));
                        assertEquals("تسعة", converter.convertOnes(9));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر", converter.convertComposedNumbers(11));
                        assertEquals("اثني عشر", converter.convertComposedNumbers(12));
                        assertEquals("ثلاثة عشر", converter.convertComposedNumbers(13));
                        assertEquals("أربعة عشر", converter.convertComposedNumbers(14));
                        assertEquals("خمسة عشر", converter.convertComposedNumbers(15));
                        assertEquals("ستة عشر", converter.convertComposedNumbers(16));
                        assertEquals("سبعة عشر", converter.convertComposedNumbers(17));
                        assertEquals("ثمانية عشر", converter.convertComposedNumbers(18));
                        assertEquals("تسعة عشر", converter.convertComposedNumbers(19));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة", converter.convertTens(10));
                        assertEquals("عشرين", converter.convertTens(20));
                        assertEquals("ثلاثين", converter.convertTens(30));
                        assertEquals("أربعين", converter.convertTens(40));
                        assertEquals("خمسين", converter.convertTens(50));
                        assertEquals("ستين", converter.convertTens(60));
                        assertEquals("سبعين", converter.convertTens(70));
                        assertEquals("ثمانين", converter.convertTens(80));
                        assertEquals("تسعين", converter.convertTens(90));
                    }
            );
        }

        @Test
        void should_GenerateHundredsNumber_WhenPassingHundredsNumber() {
            assertAll(() -> {
                        assertEquals("مئة", converter.convertHundreds(100));
                        assertEquals("مئتين", converter.convertHundreds(200));
                        assertEquals("ثلاثمئة", converter.convertHundreds(300));
                        assertEquals("أربعمئة", converter.convertHundreds(400));
                        assertEquals("خمسمئة", converter.convertHundreds(500));
                        assertEquals("ستمئة", converter.convertHundreds(600));
                        assertEquals("سبعمئة", converter.convertHundreds(700));
                        assertEquals("ثمانمئة", converter.convertHundreds(800));
                        assertEquals("تسعمئة", converter.convertHundreds(900));
                    }
            );
        }


        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثين", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("واحد وثلاثين", converter.convert(ThreeDigitsNumber.of(31, POSITIVE)));
                        assertEquals("اثنين وثلاثين", converter.convert(ThreeDigitsNumber.of(32, POSITIVE)));
                        assertEquals("ثلاثة وثلاثين", converter.convert(ThreeDigitsNumber.of(33, POSITIVE)));
                        assertEquals("أربعة وثلاثين", converter.convert(ThreeDigitsNumber.of(34, POSITIVE)));
                        assertEquals("خمسة وثلاثين", converter.convert(ThreeDigitsNumber.of(35, POSITIVE)));
                        assertEquals("ستة وثلاثين", converter.convert(ThreeDigitsNumber.of(36, POSITIVE)));
                        assertEquals("سبعة وثلاثين", converter.convert(ThreeDigitsNumber.of(37, POSITIVE)));
                        assertEquals("ثمانية وثلاثين", converter.convert(ThreeDigitsNumber.of(38, POSITIVE)));
                        assertEquals("تسعة وثلاثين", converter.convert(ThreeDigitsNumber.of(39, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة وواحد", converter.convert(ThreeDigitsNumber.of(101, POSITIVE)));
                        assertEquals("مئة واثنين", converter.convert(ThreeDigitsNumber.of(102, POSITIVE)));
                        assertEquals("مئة وثلاثة", converter.convert(ThreeDigitsNumber.of(103, POSITIVE)));
                        assertEquals("مئة وأربعة", converter.convert(ThreeDigitsNumber.of(104, POSITIVE)));
                        assertEquals("مئة وخمسة", converter.convert(ThreeDigitsNumber.of(105, POSITIVE)));
                        assertEquals("مئة وستة", converter.convert(ThreeDigitsNumber.of(106, POSITIVE)));
                        assertEquals("مئة وسبعة", converter.convert(ThreeDigitsNumber.of(107, POSITIVE)));
                        assertEquals("مئة وثمانية", converter.convert(ThreeDigitsNumber.of(108, POSITIVE)));
                        assertEquals("مئة وتسعة", converter.convert(ThreeDigitsNumber.of(109, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة وأحد عشر", converter.convert(ThreeDigitsNumber.of(111, POSITIVE)));
                        assertEquals("مئة واثني عشر", converter.convert(ThreeDigitsNumber.of(112, POSITIVE)));
                        assertEquals("مئة وثلاثة عشر", converter.convert(ThreeDigitsNumber.of(113, POSITIVE)));
                        assertEquals("مئة وأربعة عشر", converter.convert(ThreeDigitsNumber.of(114, POSITIVE)));
                        assertEquals("مئة وخمسة عشر", converter.convert(ThreeDigitsNumber.of(115, POSITIVE)));
                        assertEquals("مئة وستة عشر", converter.convert(ThreeDigitsNumber.of(116, POSITIVE)));
                        assertEquals("مئة وسبعة عشر", converter.convert(ThreeDigitsNumber.of(117, POSITIVE)));
                        assertEquals("مئة وثمانية عشر", converter.convert(ThreeDigitsNumber.of(118, POSITIVE)));
                        assertEquals("مئة وتسعة عشر", converter.convert(ThreeDigitsNumber.of(119, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة وعشرة", converter.convert(ThreeDigitsNumber.of(110, POSITIVE)));
                        assertEquals("مئة وعشرين", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وثلاثين", converter.convert(ThreeDigitsNumber.of(130, POSITIVE)));
                        assertEquals("مئة وأربعين", converter.convert(ThreeDigitsNumber.of(140, POSITIVE)));
                        assertEquals("مئة وخمسين", converter.convert(ThreeDigitsNumber.of(150, POSITIVE)));
                        assertEquals("مئة وستين", converter.convert(ThreeDigitsNumber.of(160, POSITIVE)));
                        assertEquals("مئة وسبعين", converter.convert(ThreeDigitsNumber.of(170, POSITIVE)));
                        assertEquals("مئة وثمانين", converter.convert(ThreeDigitsNumber.of(180, POSITIVE)));
                        assertEquals("مئة وتسعين", converter.convert(ThreeDigitsNumber.of(190, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرين", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وواحد وعشرين", converter.convert(ThreeDigitsNumber.of(121, POSITIVE)));
                        assertEquals("مئة واثنين وعشرين", converter.convert(ThreeDigitsNumber.of(122, POSITIVE)));
                        assertEquals("مئة وثلاثة وعشرين", converter.convert(ThreeDigitsNumber.of(123, POSITIVE)));
                        assertEquals("مئة وأربعة وعشرين", converter.convert(ThreeDigitsNumber.of(124, POSITIVE)));
                        assertEquals("مئة وخمسة وعشرين", converter.convert(ThreeDigitsNumber.of(125, POSITIVE)));
                        assertEquals("مئة وستة وعشرين", converter.convert(ThreeDigitsNumber.of(126, POSITIVE)));
                        assertEquals("مئة وسبعة وعشرين", converter.convert(ThreeDigitsNumber.of(127, POSITIVE)));
                        assertEquals("مئة وثمانية وعشرين", converter.convert(ThreeDigitsNumber.of(128, POSITIVE)));
                        assertEquals("مئة وتسعة وعشرين", converter.convert(ThreeDigitsNumber.of(129, POSITIVE)));
                    }
            );
        }
    }
}