package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.converters.negative.NegativeQuantitiveNumberConvertersFactory;
import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.github.osamabmaq.tafqeetj.numbers.NumberSign.NEGATIVE;
import static org.junit.jupiter.api.Assertions.*;

public class NegativeQuantitiveNumberConverterTest {
    @Nested
    class TestThousands {
        private QuantitiveNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = NegativeQuantitiveNumberConvertersFactory.getInstance().getConverter("thousands");
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("ألف", converter.convert(ThreeDigitsNumber.of(1, NEGATIVE)));
                        assertEquals("ألفين", converter.convert(ThreeDigitsNumber.of(2, NEGATIVE)));
                        assertEquals("ثلاثة آلاف", converter.convert(ThreeDigitsNumber.of(3, NEGATIVE)));
                        assertEquals("أربعة آلاف", converter.convert(ThreeDigitsNumber.of(4, NEGATIVE)));
                        assertEquals("خمسة آلاف", converter.convert(ThreeDigitsNumber.of(5, NEGATIVE)));
                        assertEquals("ستة آلاف", converter.convert(ThreeDigitsNumber.of(6, NEGATIVE)));
                        assertEquals("سبعة آلاف", converter.convert(ThreeDigitsNumber.of(7, NEGATIVE)));
                        assertEquals("ثمانية آلاف", converter.convert(ThreeDigitsNumber.of(8, NEGATIVE)));
                        assertEquals("تسعة آلاف", converter.convert(ThreeDigitsNumber.of(9, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر ألفًا", converter.convert(ThreeDigitsNumber.of(11, NEGATIVE)));
                        assertEquals("اثني عشر ألفًا", converter.convert(ThreeDigitsNumber.of(12, NEGATIVE)));
                        assertEquals("ثلاثة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(13, NEGATIVE)));
                        assertEquals("أربعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(14, NEGATIVE)));
                        assertEquals("خمسة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(15, NEGATIVE)));
                        assertEquals("ستة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(16, NEGATIVE)));
                        assertEquals("سبعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(17, NEGATIVE)));
                        assertEquals("ثمانية عشر ألفًا", converter.convert(ThreeDigitsNumber.of(18, NEGATIVE)));
                        assertEquals("تسعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(19, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة آلاف", converter.convert(ThreeDigitsNumber.of(10, NEGATIVE)));
                        assertEquals("عشرين ألفًا", converter.convert(ThreeDigitsNumber.of(20, NEGATIVE)));
                        assertEquals("ثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(30, NEGATIVE)));
                        assertEquals("أربعين ألفًا", converter.convert(ThreeDigitsNumber.of(40, NEGATIVE)));
                        assertEquals("خمسين ألفًا", converter.convert(ThreeDigitsNumber.of(50, NEGATIVE)));
                        assertEquals("ستين ألفًا", converter.convert(ThreeDigitsNumber.of(60, NEGATIVE)));
                        assertEquals("سبعين ألفًا", converter.convert(ThreeDigitsNumber.of(70, NEGATIVE)));
                        assertEquals("ثمانين ألفًا", converter.convert(ThreeDigitsNumber.of(80, NEGATIVE)));
                        assertEquals("تسعين ألفًا", converter.convert(ThreeDigitsNumber.of(90, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(30, NEGATIVE)));
                        assertEquals("واحد وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(31, NEGATIVE)));
                        assertEquals("اثنين وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(32, NEGATIVE)));
                        assertEquals("ثلاثة وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(33, NEGATIVE)));
                        assertEquals("أربعة وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(34, NEGATIVE)));
                        assertEquals("خمسة وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(35, NEGATIVE)));
                        assertEquals("ستة وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(36, NEGATIVE)));
                        assertEquals("سبعة وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(37, NEGATIVE)));
                        assertEquals("ثمانية وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(38, NEGATIVE)));
                        assertEquals("تسعة وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(39, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateHundredNumber_WhenPassingHundredNumber() {
            assertAll(() -> {
                        assertEquals("مئة ألف", converter.convert(ThreeDigitsNumber.of(100, NEGATIVE)));
                        assertEquals("مئتي ألف", converter.convert(ThreeDigitsNumber.of(200, NEGATIVE)));
                        assertEquals("ثلاثمئة ألف", converter.convert(ThreeDigitsNumber.of(300, NEGATIVE)));
                        assertEquals("أربعمئة ألف", converter.convert(ThreeDigitsNumber.of(400, NEGATIVE)));
                        assertEquals("خمسمئة ألف", converter.convert(ThreeDigitsNumber.of(500, NEGATIVE)));
                        assertEquals("ستمئة ألف", converter.convert(ThreeDigitsNumber.of(600, NEGATIVE)));
                        assertEquals("سبعمئة ألف", converter.convert(ThreeDigitsNumber.of(700, NEGATIVE)));
                        assertEquals("ثمانمئة ألف", converter.convert(ThreeDigitsNumber.of(800, NEGATIVE)));
                        assertEquals("تسعمئة ألف", converter.convert(ThreeDigitsNumber.of(900, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة ألف", converter.convert(ThreeDigitsNumber.of(100, NEGATIVE)));
                        assertEquals("مئة ألف وألف", converter.convert(ThreeDigitsNumber.of(101, NEGATIVE)));
                        assertEquals("مئة ألف وألفين", converter.convert(ThreeDigitsNumber.of(102, NEGATIVE)));
                        assertEquals("مئة وثلاثة آلاف", converter.convert(ThreeDigitsNumber.of(103, NEGATIVE)));
                        assertEquals("مئة وأربعة آلاف", converter.convert(ThreeDigitsNumber.of(104, NEGATIVE)));
                        assertEquals("مئة وخمسة آلاف", converter.convert(ThreeDigitsNumber.of(105, NEGATIVE)));
                        assertEquals("مئة وستة آلاف", converter.convert(ThreeDigitsNumber.of(106, NEGATIVE)));
                        assertEquals("مئة وسبعة آلاف", converter.convert(ThreeDigitsNumber.of(107, NEGATIVE)));
                        assertEquals("مئة وثمانية آلاف", converter.convert(ThreeDigitsNumber.of(108, NEGATIVE)));
                        assertEquals("مئة وتسعة آلاف", converter.convert(ThreeDigitsNumber.of(109, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة ألف", converter.convert(ThreeDigitsNumber.of(100, NEGATIVE)));
                        assertEquals("مئة وأحد عشر ألفًا", converter.convert(ThreeDigitsNumber.of(111, NEGATIVE)));
                        assertEquals("مئة واثني عشر ألفًا", converter.convert(ThreeDigitsNumber.of(112, NEGATIVE)));
                        assertEquals("مئة وثلاثة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(113, NEGATIVE)));
                        assertEquals("مئة وأربعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(114, NEGATIVE)));
                        assertEquals("مئة وخمسة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(115, NEGATIVE)));
                        assertEquals("مئة وستة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(116, NEGATIVE)));
                        assertEquals("مئة وسبعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(117, NEGATIVE)));
                        assertEquals("مئة وثمانية عشر ألفًا", converter.convert(ThreeDigitsNumber.of(118, NEGATIVE)));
                        assertEquals("مئة وتسعة عشر ألفًا", converter.convert(ThreeDigitsNumber.of(119, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة ألف", converter.convert(ThreeDigitsNumber.of(100, NEGATIVE)));
                        assertEquals("مئة وعشرة آلاف", converter.convert(ThreeDigitsNumber.of(110, NEGATIVE)));
                        assertEquals("مئة وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(120, NEGATIVE)));
                        assertEquals("مئة وثلاثين ألفًا", converter.convert(ThreeDigitsNumber.of(130, NEGATIVE)));
                        assertEquals("مئة وأربعين ألفًا", converter.convert(ThreeDigitsNumber.of(140, NEGATIVE)));
                        assertEquals("مئة وخمسين ألفًا", converter.convert(ThreeDigitsNumber.of(150, NEGATIVE)));
                        assertEquals("مئة وستين ألفًا", converter.convert(ThreeDigitsNumber.of(160, NEGATIVE)));
                        assertEquals("مئة وسبعين ألفًا", converter.convert(ThreeDigitsNumber.of(170, NEGATIVE)));
                        assertEquals("مئة وثمانين ألفًا", converter.convert(ThreeDigitsNumber.of(180, NEGATIVE)));
                        assertEquals("مئة وتسعين ألفًا", converter.convert(ThreeDigitsNumber.of(190, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(120, NEGATIVE)));
                        assertEquals("مئة وواحد وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(121, NEGATIVE)));
                        assertEquals("مئة واثنين وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(122, NEGATIVE)));
                        assertEquals("مئة وثلاثة وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(123, NEGATIVE)));
                        assertEquals("مئة وأربعة وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(124, NEGATIVE)));
                        assertEquals("مئة وخمسة وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(125, NEGATIVE)));
                        assertEquals("مئة وستة وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(126, NEGATIVE)));
                        assertEquals("مئة وسبعة وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(127, NEGATIVE)));
                        assertEquals("مئة وثمانية وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(128, NEGATIVE)));
                        assertEquals("مئة وتسعة وعشرين" +
                                " ألفًا", converter.convert(ThreeDigitsNumber.of(129, NEGATIVE)));
                    }
            );
        }
    }

    @Nested
    class TestMillions {
        private QuantitiveNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = NegativeQuantitiveNumberConvertersFactory.getInstance().getConverter("millions");
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("مليون", converter.convert(ThreeDigitsNumber.of(1, NEGATIVE)));
                        assertEquals("مليونين", converter.convert(ThreeDigitsNumber.of(2, NEGATIVE)));
                        assertEquals("ثلاثة ملايين", converter.convert(ThreeDigitsNumber.of(3, NEGATIVE)));
                        assertEquals("أربعة ملايين", converter.convert(ThreeDigitsNumber.of(4, NEGATIVE)));
                        assertEquals("خمسة ملايين", converter.convert(ThreeDigitsNumber.of(5, NEGATIVE)));
                        assertEquals("ستة ملايين", converter.convert(ThreeDigitsNumber.of(6, NEGATIVE)));
                        assertEquals("سبعة ملايين", converter.convert(ThreeDigitsNumber.of(7, NEGATIVE)));
                        assertEquals("ثمانية ملايين", converter.convert(ThreeDigitsNumber.of(8, NEGATIVE)));
                        assertEquals("تسعة ملايين", converter.convert(ThreeDigitsNumber.of(9, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر مليونًا", converter.convert(ThreeDigitsNumber.of(11, NEGATIVE)));
                        assertEquals("اثني عشر مليونًا", converter.convert(ThreeDigitsNumber.of(12, NEGATIVE)));
                        assertEquals("ثلاثة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(13, NEGATIVE)));
                        assertEquals("أربعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(14, NEGATIVE)));
                        assertEquals("خمسة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(15, NEGATIVE)));
                        assertEquals("ستة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(16, NEGATIVE)));
                        assertEquals("سبعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(17, NEGATIVE)));
                        assertEquals("ثمانية عشر مليونًا", converter.convert(ThreeDigitsNumber.of(18, NEGATIVE)));
                        assertEquals("تسعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(19, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة ملايين", converter.convert(ThreeDigitsNumber.of(10, NEGATIVE)));
                        assertEquals("عشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(20, NEGATIVE)));
                        assertEquals("ثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(30, NEGATIVE)));
                        assertEquals("أربعين مليونًا", converter.convert(ThreeDigitsNumber.of(40, NEGATIVE)));
                        assertEquals("خمسين مليونًا", converter.convert(ThreeDigitsNumber.of(50, NEGATIVE)));
                        assertEquals("ستين مليونًا", converter.convert(ThreeDigitsNumber.of(60, NEGATIVE)));
                        assertEquals("سبعين مليونًا", converter.convert(ThreeDigitsNumber.of(70, NEGATIVE)));
                        assertEquals("ثمانين مليونًا", converter.convert(ThreeDigitsNumber.of(80, NEGATIVE)));
                        assertEquals("تسعين مليونًا", converter.convert(ThreeDigitsNumber.of(90, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(30, NEGATIVE)));
                        assertEquals("واحد وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(31, NEGATIVE)));
                        assertEquals("اثنين وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(32, NEGATIVE)));
                        assertEquals("ثلاثة وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(33, NEGATIVE)));
                        assertEquals("أربعة وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(34, NEGATIVE)));
                        assertEquals("خمسة وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(35, NEGATIVE)));
                        assertEquals("ستة وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(36, NEGATIVE)));
                        assertEquals("سبعة وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(37, NEGATIVE)));
                        assertEquals("ثمانية وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(38, NEGATIVE)));
                        assertEquals("تسعة وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(39, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateHundredNumber_WhenPassingHundredNumber() {
            assertAll(() -> {
                        assertEquals("مئة مليون", converter.convert(ThreeDigitsNumber.of(100, NEGATIVE)));
                        assertEquals("مئتي مليون", converter.convert(ThreeDigitsNumber.of(200, NEGATIVE)));
                        assertEquals("ثلاثمئة مليون", converter.convert(ThreeDigitsNumber.of(300, NEGATIVE)));
                        assertEquals("أربعمئة مليون", converter.convert(ThreeDigitsNumber.of(400, NEGATIVE)));
                        assertEquals("خمسمئة مليون", converter.convert(ThreeDigitsNumber.of(500, NEGATIVE)));
                        assertEquals("ستمئة مليون", converter.convert(ThreeDigitsNumber.of(600, NEGATIVE)));
                        assertEquals("سبعمئة مليون", converter.convert(ThreeDigitsNumber.of(700, NEGATIVE)));
                        assertEquals("ثمانمئة مليون", converter.convert(ThreeDigitsNumber.of(800, NEGATIVE)));
                        assertEquals("تسعمئة مليون", converter.convert(ThreeDigitsNumber.of(900, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة مليون ومليون", converter.convert(ThreeDigitsNumber.of(101, NEGATIVE)));
                        assertEquals("مئة مليون ومليونين", converter.convert(ThreeDigitsNumber.of(102, NEGATIVE)));
                        assertEquals("مئة وثلاثة ملايين", converter.convert(ThreeDigitsNumber.of(103, NEGATIVE)));
                        assertEquals("مئة وأربعة ملايين", converter.convert(ThreeDigitsNumber.of(104, NEGATIVE)));
                        assertEquals("مئة وخمسة ملايين", converter.convert(ThreeDigitsNumber.of(105, NEGATIVE)));
                        assertEquals("مئة وستة ملايين", converter.convert(ThreeDigitsNumber.of(106, NEGATIVE)));
                        assertEquals("مئة وسبعة ملايين", converter.convert(ThreeDigitsNumber.of(107, NEGATIVE)));
                        assertEquals("مئة وثمانية ملايين", converter.convert(ThreeDigitsNumber.of(108, NEGATIVE)));
                        assertEquals("مئة وتسعة ملايين", converter.convert(ThreeDigitsNumber.of(109, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة وأحد عشر مليونًا", converter.convert(ThreeDigitsNumber.of(111, NEGATIVE)));
                        assertEquals("مئة واثني عشر مليونًا", converter.convert(ThreeDigitsNumber.of(112, NEGATIVE)));
                        assertEquals("مئة وثلاثة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(113, NEGATIVE)));
                        assertEquals("مئة وأربعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(114, NEGATIVE)));
                        assertEquals("مئة وخمسة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(115, NEGATIVE)));
                        assertEquals("مئة وستة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(116, NEGATIVE)));
                        assertEquals("مئة وسبعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(117, NEGATIVE)));
                        assertEquals("مئة وثمانية عشر مليونًا", converter.convert(ThreeDigitsNumber.of(118, NEGATIVE)));
                        assertEquals("مئة وتسعة عشر مليونًا", converter.convert(ThreeDigitsNumber.of(119, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرة ملايين", converter.convert(ThreeDigitsNumber.of(110, NEGATIVE)));
                        assertEquals("مئة وعشرين مليونًا", converter.convert(ThreeDigitsNumber.of(120, NEGATIVE)));
                        assertEquals("مئة وثلاثين مليونًا", converter.convert(ThreeDigitsNumber.of(130, NEGATIVE)));
                        assertEquals("مئة وأربعين مليونًا", converter.convert(ThreeDigitsNumber.of(140, NEGATIVE)));
                        assertEquals("مئة وخمسين مليونًا", converter.convert(ThreeDigitsNumber.of(150, NEGATIVE)));
                        assertEquals("مئة وستين مليونًا", converter.convert(ThreeDigitsNumber.of(160, NEGATIVE)));
                        assertEquals("مئة وسبعين مليونًا", converter.convert(ThreeDigitsNumber.of(170, NEGATIVE)));
                        assertEquals("مئة وثمانين مليونًا", converter.convert(ThreeDigitsNumber.of(180, NEGATIVE)));
                        assertEquals("مئة وتسعين مليونًا", converter.convert(ThreeDigitsNumber.of(190, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(120, NEGATIVE)));
                        assertEquals("مئة وواحد وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(121, NEGATIVE)));
                        assertEquals("مئة واثنين وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(122, NEGATIVE)));
                        assertEquals("مئة وثلاثة وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(123, NEGATIVE)));
                        assertEquals("مئة وأربعة وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(124, NEGATIVE)));
                        assertEquals("مئة وخمسة وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(125, NEGATIVE)));
                        assertEquals("مئة وستة وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(126, NEGATIVE)));
                        assertEquals("مئة وسبعة وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(127, NEGATIVE)));
                        assertEquals("مئة وثمانية وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(128, NEGATIVE)));
                        assertEquals("مئة وتسعة وعشرين" +
                                " مليونًا", converter.convert(ThreeDigitsNumber.of(129, NEGATIVE)));
                    }
            );
        }
    }

    @Nested
    class TestBillions {
        private QuantitiveNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = NegativeQuantitiveNumberConvertersFactory.getInstance().getConverter("billions");
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("مليار", converter.convert(ThreeDigitsNumber.of(1, NEGATIVE)));
                        assertEquals("مليارين", converter.convert(ThreeDigitsNumber.of(2, NEGATIVE)));
                        assertEquals("ثلاثة مليارات", converter.convert(ThreeDigitsNumber.of(3, NEGATIVE)));
                        assertEquals("أربعة مليارات", converter.convert(ThreeDigitsNumber.of(4, NEGATIVE)));
                        assertEquals("خمسة مليارات", converter.convert(ThreeDigitsNumber.of(5, NEGATIVE)));
                        assertEquals("ستة مليارات", converter.convert(ThreeDigitsNumber.of(6, NEGATIVE)));
                        assertEquals("سبعة مليارات", converter.convert(ThreeDigitsNumber.of(7, NEGATIVE)));
                        assertEquals("ثمانية مليارات", converter.convert(ThreeDigitsNumber.of(8, NEGATIVE)));
                        assertEquals("تسعة مليارات", converter.convert(ThreeDigitsNumber.of(9, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر مليارًا", converter.convert(ThreeDigitsNumber.of(11, NEGATIVE)));
                        assertEquals("اثني عشر مليارًا", converter.convert(ThreeDigitsNumber.of(12, NEGATIVE)));
                        assertEquals("ثلاثة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(13, NEGATIVE)));
                        assertEquals("أربعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(14, NEGATIVE)));
                        assertEquals("خمسة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(15, NEGATIVE)));
                        assertEquals("ستة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(16, NEGATIVE)));
                        assertEquals("سبعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(17, NEGATIVE)));
                        assertEquals("ثمانية عشر مليارًا", converter.convert(ThreeDigitsNumber.of(18, NEGATIVE)));
                        assertEquals("تسعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(19, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة مليارات", converter.convert(ThreeDigitsNumber.of(10, NEGATIVE)));
                        assertEquals("عشرين مليارًا", converter.convert(ThreeDigitsNumber.of(20, NEGATIVE)));
                        assertEquals("ثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(30, NEGATIVE)));
                        assertEquals("أربعين مليارًا", converter.convert(ThreeDigitsNumber.of(40, NEGATIVE)));
                        assertEquals("خمسين مليارًا", converter.convert(ThreeDigitsNumber.of(50, NEGATIVE)));
                        assertEquals("ستين مليارًا", converter.convert(ThreeDigitsNumber.of(60, NEGATIVE)));
                        assertEquals("سبعين مليارًا", converter.convert(ThreeDigitsNumber.of(70, NEGATIVE)));
                        assertEquals("ثمانين مليارًا", converter.convert(ThreeDigitsNumber.of(80, NEGATIVE)));
                        assertEquals("تسعين مليارًا", converter.convert(ThreeDigitsNumber.of(90, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(30, NEGATIVE)));
                        assertEquals("واحد وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(31, NEGATIVE)));
                        assertEquals("اثنين وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(32, NEGATIVE)));
                        assertEquals("ثلاثة وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(33, NEGATIVE)));
                        assertEquals("أربعة وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(34, NEGATIVE)));
                        assertEquals("خمسة وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(35, NEGATIVE)));
                        assertEquals("ستة وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(36, NEGATIVE)));
                        assertEquals("سبعة وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(37, NEGATIVE)));
                        assertEquals("ثمانية وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(38, NEGATIVE)));
                        assertEquals("تسعة وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(39, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateHundredNumber_WhenPassingHundredNumber() {
            assertAll(() -> {
                        assertEquals("مئة مليار", converter.convert(ThreeDigitsNumber.of(100, NEGATIVE)));
                        assertEquals("مئتي مليار", converter.convert(ThreeDigitsNumber.of(200, NEGATIVE)));
                        assertEquals("ثلاثمئة مليار", converter.convert(ThreeDigitsNumber.of(300, NEGATIVE)));
                        assertEquals("أربعمئة مليار", converter.convert(ThreeDigitsNumber.of(400, NEGATIVE)));
                        assertEquals("خمسمئة مليار", converter.convert(ThreeDigitsNumber.of(500, NEGATIVE)));
                        assertEquals("ستمئة مليار", converter.convert(ThreeDigitsNumber.of(600, NEGATIVE)));
                        assertEquals("سبعمئة مليار", converter.convert(ThreeDigitsNumber.of(700, NEGATIVE)));
                        assertEquals("ثمانمئة مليار", converter.convert(ThreeDigitsNumber.of(800, NEGATIVE)));
                        assertEquals("تسعمئة مليار", converter.convert(ThreeDigitsNumber.of(900, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة مليار ومليار", converter.convert(ThreeDigitsNumber.of(101, NEGATIVE)));
                        assertEquals("مئة مليار ومليارين", converter.convert(ThreeDigitsNumber.of(102, NEGATIVE)));
                        assertEquals("مئة وثلاثة مليارات", converter.convert(ThreeDigitsNumber.of(103, NEGATIVE)));
                        assertEquals("مئة وأربعة مليارات", converter.convert(ThreeDigitsNumber.of(104, NEGATIVE)));
                        assertEquals("مئة وخمسة مليارات", converter.convert(ThreeDigitsNumber.of(105, NEGATIVE)));
                        assertEquals("مئة وستة مليارات", converter.convert(ThreeDigitsNumber.of(106, NEGATIVE)));
                        assertEquals("مئة وسبعة مليارات", converter.convert(ThreeDigitsNumber.of(107, NEGATIVE)));
                        assertEquals("مئة وثمانية مليارات", converter.convert(ThreeDigitsNumber.of(108, NEGATIVE)));
                        assertEquals("مئة وتسعة مليارات", converter.convert(ThreeDigitsNumber.of(109, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة وأحد عشر مليارًا", converter.convert(ThreeDigitsNumber.of(111, NEGATIVE)));
                        assertEquals("مئة واثني عشر مليارًا", converter.convert(ThreeDigitsNumber.of(112, NEGATIVE)));
                        assertEquals("مئة وثلاثة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(113, NEGATIVE)));
                        assertEquals("مئة وأربعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(114, NEGATIVE)));
                        assertEquals("مئة وخمسة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(115, NEGATIVE)));
                        assertEquals("مئة وستة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(116, NEGATIVE)));
                        assertEquals("مئة وسبعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(117, NEGATIVE)));
                        assertEquals("مئة وثمانية عشر مليارًا", converter.convert(ThreeDigitsNumber.of(118, NEGATIVE)));
                        assertEquals("مئة وتسعة عشر مليارًا", converter.convert(ThreeDigitsNumber.of(119, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرة مليارات", converter.convert(ThreeDigitsNumber.of(110, NEGATIVE)));
                        assertEquals("مئة وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(120, NEGATIVE)));
                        assertEquals("مئة وثلاثين مليارًا", converter.convert(ThreeDigitsNumber.of(130, NEGATIVE)));
                        assertEquals("مئة وأربعين مليارًا", converter.convert(ThreeDigitsNumber.of(140, NEGATIVE)));
                        assertEquals("مئة وخمسين مليارًا", converter.convert(ThreeDigitsNumber.of(150, NEGATIVE)));
                        assertEquals("مئة وستين مليارًا", converter.convert(ThreeDigitsNumber.of(160, NEGATIVE)));
                        assertEquals("مئة وسبعين مليارًا", converter.convert(ThreeDigitsNumber.of(170, NEGATIVE)));
                        assertEquals("مئة وثمانين مليارًا", converter.convert(ThreeDigitsNumber.of(180, NEGATIVE)));
                        assertEquals("مئة وتسعين مليارًا", converter.convert(ThreeDigitsNumber.of(190, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(120, NEGATIVE)));
                        assertEquals("مئة وواحد وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(121, NEGATIVE)));
                        assertEquals("مئة واثنين وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(122, NEGATIVE)));
                        assertEquals("مئة وثلاثة وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(123, NEGATIVE)));
                        assertEquals("مئة وأربعة وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(124, NEGATIVE)));
                        assertEquals("مئة وخمسة وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(125, NEGATIVE)));
                        assertEquals("مئة وستة وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(126, NEGATIVE)));
                        assertEquals("مئة وسبعة وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(127, NEGATIVE)));
                        assertEquals("مئة وثمانية وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(128, NEGATIVE)));
                        assertEquals("مئة وتسعة وعشرين" +
                                " مليارًا", converter.convert(ThreeDigitsNumber.of(129, NEGATIVE)));
                    }
            );
        }
    }

    @Nested
    class TestTrillions {
        private QuantitiveNumberConverter converter;

        @BeforeEach
        void setupConverterObject() {
            converter = NegativeQuantitiveNumberConvertersFactory.getInstance().getConverter("trillions");
        }

        @Test
        void should_GenerateOnesNumber_WhenPassingOnesNumber() {
            assertAll(() -> {
                        assertEquals("ترليون", converter.convert(ThreeDigitsNumber.of(1, NEGATIVE)));
                        assertEquals("ترليونين", converter.convert(ThreeDigitsNumber.of(2, NEGATIVE)));
                        assertEquals("ثلاثة ترليونات", converter.convert(ThreeDigitsNumber.of(3, NEGATIVE)));
                        assertEquals("أربعة ترليونات", converter.convert(ThreeDigitsNumber.of(4, NEGATIVE)));
                        assertEquals("خمسة ترليونات", converter.convert(ThreeDigitsNumber.of(5, NEGATIVE)));
                        assertEquals("ستة ترليونات", converter.convert(ThreeDigitsNumber.of(6, NEGATIVE)));
                        assertEquals("سبعة ترليونات", converter.convert(ThreeDigitsNumber.of(7, NEGATIVE)));
                        assertEquals("ثمانية ترليونات", converter.convert(ThreeDigitsNumber.of(8, NEGATIVE)));
                        assertEquals("تسعة ترليونات", converter.convert(ThreeDigitsNumber.of(9, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateComposedNumber_WhenPassingComposedNumber() {
            assertAll(() -> {
                        assertEquals("أحد عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(11, NEGATIVE)));
                        assertEquals("اثني عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(12, NEGATIVE)));
                        assertEquals("ثلاثة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(13, NEGATIVE)));
                        assertEquals("أربعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(14, NEGATIVE)));
                        assertEquals("خمسة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(15, NEGATIVE)));
                        assertEquals("ستة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(16, NEGATIVE)));
                        assertEquals("سبعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(17, NEGATIVE)));
                        assertEquals("ثمانية عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(18, NEGATIVE)));
                        assertEquals("تسعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(19, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateTensNumber_WhenPassingTensNumber() {
            assertAll(() -> {
                        assertEquals("عشرة ترليونات", converter.convert(ThreeDigitsNumber.of(10, NEGATIVE)));
                        assertEquals("عشرين ترليونًا", converter.convert(ThreeDigitsNumber.of(20, NEGATIVE)));
                        assertEquals("ثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(30, NEGATIVE)));
                        assertEquals("أربعين ترليونًا", converter.convert(ThreeDigitsNumber.of(40, NEGATIVE)));
                        assertEquals("خمسين ترليونًا", converter.convert(ThreeDigitsNumber.of(50, NEGATIVE)));
                        assertEquals("ستين ترليونًا", converter.convert(ThreeDigitsNumber.of(60, NEGATIVE)));
                        assertEquals("سبعين ترليونًا", converter.convert(ThreeDigitsNumber.of(70, NEGATIVE)));
                        assertEquals("ثمانين ترليونًا", converter.convert(ThreeDigitsNumber.of(80, NEGATIVE)));
                        assertEquals("تسعين ترليونًا", converter.convert(ThreeDigitsNumber.of(90, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateThirtyAndOnesNumber_WhenPassingThirtyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("ثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(30, NEGATIVE)));
                        assertEquals("واحد وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(31, NEGATIVE)));
                        assertEquals("اثنين وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(32, NEGATIVE)));
                        assertEquals("ثلاثة وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(33, NEGATIVE)));
                        assertEquals("أربعة وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(34, NEGATIVE)));
                        assertEquals("خمسة وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(35, NEGATIVE)));
                        assertEquals("ستة وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(36, NEGATIVE)));
                        assertEquals("سبعة وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(37, NEGATIVE)));
                        assertEquals("ثمانية وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(38, NEGATIVE)));
                        assertEquals("تسعة وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(39, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateHundredNumber_WhenPassingHundredNumber() {
            assertAll(() -> {
                        assertEquals("مئة ترليون", converter.convert(ThreeDigitsNumber.of(100, NEGATIVE)));
                        assertEquals("مئتي ترليون", converter.convert(ThreeDigitsNumber.of(200, NEGATIVE)));
                        assertEquals("ثلاثمئة ترليون", converter.convert(ThreeDigitsNumber.of(300, NEGATIVE)));
                        assertEquals("أربعمئة ترليون", converter.convert(ThreeDigitsNumber.of(400, NEGATIVE)));
                        assertEquals("خمسمئة ترليون", converter.convert(ThreeDigitsNumber.of(500, NEGATIVE)));
                        assertEquals("ستمئة ترليون", converter.convert(ThreeDigitsNumber.of(600, NEGATIVE)));
                        assertEquals("سبعمئة ترليون", converter.convert(ThreeDigitsNumber.of(700, NEGATIVE)));
                        assertEquals("ثمانمئة ترليون", converter.convert(ThreeDigitsNumber.of(800, NEGATIVE)));
                        assertEquals("تسعمئة ترليون", converter.convert(ThreeDigitsNumber.of(900, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndOnesNumber_WhenPassingOneHundredAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة ترليون وترليون", converter.convert(ThreeDigitsNumber.of(101, NEGATIVE)));
                        assertEquals("مئة ترليون وترليونين", converter.convert(ThreeDigitsNumber.of(102, NEGATIVE)));
                        assertEquals("مئة وثلاثة ترليونات", converter.convert(ThreeDigitsNumber.of(103, NEGATIVE)));
                        assertEquals("مئة وأربعة ترليونات", converter.convert(ThreeDigitsNumber.of(104, NEGATIVE)));
                        assertEquals("مئة وخمسة ترليونات", converter.convert(ThreeDigitsNumber.of(105, NEGATIVE)));
                        assertEquals("مئة وستة ترليونات", converter.convert(ThreeDigitsNumber.of(106, NEGATIVE)));
                        assertEquals("مئة وسبعة ترليونات", converter.convert(ThreeDigitsNumber.of(107, NEGATIVE)));
                        assertEquals("مئة وثمانية ترليونات", converter.convert(ThreeDigitsNumber.of(108, NEGATIVE)));
                        assertEquals("مئة وتسعة ترليونات", converter.convert(ThreeDigitsNumber.of(109, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndComposedNumber_WhenPassingOneHundredAndComposedNumber() {
            assertAll(() -> {
                        assertEquals("مئة وأحد عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(111, NEGATIVE)));
                        assertEquals("مئة واثني عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(112, NEGATIVE)));
                        assertEquals("مئة وثلاثة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(113, NEGATIVE)));
                        assertEquals("مئة وأربعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(114, NEGATIVE)));
                        assertEquals("مئة وخمسة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(115, NEGATIVE)));
                        assertEquals("مئة وستة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(116, NEGATIVE)));
                        assertEquals("مئة وسبعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(117, NEGATIVE)));
                        assertEquals("مئة وثمانية عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(118, NEGATIVE)));
                        assertEquals("مئة وتسعة عشر ترليونًا", converter.convert(ThreeDigitsNumber.of(119, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTensNumber_WhenPassingOneHundredAndTensNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرة ترليونات", converter.convert(ThreeDigitsNumber.of(110, NEGATIVE)));
                        assertEquals("مئة وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(120, NEGATIVE)));
                        assertEquals("مئة وثلاثين ترليونًا", converter.convert(ThreeDigitsNumber.of(130, NEGATIVE)));
                        assertEquals("مئة وأربعين ترليونًا", converter.convert(ThreeDigitsNumber.of(140, NEGATIVE)));
                        assertEquals("مئة وخمسين ترليونًا", converter.convert(ThreeDigitsNumber.of(150, NEGATIVE)));
                        assertEquals("مئة وستين ترليونًا", converter.convert(ThreeDigitsNumber.of(160, NEGATIVE)));
                        assertEquals("مئة وسبعين ترليونًا", converter.convert(ThreeDigitsNumber.of(170, NEGATIVE)));
                        assertEquals("مئة وثمانين ترليونًا", converter.convert(ThreeDigitsNumber.of(180, NEGATIVE)));
                        assertEquals("مئة وتسعين ترليونًا", converter.convert(ThreeDigitsNumber.of(190, NEGATIVE)));
                    }
            );
        }

        @Test
        void should_GenerateOneHundredAndTwentyAndOnesNumber_WhenPassingOneHundredAndTwentyAndOnesNumber() {
            assertAll(() -> {
                        assertEquals("مئة وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(120, NEGATIVE)));
                        assertEquals("مئة وواحد وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(121, NEGATIVE)));
                        assertEquals("مئة واثنين وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(122, NEGATIVE)));
                        assertEquals("مئة وثلاثة وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(123, NEGATIVE)));
                        assertEquals("مئة وأربعة وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(124, NEGATIVE)));
                        assertEquals("مئة وخمسة وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(125, NEGATIVE)));
                        assertEquals("مئة وستة وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(126, NEGATIVE)));
                        assertEquals("مئة وسبعة وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(127, NEGATIVE)));
                        assertEquals("مئة وثمانية وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(128, NEGATIVE)));
                        assertEquals("مئة وتسعة وعشرين" +
                                " ترليونًا", converter.convert(ThreeDigitsNumber.of(129, NEGATIVE)));
                    }
            );
        }
    }
}