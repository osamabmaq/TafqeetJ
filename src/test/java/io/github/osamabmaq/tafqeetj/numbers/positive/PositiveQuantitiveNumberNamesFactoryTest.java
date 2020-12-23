package io.github.osamabmaq.tafqeetj.numbers.positive;

import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PositiveQuantitiveNumberNamesFactoryTest {
    private PositiveQuantitiveNumberNamesFactory positiveQuantitivesFactory;

    @BeforeEach
    void setupInstance() {
        positiveQuantitivesFactory = PositiveQuantitiveNumberNamesFactory.getInstance();
    }

    @Test
    @Order(1)
    void should_BeNotNull_When_GettingInstanceOfPositiveQuantitiveNumberNamesFactory() {
        assertNotNull(positiveQuantitivesFactory);
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestThousands {
        private QuantitiveNumberNames thousandsNumberNames;

        @BeforeEach
        void getThousands() {
            thousandsNumberNames = positiveQuantitivesFactory.getThousands();
        }

        @Test
        @Order(1)
        void should_BeNotNull_When_GettingThousandsObject() {
            assertNotNull(thousandsNumberNames);
        }

        @Test
        void should_Return_ألف_WhenGettingNameWhenEqualsOne() {
            assertEquals("ألف", thousandsNumberNames.getNameWhenEqualsOne());
        }

        @Test
        void should_Return_ألفان_WhenGettingNameWhenEqualsTwo() {
            assertEquals("ألفان", thousandsNumberNames.getNameWhenEqualsTwo());
        }

        @Test
        void should_Return_آلاف_WhenGettingNameWhenBetweenThreeAndTen() {
            assertEquals("آلاف", thousandsNumberNames.getNameWhenBetweenThreeAndTen());
        }

        @Test
        void should_Return_ألفًا_WhenGettingNameWhenBetweenElevenAndNinetyNine() {
            assertEquals("ألفًا", thousandsNumberNames.getNameWhenBetweenElevenAndNinetyNine());
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestMillions {
        private QuantitiveNumberNames millionsNumberNames;

        @BeforeEach
        void getMillions() {
            millionsNumberNames = positiveQuantitivesFactory.getMillions();
        }

        @Test
        @Order(1)
        void should_BeNotNull_When_GettingMillionsObject() {
            assertNotNull(millionsNumberNames);
        }

        @Test
        void should_Return_مليون_WhenGettingNameWhenEqualsOne() {
            assertEquals("مليون", millionsNumberNames.getNameWhenEqualsOne());
        }

        @Test
        void should_Return_مليونان_WhenGettingNameWhenEqualsTwo() {
            assertEquals("مليونان", millionsNumberNames.getNameWhenEqualsTwo());
        }

        @Test
        void should_Return_ملايين_WhenGettingNameWhenBetweenThreeAndTen() {
            assertEquals("ملايين", millionsNumberNames.getNameWhenBetweenThreeAndTen());
        }

        @Test
        void should_Return_مليونًا_WhenGettingNameWhenBetweenElevenAndNinetyNine() {
            assertEquals("مليونًا", millionsNumberNames.getNameWhenBetweenElevenAndNinetyNine());
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestBillions {
        private QuantitiveNumberNames billionsNumberNames;

        @BeforeEach
        void getBillions() {
            billionsNumberNames = positiveQuantitivesFactory.getBillions();
        }

        @Test
        @Order(1)
        void should_BeNotNull_When_GettingMillionsObject() {
            assertNotNull(billionsNumberNames);
        }

        @Test
        void should_Return_مليار_WhenGettingNameWhenEqualsOne() {
            assertEquals("مليار", billionsNumberNames.getNameWhenEqualsOne());
        }

        @Test
        void should_Return_ملياران_WhenGettingNameWhenEqualsTwo() {
            assertEquals("ملياران", billionsNumberNames.getNameWhenEqualsTwo());
        }

        @Test
        void should_Return_مليارات_WhenGettingNameWhenBetweenThreeAndTen() {
            assertEquals("مليارات", billionsNumberNames.getNameWhenBetweenThreeAndTen());
        }

        @Test
        void should_Return_مليارًا_WhenGettingNameWhenBetweenElevenAndNinetyNine() {
            assertEquals("مليارًا", billionsNumberNames.getNameWhenBetweenElevenAndNinetyNine());
        }
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestTrillions {
        private QuantitiveNumberNames trillionsNumberNames;

        @BeforeEach
        void getTrillions() {
            trillionsNumberNames = positiveQuantitivesFactory.getTrillions();
        }

        @Test
        @Order(1)
        void should_BeNotNull_When_GettingMillionsObject() {
            assertNotNull(trillionsNumberNames);
        }

        @Test
        void should_Return_ترليون_WhenGettingNameWhenEqualsOne() {
            assertEquals("ترليون", trillionsNumberNames.getNameWhenEqualsOne());
        }

        @Test
        void should_Return_ترليونان_WhenGettingNameWhenEqualsTwo() {
            assertEquals("ترليونان", trillionsNumberNames.getNameWhenEqualsTwo());
        }

        @Test
        void should_Return_ترليونات_WhenGettingNameWhenBetweenThreeAndTen() {
            assertEquals("ترليونات", trillionsNumberNames.getNameWhenBetweenThreeAndTen());
        }

        @Test
        void should_Return_ترليونًا_WhenGettingNameWhenBetweenElevenAndNinetyNine() {
            assertEquals("ترليونًا", trillionsNumberNames.getNameWhenBetweenElevenAndNinetyNine());
        }
    }
}