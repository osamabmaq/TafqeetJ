package tech.moussa.tafqeetk

import org.junit.Test
import tech.moussa.tafqeetk.converters.Tafqeet

class TwoDecimalNumbersTest {
    private val tafqeet: Tafqeet = Tafqeet.getInstance()

    @Test
    fun test1_11NumberToText() {
        val num = 1.11
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة أحد عشر بالمئة" == result)
    }

    @Test
    fun test1_12NumberToText() {
        val num = 1.12
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة اثني عشر بالمئة" == result)
    }

    @Test
    fun test1_13NumberToText() {
        val num = 1.13
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ثلاثة عشر بالمئة" == result)
    }

    @Test
    fun test1_14NumberToText() {
        val num = 1.14
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة أربعة عشر بالمئة" == result)
    }

    @Test
    fun test1_15NumberToText() {
        val num = 1.15
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة خمسة عشر بالمئة" == result)
    }

    @Test
    fun test1_16NumberToText() {
        val num = 1.16
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ستة عشر بالمئة" == result)
    }

    @Test
    fun test1_17NumberToText() {
        val num = 1.17
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة سبعة عشر بالمئة" == result)
    }

    @Test
    fun test1_18NumberToText() {
        val num = 1.18
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ثمانية عشر بالمئة" == result)
    }

    @Test
    fun test1_19NumberToText() {
        val num = 1.19
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة تسعة عشر بالمئة" == result)
    }
}