package io.github.osamabmaq.tafqeetj.numbers.negative;

import static org.junit.jupiter.api.Assertions.*;


import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NegativeQuantitiveNumberNamesFactoryTest {
    private NegativeQuantitiveNumberNamesFactory negativeQuantitivesFactory;

    @BeforeEach
    void setupInstance() {
        negativeQuantitivesFactory = NegativeQuantitiveNumberNamesFactory.getInstance();
    }

    @Test
    @Order(1)
    void should_BeNotNull_When_GettingInstanceOfNegativeQuantitiveNumberNamesFactory() {
        assertNotNull(negativeQuantitivesFactory);
    }

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class TestThousands {
        private QuantitiveNumberNames thousandsNumberNames;

        @BeforeEach
        void getThousands() {
            thousandsNumberNames = negativeQuantitivesFactory.getThousands();
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
        void should_Return_ألفين_WhenGettingNameWhenEqualsTwo() {
            assertEquals("ألفين", thousandsNumberNames.getNameWhenEqualsTwo());
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
            millionsNumberNames = negativeQuantitivesFactory.getMillions();
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
        void should_Return_مليونين_WhenGettingNameWhenEqualsTwo() {
            assertEquals("مليونين", millionsNumberNames.getNameWhenEqualsTwo());
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
            billionsNumberNames = negativeQuantitivesFactory.getBillions();
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
        void should_Return_مليارين_WhenGettingNameWhenEqualsTwo() {
            assertEquals("مليارين", billionsNumberNames.getNameWhenEqualsTwo());
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
            trillionsNumberNames = negativeQuantitivesFactory.getTrillions();
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
        void should_Return_ترليونين_WhenGettingNameWhenEqualsTwo() {
            assertEquals("ترليونين", trillionsNumberNames.getNameWhenEqualsTwo());
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