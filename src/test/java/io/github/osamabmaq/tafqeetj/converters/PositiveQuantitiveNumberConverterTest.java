package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.converters.positive.PositiveQuantitiveNumberConvertersFactory;
import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.github.osamabmaq.tafqeetj.numbers.NumberSign.POSITIVE;
import static org.junit.jupiter.api.Assertions.*;

public class PositiveQuantitiveNumberConverterTest {
    @Nested
    class TestThousands {
        private QuantitiveNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = PositiveQuantitiveNumberConvertersFactory.getInstance().getConverter("thousands");
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("ألف", converter.convert(ThreeDigitsNumber.of(1, POSITIVE)));
                        assertEquals("ألفان", converter.convert(ThreeDigitsNumber.of(2, POSITIVE)));
                        assertEquals("ثلاثة آلاف", converter.convert(ThreeDigitsNumber.of(3, POSITIVE)));
                        assertEquals("أربعة آلاف", converter.convert(ThreeDigitsNumber.of(4, POSITIVE)));
                        assertEquals("خمسة آلاف", converter.convert(ThreeDigitsNumber.of(5, POSITIVE)));
                        assertEquals("ستة آلاف", converter.convert(ThreeDigitsNumber.of(6, POSITIVE)));
                        assertEquals("سبعة آلاف", converter.convert(ThreeDigitsNumber.of(7, POSITIVE)));
                        assertEquals("ثمانية آلاف", converter.convert(ThreeDigitsNumber.of(8, POSITIVE)));
                        assertEquals("تسعة آلاف", converter.convert(ThreeDigitsNumber.of(9, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر ألفًا", converter.convert(ThreeDigitsNumber.of(11, POSITIVE)));
                        assertEquals("اثنا عشر ألفًا", converter.convert(ThreeDigitsNumber.of(12, POSITIVE)));
                        assertEquals("ثلاثة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(13, POSITIVE)));
                        assertEquals("أربعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(14, POSITIVE)));
                        assertEquals("خمسة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(15, POSITIVE)));
                        assertEquals("ستة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(16, POSITIVE)));
                        assertEquals("سبعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(17, POSITIVE)));
                        assertEquals("ثمانية عشر ألفًا", converter.convert(ThreeDigitsNumber.of(18, POSITIVE)));
                        assertEquals("تسعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(19, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة آلاف", converter.convert(ThreeDigitsNumber.of(10, POSITIVE)));
                        assertEquals("عشرون ألفًا", converter.convert(ThreeDigitsNumber.of(20, POSITIVE)));
                        assertEquals("ثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("أربعون ألفًا", converter.convert(ThreeDigitsNumber.of(40, POSITIVE)));
                        assertEquals("خمسون ألفًا", converter.convert(ThreeDigitsNumber.of(50, POSITIVE)));
                        assertEquals("ستون ألفًا", converter.convert(ThreeDigitsNumber.of(60, POSITIVE)));
                        assertEquals("سبعون ألفًا", converter.convert(ThreeDigitsNumber.of(70, POSITIVE)));
                        assertEquals("ثمانون ألفًا", converter.convert(ThreeDigitsNumber.of(80, POSITIVE)));
                        assertEquals("تسعون ألفًا", converter.convert(ThreeDigitsNumber.of(90, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("واحد وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(31, POSITIVE)));
                        assertEquals("اثنان وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(32, POSITIVE)));
                        assertEquals("ثلاثة وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(33, POSITIVE)));
                        assertEquals("أربعة وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(34, POSITIVE)));
                        assertEquals("خمسة وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(35, POSITIVE)));
                        assertEquals("ستة وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(36, POSITIVE)));
                        assertEquals("سبعة وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(37, POSITIVE)));
                        assertEquals("ثمانية وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(38, POSITIVE)));
                        assertEquals("تسعة وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(39, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateHundredNumber_WhenPassingHundredNumber() {
            assertAll(() -> {
                        assertEquals("مئة ألف", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئتا ألف", converter.convert(ThreeDigitsNumber.of(200, POSITIVE)));
                        assertEquals("ثلاثمئة ألف", converter.convert(ThreeDigitsNumber.of(300, POSITIVE)));
                        assertEquals("أربعمئة ألف", converter.convert(ThreeDigitsNumber.of(400, POSITIVE)));
                        assertEquals("خمسمئة ألف", converter.convert(ThreeDigitsNumber.of(500, POSITIVE)));
                        assertEquals("ستمئة ألف", converter.convert(ThreeDigitsNumber.of(600, POSITIVE)));
                        assertEquals("سبعمئة ألف", converter.convert(ThreeDigitsNumber.of(700, POSITIVE)));
                        assertEquals("ثمانمئة ألف", converter.convert(ThreeDigitsNumber.of(800, POSITIVE)));
                        assertEquals("تسعمئة ألف", converter.convert(ThreeDigitsNumber.of(900, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة ألف", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة ألف وألف", converter.convert(ThreeDigitsNumber.of(101, POSITIVE)));
                        assertEquals("مئة ألف وألفان", converter.convert(ThreeDigitsNumber.of(102, POSITIVE)));
                        assertEquals("مئة وثلاثة آلاف", converter.convert(ThreeDigitsNumber.of(103, POSITIVE)));
                        assertEquals("مئة وأربعة آلاف", converter.convert(ThreeDigitsNumber.of(104, POSITIVE)));
                        assertEquals("مئة وخمسة آلاف", converter.convert(ThreeDigitsNumber.of(105, POSITIVE)));
                        assertEquals("مئة وستة آلاف", converter.convert(ThreeDigitsNumber.of(106, POSITIVE)));
                        assertEquals("مئة وسبعة آلاف", converter.convert(ThreeDigitsNumber.of(107, POSITIVE)));
                        assertEquals("مئة وثمانية آلاف", converter.convert(ThreeDigitsNumber.of(108, POSITIVE)));
                        assertEquals("مئة وتسعة آلاف", converter.convert(ThreeDigitsNumber.of(109, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة ألف", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة وأحد عشر ألفًا", converter.convert(ThreeDigitsNumber.of(111, POSITIVE)));
                        assertEquals("مئة واثنا عشر ألفًا", converter.convert(ThreeDigitsNumber.of(112, POSITIVE)));
                        assertEquals("مئة وثلاثة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(113, POSITIVE)));
                        assertEquals("مئة وأربعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(114, POSITIVE)));
                        assertEquals("مئة وخمسة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(115, POSITIVE)));
                        assertEquals("مئة وستة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(116, POSITIVE)));
                        assertEquals("مئة وسبعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(117, POSITIVE)));
                        assertEquals("مئة وثمانية عشر ألفًا", converter.convert(ThreeDigitsNumber.of(118, POSITIVE)));
                        assertEquals("مئة وتسعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(119, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة ألف", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئة وعشرة آلاف", converter.convert(ThreeDigitsNumber.of(110, POSITIVE)));
                        assertEquals("مئة وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وثلاثون ألفًا", converter.convert(ThreeDigitsNumber.of(130, POSITIVE)));
                        assertEquals("مئة وأربعون ألفًا", converter.convert(ThreeDigitsNumber.of(140, POSITIVE)));
                        assertEquals("مئة وخمسون ألفًا", converter.convert(ThreeDigitsNumber.of(150, POSITIVE)));
                        assertEquals("مئة وستون ألفًا", converter.convert(ThreeDigitsNumber.of(160, POSITIVE)));
                        assertEquals("مئة وسبعون ألفًا", converter.convert(ThreeDigitsNumber.of(170, POSITIVE)));
                        assertEquals("مئة وثمانون ألفًا", converter.convert(ThreeDigitsNumber.of(180, POSITIVE)));
                        assertEquals("مئة وتسعون ألفًا", converter.convert(ThreeDigitsNumber.of(190, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وواحد وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(121, POSITIVE)));
                        assertEquals("مئة واثنان وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(122, POSITIVE)));
                        assertEquals("مئة وثلاثة وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(123, POSITIVE)));
                        assertEquals("مئة وأربعة وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(124, POSITIVE)));
                        assertEquals("مئة وخمسة وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(125, POSITIVE)));
                        assertEquals("مئة وستة وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(126, POSITIVE)));
                        assertEquals("مئة وسبعة وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(127, POSITIVE)));
                        assertEquals("مئة وثمانية وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(128, POSITIVE)));
                        assertEquals("مئة وتسعة وعشرون ألفًا", converter.convert(ThreeDigitsNumber.of(129, POSITIVE)));
                    }
            );
        }
    }

    @Nested
    class TestMillions {
        private QuantitiveNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = PositiveQuantitiveNumberConvertersFactory.getInstance().getConverter("millions");
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("مليون", converter.convert(ThreeDigitsNumber.of(1, POSITIVE)));
                        assertEquals("مليونان", converter.convert(ThreeDigitsNumber.of(2, POSITIVE)));
                        assertEquals("ثلاثة ملايين", converter.convert(ThreeDigitsNumber.of(3, POSITIVE)));
                        assertEquals("أربعة ملايين", converter.convert(ThreeDigitsNumber.of(4, POSITIVE)));
                        assertEquals("خمسة ملايين", converter.convert(ThreeDigitsNumber.of(5, POSITIVE)));
                        assertEquals("ستة ملايين", converter.convert(ThreeDigitsNumber.of(6, POSITIVE)));
                        assertEquals("سبعة ملايين", converter.convert(ThreeDigitsNumber.of(7, POSITIVE)));
                        assertEquals("ثمانية ملايين", converter.convert(ThreeDigitsNumber.of(8, POSITIVE)));
                        assertEquals("تسعة ملايين", converter.convert(ThreeDigitsNumber.of(9, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر مليونًا", converter.convert(ThreeDigitsNumber.of(11, POSITIVE)));
                        assertEquals("اثنا عشر مليونًا", converter.convert(ThreeDigitsNumber.of(12, POSITIVE)));
                        assertEquals("ثلاثة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(13, POSITIVE)));
                        assertEquals("أربعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(14, POSITIVE)));
                        assertEquals("خمسة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(15, POSITIVE)));
                        assertEquals("ستة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(16, POSITIVE)));
                        assertEquals("سبعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(17, POSITIVE)));
                        assertEquals("ثمانية عشر مليونًا", converter.convert(ThreeDigitsNumber.of(18, POSITIVE)));
                        assertEquals("تسعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(19, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة ملايين", converter.convert(ThreeDigitsNumber.of(10, POSITIVE)));
                        assertEquals("عشرون مليونًا", converter.convert(ThreeDigitsNumber.of(20, POSITIVE)));
                        assertEquals("ثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("أربعون مليونًا", converter.convert(ThreeDigitsNumber.of(40, POSITIVE)));
                        assertEquals("خمسون مليونًا", converter.convert(ThreeDigitsNumber.of(50, POSITIVE)));
                        assertEquals("ستون مليونًا", converter.convert(ThreeDigitsNumber.of(60, POSITIVE)));
                        assertEquals("سبعون مليونًا", converter.convert(ThreeDigitsNumber.of(70, POSITIVE)));
                        assertEquals("ثمانون مليونًا", converter.convert(ThreeDigitsNumber.of(80, POSITIVE)));
                        assertEquals("تسعون مليونًا", converter.convert(ThreeDigitsNumber.of(90, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("واحد وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(31, POSITIVE)));
                        assertEquals("اثنان وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(32, POSITIVE)));
                        assertEquals("ثلاثة وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(33, POSITIVE)));
                        assertEquals("أربعة وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(34, POSITIVE)));
                        assertEquals("خمسة وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(35, POSITIVE)));
                        assertEquals("ستة وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(36, POSITIVE)));
                        assertEquals("سبعة وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(37, POSITIVE)));
                        assertEquals("ثمانية وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(38, POSITIVE)));
                        assertEquals("تسعة وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(39, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateHundredNumber_WhenPassingHundredNumber() {
            assertAll(() -> {
                        assertEquals("مئة مليون", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئتا مليون", converter.convert(ThreeDigitsNumber.of(200, POSITIVE)));
                        assertEquals("ثلاثمئة مليون", converter.convert(ThreeDigitsNumber.of(300, POSITIVE)));
                        assertEquals("أربعمئة مليون", converter.convert(ThreeDigitsNumber.of(400, POSITIVE)));
                        assertEquals("خمسمئة مليون", converter.convert(ThreeDigitsNumber.of(500, POSITIVE)));
                        assertEquals("ستمئة مليون", converter.convert(ThreeDigitsNumber.of(600, POSITIVE)));
                        assertEquals("سبعمئة مليون", converter.convert(ThreeDigitsNumber.of(700, POSITIVE)));
                        assertEquals("ثمانمئة مليون", converter.convert(ThreeDigitsNumber.of(800, POSITIVE)));
                        assertEquals("تسعمئة مليون", converter.convert(ThreeDigitsNumber.of(900, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة مليون ومليون", converter.convert(ThreeDigitsNumber.of(101, POSITIVE)));
                        assertEquals("مئة مليون ومليونان", converter.convert(ThreeDigitsNumber.of(102, POSITIVE)));
                        assertEquals("مئة وثلاثة ملايين", converter.convert(ThreeDigitsNumber.of(103, POSITIVE)));
                        assertEquals("مئة وأربعة ملايين", converter.convert(ThreeDigitsNumber.of(104, POSITIVE)));
                        assertEquals("مئة وخمسة ملايين", converter.convert(ThreeDigitsNumber.of(105, POSITIVE)));
                        assertEquals("مئة وستة ملايين", converter.convert(ThreeDigitsNumber.of(106, POSITIVE)));
                        assertEquals("مئة وسبعة ملايين", converter.convert(ThreeDigitsNumber.of(107, POSITIVE)));
                        assertEquals("مئة وثمانية ملايين", converter.convert(ThreeDigitsNumber.of(108, POSITIVE)));
                        assertEquals("مئة وتسعة ملايين", converter.convert(ThreeDigitsNumber.of(109, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة وأحد عشر مليونًا", converter.convert(ThreeDigitsNumber.of(111, POSITIVE)));
                        assertEquals("مئة واثنا عشر مليونًا", converter.convert(ThreeDigitsNumber.of(112, POSITIVE)));
                        assertEquals("مئة وثلاثة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(113, POSITIVE)));
                        assertEquals("مئة وأربعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(114, POSITIVE)));
                        assertEquals("مئة وخمسة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(115, POSITIVE)));
                        assertEquals("مئة وستة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(116, POSITIVE)));
                        assertEquals("مئة وسبعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(117, POSITIVE)));
                        assertEquals("مئة وثمانية عشر مليونًا", converter.convert(ThreeDigitsNumber.of(118, POSITIVE)));
                        assertEquals("مئة وتسعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(119, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرة ملايين", converter.convert(ThreeDigitsNumber.of(110, POSITIVE)));
                        assertEquals("مئة وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وثلاثون مليونًا", converter.convert(ThreeDigitsNumber.of(130, POSITIVE)));
                        assertEquals("مئة وأربعون مليونًا", converter.convert(ThreeDigitsNumber.of(140, POSITIVE)));
                        assertEquals("مئة وخمسون مليونًا", converter.convert(ThreeDigitsNumber.of(150, POSITIVE)));
                        assertEquals("مئة وستون مليونًا", converter.convert(ThreeDigitsNumber.of(160, POSITIVE)));
                        assertEquals("مئة وسبعون مليونًا", converter.convert(ThreeDigitsNumber.of(170, POSITIVE)));
                        assertEquals("مئة وثمانون مليونًا", converter.convert(ThreeDigitsNumber.of(180, POSITIVE)));
                        assertEquals("مئة وتسعون مليونًا", converter.convert(ThreeDigitsNumber.of(190, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وواحد وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(121, POSITIVE)));
                        assertEquals("مئة واثنان وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(122, POSITIVE)));
                        assertEquals("مئة وثلاثة وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(123, POSITIVE)));
                        assertEquals("مئة وأربعة وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(124, POSITIVE)));
                        assertEquals("مئة وخمسة وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(125, POSITIVE)));
                        assertEquals("مئة وستة وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(126, POSITIVE)));
                        assertEquals("مئة وسبعة وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(127, POSITIVE)));
                        assertEquals("مئة وثمانية وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(128, POSITIVE)));
                        assertEquals("مئة وتسعة وعشرون مليونًا", converter.convert(ThreeDigitsNumber.of(129, POSITIVE)));
                    }
            );
        }
    }

    @Nested
    class TestBillions {
        private QuantitiveNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = PositiveQuantitiveNumberConvertersFactory.getInstance().getConverter("billions");
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("مليار", converter.convert(ThreeDigitsNumber.of(1, POSITIVE)));
                        assertEquals("ملياران", converter.convert(ThreeDigitsNumber.of(2, POSITIVE)));
                        assertEquals("ثلاثة مليارات", converter.convert(ThreeDigitsNumber.of(3, POSITIVE)));
                        assertEquals("أربعة مليارات", converter.convert(ThreeDigitsNumber.of(4, POSITIVE)));
                        assertEquals("خمسة مليارات", converter.convert(ThreeDigitsNumber.of(5, POSITIVE)));
                        assertEquals("ستة مليارات", converter.convert(ThreeDigitsNumber.of(6, POSITIVE)));
                        assertEquals("سبعة مليارات", converter.convert(ThreeDigitsNumber.of(7, POSITIVE)));
                        assertEquals("ثمانية مليارات", converter.convert(ThreeDigitsNumber.of(8, POSITIVE)));
                        assertEquals("تسعة مليارات", converter.convert(ThreeDigitsNumber.of(9, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر مليارًا", converter.convert(ThreeDigitsNumber.of(11, POSITIVE)));
                        assertEquals("اثنا عشر مليارًا", converter.convert(ThreeDigitsNumber.of(12, POSITIVE)));
                        assertEquals("ثلاثة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(13, POSITIVE)));
                        assertEquals("أربعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(14, POSITIVE)));
                        assertEquals("خمسة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(15, POSITIVE)));
                        assertEquals("ستة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(16, POSITIVE)));
                        assertEquals("سبعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(17, POSITIVE)));
                        assertEquals("ثمانية عشر مليارًا", converter.convert(ThreeDigitsNumber.of(18, POSITIVE)));
                        assertEquals("تسعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(19, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة مليارات", converter.convert(ThreeDigitsNumber.of(10, POSITIVE)));
                        assertEquals("عشرون مليارًا", converter.convert(ThreeDigitsNumber.of(20, POSITIVE)));
                        assertEquals("ثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("أربعون مليارًا", converter.convert(ThreeDigitsNumber.of(40, POSITIVE)));
                        assertEquals("خمسون مليارًا", converter.convert(ThreeDigitsNumber.of(50, POSITIVE)));
                        assertEquals("ستون مليارًا", converter.convert(ThreeDigitsNumber.of(60, POSITIVE)));
                        assertEquals("سبعون مليارًا", converter.convert(ThreeDigitsNumber.of(70, POSITIVE)));
                        assertEquals("ثمانون مليارًا", converter.convert(ThreeDigitsNumber.of(80, POSITIVE)));
                        assertEquals("تسعون مليارًا", converter.convert(ThreeDigitsNumber.of(90, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("واحد وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(31, POSITIVE)));
                        assertEquals("اثنان وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(32, POSITIVE)));
                        assertEquals("ثلاثة وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(33, POSITIVE)));
                        assertEquals("أربعة وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(34, POSITIVE)));
                        assertEquals("خمسة وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(35, POSITIVE)));
                        assertEquals("ستة وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(36, POSITIVE)));
                        assertEquals("سبعة وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(37, POSITIVE)));
                        assertEquals("ثمانية وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(38, POSITIVE)));
                        assertEquals("تسعة وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(39, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateHundredNumber_WhenPassingHundredNumber() {
            assertAll(() -> {
                        assertEquals("مئة مليار", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئتا مليار", converter.convert(ThreeDigitsNumber.of(200, POSITIVE)));
                        assertEquals("ثلاثمئة مليار", converter.convert(ThreeDigitsNumber.of(300, POSITIVE)));
                        assertEquals("أربعمئة مليار", converter.convert(ThreeDigitsNumber.of(400, POSITIVE)));
                        assertEquals("خمسمئة مليار", converter.convert(ThreeDigitsNumber.of(500, POSITIVE)));
                        assertEquals("ستمئة مليار", converter.convert(ThreeDigitsNumber.of(600, POSITIVE)));
                        assertEquals("سبعمئة مليار", converter.convert(ThreeDigitsNumber.of(700, POSITIVE)));
                        assertEquals("ثمانمئة مليار", converter.convert(ThreeDigitsNumber.of(800, POSITIVE)));
                        assertEquals("تسعمئة مليار", converter.convert(ThreeDigitsNumber.of(900, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة مليار ومليار", converter.convert(ThreeDigitsNumber.of(101, POSITIVE)));
                        assertEquals("مئة مليار وملياران", converter.convert(ThreeDigitsNumber.of(102, POSITIVE)));
                        assertEquals("مئة وثلاثة مليارات", converter.convert(ThreeDigitsNumber.of(103, POSITIVE)));
                        assertEquals("مئة وأربعة مليارات", converter.convert(ThreeDigitsNumber.of(104, POSITIVE)));
                        assertEquals("مئة وخمسة مليارات", converter.convert(ThreeDigitsNumber.of(105, POSITIVE)));
                        assertEquals("مئة وستة مليارات", converter.convert(ThreeDigitsNumber.of(106, POSITIVE)));
                        assertEquals("مئة وسبعة مليارات", converter.convert(ThreeDigitsNumber.of(107, POSITIVE)));
                        assertEquals("مئة وثمانية مليارات", converter.convert(ThreeDigitsNumber.of(108, POSITIVE)));
                        assertEquals("مئة وتسعة مليارات", converter.convert(ThreeDigitsNumber.of(109, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة وأحد عشر مليارًا", converter.convert(ThreeDigitsNumber.of(111, POSITIVE)));
                        assertEquals("مئة واثنا عشر مليارًا", converter.convert(ThreeDigitsNumber.of(112, POSITIVE)));
                        assertEquals("مئة وثلاثة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(113, POSITIVE)));
                        assertEquals("مئة وأربعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(114, POSITIVE)));
                        assertEquals("مئة وخمسة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(115, POSITIVE)));
                        assertEquals("مئة وستة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(116, POSITIVE)));
                        assertEquals("مئة وسبعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(117, POSITIVE)));
                        assertEquals("مئة وثمانية عشر مليارًا", converter.convert(ThreeDigitsNumber.of(118, POSITIVE)));
                        assertEquals("مئة وتسعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(119, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرة مليارات", converter.convert(ThreeDigitsNumber.of(110, POSITIVE)));
                        assertEquals("مئة وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وثلاثون مليارًا", converter.convert(ThreeDigitsNumber.of(130, POSITIVE)));
                        assertEquals("مئة وأربعون مليارًا", converter.convert(ThreeDigitsNumber.of(140, POSITIVE)));
                        assertEquals("مئة وخمسون مليارًا", converter.convert(ThreeDigitsNumber.of(150, POSITIVE)));
                        assertEquals("مئة وستون مليارًا", converter.convert(ThreeDigitsNumber.of(160, POSITIVE)));
                        assertEquals("مئة وسبعون مليارًا", converter.convert(ThreeDigitsNumber.of(170, POSITIVE)));
                        assertEquals("مئة وثمانون مليارًا", converter.convert(ThreeDigitsNumber.of(180, POSITIVE)));
                        assertEquals("مئة وتسعون مليارًا", converter.convert(ThreeDigitsNumber.of(190, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وواحد وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(121, POSITIVE)));
                        assertEquals("مئة واثنان وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(122, POSITIVE)));
                        assertEquals("مئة وثلاثة وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(123, POSITIVE)));
                        assertEquals("مئة وأربعة وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(124, POSITIVE)));
                        assertEquals("مئة وخمسة وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(125, POSITIVE)));
                        assertEquals("مئة وستة وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(126, POSITIVE)));
                        assertEquals("مئة وسبعة وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(127, POSITIVE)));
                        assertEquals("مئة وثمانية وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(128, POSITIVE)));
                        assertEquals("مئة وتسعة وعشرون مليارًا", converter.convert(ThreeDigitsNumber.of(129, POSITIVE)));
                    }
            );
        }
    }

    @Nested
    class TestTrillions{
        private QuantitiveNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = PositiveQuantitiveNumberConvertersFactory.getInstance().getConverter("trillions");
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("ترليون", converter.convert(ThreeDigitsNumber.of(1, POSITIVE)));
                        assertEquals("ترليونان", converter.convert(ThreeDigitsNumber.of(2, POSITIVE)));
                        assertEquals("ثلاثة ترليونات", converter.convert(ThreeDigitsNumber.of(3, POSITIVE)));
                        assertEquals("أربعة ترليونات", converter.convert(ThreeDigitsNumber.of(4, POSITIVE)));
                        assertEquals("خمسة ترليونات", converter.convert(ThreeDigitsNumber.of(5, POSITIVE)));
                        assertEquals("ستة ترليونات", converter.convert(ThreeDigitsNumber.of(6, POSITIVE)));
                        assertEquals("سبعة ترليونات", converter.convert(ThreeDigitsNumber.of(7, POSITIVE)));
                        assertEquals("ثمانية ترليونات", converter.convert(ThreeDigitsNumber.of(8, POSITIVE)));
                        assertEquals("تسعة ترليونات", converter.convert(ThreeDigitsNumber.of(9, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(11, POSITIVE)));
                        assertEquals("اثنا عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(12, POSITIVE)));
                        assertEquals("ثلاثة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(13, POSITIVE)));
                        assertEquals("أربعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(14, POSITIVE)));
                        assertEquals("خمسة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(15, POSITIVE)));
                        assertEquals("ستة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(16, POSITIVE)));
                        assertEquals("سبعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(17, POSITIVE)));
                        assertEquals("ثمانية عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(18, POSITIVE)));
                        assertEquals("تسعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(19, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة ترليونات", converter.convert(ThreeDigitsNumber.of(10, POSITIVE)));
                        assertEquals("عشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(20, POSITIVE)));
                        assertEquals("ثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("أربعون ترليونًا", converter.convert(ThreeDigitsNumber.of(40, POSITIVE)));
                        assertEquals("خمسون ترليونًا", converter.convert(ThreeDigitsNumber.of(50, POSITIVE)));
                        assertEquals("ستون ترليونًا", converter.convert(ThreeDigitsNumber.of(60, POSITIVE)));
                        assertEquals("سبعون ترليونًا", converter.convert(ThreeDigitsNumber.of(70, POSITIVE)));
                        assertEquals("ثمانون ترليونًا", converter.convert(ThreeDigitsNumber.of(80, POSITIVE)));
                        assertEquals("تسعون ترليونًا", converter.convert(ThreeDigitsNumber.of(90, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(30, POSITIVE)));
                        assertEquals("واحد وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(31, POSITIVE)));
                        assertEquals("اثنان وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(32, POSITIVE)));
                        assertEquals("ثلاثة وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(33, POSITIVE)));
                        assertEquals("أربعة وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(34, POSITIVE)));
                        assertEquals("خمسة وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(35, POSITIVE)));
                        assertEquals("ستة وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(36, POSITIVE)));
                        assertEquals("سبعة وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(37, POSITIVE)));
                        assertEquals("ثمانية وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(38, POSITIVE)));
                        assertEquals("تسعة وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(39, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateHundredNumber_WhenPassingHundredNumber() {
            assertAll(() -> {
                        assertEquals("مئة ترليون", converter.convert(ThreeDigitsNumber.of(100, POSITIVE)));
                        assertEquals("مئتا ترليون", converter.convert(ThreeDigitsNumber.of(200, POSITIVE)));
                        assertEquals("ثلاثمئة ترليون", converter.convert(ThreeDigitsNumber.of(300, POSITIVE)));
                        assertEquals("أربعمئة ترليون", converter.convert(ThreeDigitsNumber.of(400, POSITIVE)));
                        assertEquals("خمسمئة ترليون", converter.convert(ThreeDigitsNumber.of(500, POSITIVE)));
                        assertEquals("ستمئة ترليون", converter.convert(ThreeDigitsNumber.of(600, POSITIVE)));
                        assertEquals("سبعمئة ترليون", converter.convert(ThreeDigitsNumber.of(700, POSITIVE)));
                        assertEquals("ثمانمئة ترليون", converter.convert(ThreeDigitsNumber.of(800, POSITIVE)));
                        assertEquals("تسعمئة ترليون", converter.convert(ThreeDigitsNumber.of(900, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة ترليون وترليون", converter.convert(ThreeDigitsNumber.of(101, POSITIVE)));
                        assertEquals("مئة ترليون وترليونان", converter.convert(ThreeDigitsNumber.of(102, POSITIVE)));
                        assertEquals("مئة وثلاثة ترليونات", converter.convert(ThreeDigitsNumber.of(103, POSITIVE)));
                        assertEquals("مئة وأربعة ترليونات", converter.convert(ThreeDigitsNumber.of(104, POSITIVE)));
                        assertEquals("مئة وخمسة ترليونات", converter.convert(ThreeDigitsNumber.of(105, POSITIVE)));
                        assertEquals("مئة وستة ترليونات", converter.convert(ThreeDigitsNumber.of(106, POSITIVE)));
                        assertEquals("مئة وسبعة ترليونات", converter.convert(ThreeDigitsNumber.of(107, POSITIVE)));
                        assertEquals("مئة وثمانية ترليونات", converter.convert(ThreeDigitsNumber.of(108, POSITIVE)));
                        assertEquals("مئة وتسعة ترليونات", converter.convert(ThreeDigitsNumber.of(109, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة وأحد عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(111, POSITIVE)));
                        assertEquals("مئة واثنا عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(112, POSITIVE)));
                        assertEquals("مئة وثلاثة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(113, POSITIVE)));
                        assertEquals("مئة وأربعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(114, POSITIVE)));
                        assertEquals("مئة وخمسة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(115, POSITIVE)));
                        assertEquals("مئة وستة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(116, POSITIVE)));
                        assertEquals("مئة وسبعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(117, POSITIVE)));
                        assertEquals("مئة وثمانية عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(118, POSITIVE)));
                        assertEquals("مئة وتسعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(119, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرة ترليونات", converter.convert(ThreeDigitsNumber.of(110, POSITIVE)));
                        assertEquals("مئة وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وثلاثون ترليونًا", converter.convert(ThreeDigitsNumber.of(130, POSITIVE)));
                        assertEquals("مئة وأربعون ترليونًا", converter.convert(ThreeDigitsNumber.of(140, POSITIVE)));
                        assertEquals("مئة وخمسون ترليونًا", converter.convert(ThreeDigitsNumber.of(150, POSITIVE)));
                        assertEquals("مئة وستون ترليونًا", converter.convert(ThreeDigitsNumber.of(160, POSITIVE)));
                        assertEquals("مئة وسبعون ترليونًا", converter.convert(ThreeDigitsNumber.of(170, POSITIVE)));
                        assertEquals("مئة وثمانون ترليونًا", converter.convert(ThreeDigitsNumber.of(180, POSITIVE)));
                        assertEquals("مئة وتسعون ترليونًا", converter.convert(ThreeDigitsNumber.of(190, POSITIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(120, POSITIVE)));
                        assertEquals("مئة وواحد وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(121, POSITIVE)));
                        assertEquals("مئة واثنان وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(122, POSITIVE)));
                        assertEquals("مئة وثلاثة وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(123, POSITIVE)));
                        assertEquals("مئة وأربعة وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(124, POSITIVE)));
                        assertEquals("مئة وخمسة وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(125, POSITIVE)));
                        assertEquals("مئة وستة وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(126, POSITIVE)));
                        assertEquals("مئة وسبعة وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(127, POSITIVE)));
                        assertEquals("مئة وثمانية وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(128, POSITIVE)));
                        assertEquals("مئة وتسعة وعشرون ترليونًا", converter.convert(ThreeDigitsNumber.of(129, POSITIVE)));
                    }
            );
        }
    }
}