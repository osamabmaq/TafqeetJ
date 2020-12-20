package tech.moussa.tafqeetk

import org.junit.Test
import tech.moussa.tafqeetk.converters.Tafqeet

class ThousandsTest {
    private val tafqeet: Tafqeet = Tafqeet.getInstance()

    @Test
    fun test1000NumberToText() {
        val num = 1000
        val result = this.tafqeet.doTafqeet(num)
        assert("ألف" == result)
    }

    @Test
    fun test2000NumberToText() {
        val num = 2000
        val result = this.tafqeet.doTafqeet(num)
        assert("ألفين" == result)
    }

    @Test
    fun test3000NumberToText() {
        val num = 3000
        val result = this.tafqeet.doTafqeet(num)
        assert("ثلاثة آلاف" == result)
    }

    @Test
    fun test4000NumberToText() {
        val num = 4000
        val result = this.tafqeet.doTafqeet(num)
        assert("أربعة آلاف" == result)
    }

    @Test
    fun test5000NumberToText() {
        val num = 5000
        val result = this.tafqeet.doTafqeet(num)
        assert("خمسة آلاف" == result)
    }

    @Test
    fun test6000NumberToText() {
        val num = 6000
        val result = this.tafqeet.doTafqeet(num)
        assert("ستة آلاف" == result)
    }

    @Test
    fun test7000NumberToText() {
        val num = 7000
        val result = this.tafqeet.doTafqeet(num)
        assert("سبعة آلاف" == result)
    }

    @Test
    fun test8000NumberToText() {
        val num = 8000
        val result = this.tafqeet.doTafqeet(num)
        assert("ثمانية آلاف" == result)
    }

    @Test
    fun test9000NumberToText() {
        val num = 9000
        val result = this.tafqeet.doTafqeet(num)
        assert("تسعة آلاف" == result)
    }
}