package io.github.osamabmaq.tafqeetj.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionalRatioNamesTest {
    @Test
    void should_Return_بالعشرة_WhenGetting() {
        assertEquals("بالعشرة", FractionalRatioNames.getRatio(1));
    }

    @Test
    void should_Return_بالمئة_WhenGetting() {
        assertEquals("بالمئة", FractionalRatioNames.getRatio(2));
    }

    @Test
    void should_Return_بالألف_WhenGetting() {
        assertEquals("بالألف", FractionalRatioNames.getRatio(3));
    }

    @Test
    void should_Return_بالعشرة_آلاف_WhenGetting() {
        assertEquals("بالعشرة آلاف", FractionalRatioNames.getRatio(4));
    }

    @Test
    void should_Return_بالمئة_ألف_WhenGetting() {
        assertEquals("بالمئة ألف", FractionalRatioNames.getRatio(5));
    }

    @Test
    void should_Return_بالمليون_WhenGetting() {
        assertEquals("بالمليون", FractionalRatioNames.getRatio(6));
    }

    @Test
    void should_Return_بالعشرة_ملايين_WhenGetting() {
        assertEquals("بالعشرة ملايين", FractionalRatioNames.getRatio(7));
    }

    @Test
    void should_Return_بالمئة_مليون_WhenGetting() {
        assertEquals("بالمئة مليون", FractionalRatioNames.getRatio(8));
    }

    @Test
    void should_Return_بالمليار_WhenGetting() {
        assertEquals("بالمليار", FractionalRatioNames.getRatio(9));
    }

    @Test
    void should_Return_بالعشرة_مليارات_WhenGetting() {
        assertEquals("بالعشرة مليارات", FractionalRatioNames.getRatio(10));
    }

    @Test
    void should_Return_بالمئة_مليار_WhenGetting() {
        assertEquals("بالمئة مليار", FractionalRatioNames.getRatio(11));
    }

    @Test
    void should_Return_بالترليون_WhenGetting() {
        assertEquals("بالترليون", FractionalRatioNames.getRatio(12));
    }

    @Test
    void should_Return_بالعشرة_ترليونات_WhenGetting() {
        assertEquals("بالعشرة ترليونات", FractionalRatioNames.getRatio(13));
    }

    @Test
    void should_Return_بالمئة_ترليون_WhenGetting() {
        assertEquals("بالمئة ترليون", FractionalRatioNames.getRatio(14));
    }

    @Test
    void should_Return_بالكوادرليون_WhenGetting() {
        assertEquals("بالكوادرليون", FractionalRatioNames.getRatio(15));
    }
}