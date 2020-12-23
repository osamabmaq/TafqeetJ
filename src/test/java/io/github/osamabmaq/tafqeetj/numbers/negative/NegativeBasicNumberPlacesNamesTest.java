package io.github.osamabmaq.tafqeetj.numbers.negative;

import org.junit.jupiter.api.*;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NegativeBasicNumbersPLacesNamesTest {
    private NegativeBasicNumberPlacesNames negativeBasicNumbers;

    @BeforeEach
    void setupInstance() {
        negativeBasicNumbers = NegativeBasicNumberPlacesNames.getInstance();
    }

    @Test
    @Order(1)
    void should_BeNotNull_When_GettingInstanceOfNegativeBasicNumberPlacesNames() {
        assertNotNull(negativeBasicNumbers);
    }

    @Test
    @Order(2)
    void should_BeInstanceOfPositiveBasicNumbersPLacesNames_WhenGettingInstanceOfNegativeBasicNumberPlacesNames() {
        assertEquals(NegativeBasicNumberPlacesNames.class, negativeBasicNumbers.getClass());
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestOnesMap {
        private Map<Integer, String> onesMap;

        @BeforeEach
        void getOnesMap() {
            onesMap = negativeBasicNumbers.getOnesMap();
        }

        @Test
        @Order(1)
        void should_BeNotNull_WhenGettingOnesMap() {
            assertNotNull(onesMap);
        }

        @Test
        @Order(2)
        void should_BeSize10_WhenGettingSize() {
            assertEquals(10, onesMap.size());
        }

        @Test
        void should_ReturnPositiveOnes_WhenGettingNumberFrom0To9() {
            assertAll(() -> {
                        assertEquals("صفر", onesMap.get(0));
                        assertEquals("واحد", onesMap.get(1));
                        assertEquals("اثنين", onesMap.get(2));
                        assertEquals("ثلاثة", onesMap.get(3));
                        assertEquals("أربعة", onesMap.get(4));
                        assertEquals("خمسة", onesMap.get(5));
                        assertEquals("ستة", onesMap.get(6));
                        assertEquals("سبعة", onesMap.get(7));
                        assertEquals("ثمانية", onesMap.get(8));
                        assertEquals("تسعة", onesMap.get(9));
                    }
            );
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestTensMap {
        private Map<Integer, String> tensMap;

        @BeforeEach
        void getTensMap() {
            tensMap = negativeBasicNumbers.getTensMap();
        }

        @Test
        @Order(1)
        void should_BeNotNull_WhenGettingTensMap() {
            assertNotNull(tensMap);
        }

        @Test
        @Order(2)
        void should_BeSize9_WhenGettingSize() {
            assertEquals(9, tensMap.size());
        }

        @Test
        void should_ReturnPositiveTens_WhenGettingTensFrom10To90() {
            assertAll(() -> {
                        assertEquals("عشرة", tensMap.get(10));
                        assertEquals("عشرين", tensMap.get(20));
                        assertEquals("ثلاثين", tensMap.get(30));
                        assertEquals("أربعين", tensMap.get(40));
                        assertEquals("خمسين", tensMap.get(50));
                        assertEquals("ستين", tensMap.get(60));
                        assertEquals("سبعين", tensMap.get(70));
                        assertEquals("ثمانين", tensMap.get(80));
                        assertEquals("تسعين", tensMap.get(90));
                    }
            );
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestComposedNumbersMap {
        private Map<Integer, String> composedNumbersMap;

        @BeforeEach
        void getTensMap() {
            composedNumbersMap = negativeBasicNumbers.getComposedNumbersMap();
        }

        @Test
        @Order(1)
        void should_BeNotNull_WhenGettingComposedNumbersMap() {
            assertNotNull(composedNumbersMap);
        }

        @Test
        @Order(2)
        void should_BeSize9_WhenGettingSize() {
            assertEquals(9, composedNumbersMap.size());
        }

        @Test
        void should_ReturnPositiveComposedNumbers_WhenGettingNumberFrom11To19() {
            assertAll(() -> {
                        assertEquals("أحد عشر", composedNumbersMap.get(11));
                        assertEquals("اثني عشر", composedNumbersMap.get(12));
                        assertEquals("ثلاثة عشر", composedNumbersMap.get(13));
                        assertEquals("أربعة عشر", composedNumbersMap.get(14));
                        assertEquals("خمسة عشر", composedNumbersMap.get(15));
                        assertEquals("ستة عشر", composedNumbersMap.get(16));
                        assertEquals("سبعة عشر", composedNumbersMap.get(17));
                        assertEquals("ثمانية عشر", composedNumbersMap.get(18));
                        assertEquals("تسعة عشر", composedNumbersMap.get(19));
                    }
            );
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestHundredsMap {
        private Map<Integer, String> hundredsMap;

        @BeforeEach
        void getHundredsMap() {
            hundredsMap = negativeBasicNumbers.getHundredsMap();
        }

        @Test
        @Order(1)
        void should_BeNotNull_WhenGettingTensMap() {
            assertNotNull(hundredsMap);
        }

        @Test
        @Order(2)
        void should_BeSize9_WhenGettingSize() {
            assertEquals(9, hundredsMap.size());
        }

        @Test
        void should_ReturnPositiveTens_WhenGettingTensFrom10To90() {
            assertAll(() -> {
                        assertEquals("مئة", hundredsMap.get(100));
                        assertEquals("مئتين", hundredsMap.get(200));
                        assertEquals("ثلاثمئة", hundredsMap.get(300));
                        assertEquals("أربعمئة", hundredsMap.get(400));
                        assertEquals("خمسمئة", hundredsMap.get(500));
                        assertEquals("ستمئة", hundredsMap.get(600));
                        assertEquals("سبعمئة", hundredsMap.get(700));
                        assertEquals("ثمانمئة", hundredsMap.get(800));
                        assertEquals("تسعمئة", hundredsMap.get(900));
                    }
            );
        }
    }
}