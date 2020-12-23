package io.github.osamabmaq.tafqeetj.numbers.positive;

import io.github.osamabmaq.tafqeetj.converters.Tafqeet;
import org.junit.jupiter.api.*;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PositiveBasicNumbersPLacesNamesTest {
    private PositiveBasicNumbersPLacesNames positiveBasicNumbers;

    @BeforeEach
    void setupInstance() {
        positiveBasicNumbers = PositiveBasicNumbersPLacesNames.getInstance();
    }

    @Test
    @Order(1)
    void should_BeNotNull_When_GettingInstanceOfPositiveBasicNumbersPLacesNames() {
        assertNotNull(positiveBasicNumbers);
    }

    @Test
    @Order(2)
    void should_BeInstanceOfPositiveBasicNumbersPLacesNames_WhenGettingInstanceOfPositiveBasicNumbersPLacesNames() {
        assertEquals(PositiveBasicNumbersPLacesNames.class, positiveBasicNumbers.getClass());
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestOnesMap {
        private Map<Integer, String> onesMap;

        @BeforeEach
        void getOnesMap() {
            onesMap = positiveBasicNumbers.getOnesMap();
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
                        assertEquals("اثنان", onesMap.get(2));
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
            tensMap = positiveBasicNumbers.getTensMap();
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
                        assertEquals("عشرون", tensMap.get(20));
                        assertEquals("ثلاثون", tensMap.get(30));
                        assertEquals("أربعون", tensMap.get(40));
                        assertEquals("خمسون", tensMap.get(50));
                        assertEquals("ستون", tensMap.get(60));
                        assertEquals("سبعون", tensMap.get(70));
                        assertEquals("ثمانون", tensMap.get(80));
                        assertEquals("تسعون", tensMap.get(90));
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
            composedNumbersMap = positiveBasicNumbers.getComposedNumbersMap();
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
                        assertEquals("اثنا عشر", composedNumbersMap.get(12));
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
            hundredsMap = positiveBasicNumbers.getHundredsMap();
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
                        assertEquals("مئتان", hundredsMap.get(200));
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