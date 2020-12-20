package tech.moussa.tafqeetk

import org.junit.Test
import tech.moussa.tafqeetk.converters.Tafqeet

class TwoNumbersTest {
    private val tafqeet: Tafqeet = Tafqeet.getInstance()

    @Test
    fun test11NumberToText() {
        val num = 11
        val result = this.tafqeet.doTafqeet(num)
        assert("أحد عشر" == result)
    }

    @Test
    fun test12NumberToText() {
        val num = 12
        val result = this.tafqeet.doTafqeet(num)
        assert("اثني عشر" == result)
    }

    @Test
    fun test13NumberToText() {
        val num = 13
        val result = this.tafqeet.doTafqeet(num)
        assert("ثلاثة عشر" == result)
    }

    @Test
    fun test14NumberToText() {
        val num = 14
        val result = this.tafqeet.doTafqeet(num)
        assert("أربعة عشر" == result)
    }

    @Test
    fun test15NumberToText() {
        val num = 15
        val result = this.tafqeet.doTafqeet(num)
        assert("خمسة عشر" == result)
    }

    @Test
    fun test16NumberToText() {
        val num = 16
        val result = this.tafqeet.doTafqeet(num)
        assert("ستة عشر" == result)
    }

    @Test
    fun test17NumberToText() {
        val num = 17
        val result = this.tafqeet.doTafqeet(num)
        assert("سبعة عشر" == result)
    }

    @Test
    fun test18NumberToText() {
        val num = 18
        val result = this.tafqeet.doTafqeet(num)
        assert("ثمانية عشر" == result)
    }

    @Test
    fun test19NumberToText() {
        val num = 19
        val result = this.tafqeet.doTafqeet(num)
        assert("تسعة عشر" == result)
    }
}