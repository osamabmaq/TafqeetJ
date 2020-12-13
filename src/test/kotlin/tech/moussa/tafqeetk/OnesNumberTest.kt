package tech.moussa.tafqeetk

import org.junit.Test
import tech.moussa.tafqeetk.converters.Tafqeet

class OnesNumberTest {
    private val tafqeet: Tafqeet = Tafqeet.getInstance()

    @Test
    fun test0NumberToText() {
        val num = 0
        val result = this.tafqeet.doTafqeet(num)
        assert("صفر" == result)
    }

    @Test
    fun test1NumberToText() {
        val num = 1
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد" == result)
    }

    @Test
    fun test2NumberToText() {
        val num = 2
        val result = this.tafqeet.doTafqeet(num)
        assert("اثنين" == result)
    }

    @Test
    fun test3NumberToText() {
        val num = 3
        val result = this.tafqeet.doTafqeet(num)
        assert("ثلاثة" == result)
    }

    @Test
    fun test4NumberToText() {
        val num = 4
        val result = this.tafqeet.doTafqeet(num)
        assert("أربعة" == result)
    }

    @Test
    fun test5NumberToText() {
        val num = 5
        val result = this.tafqeet.doTafqeet(num)
        assert("خمسة" == result)
    }

    @Test
    fun test6NumberToText() {
        val num = 6
        val result = this.tafqeet.doTafqeet(num)
        assert("ستة" == result)
    }

    @Test
    fun test7NumberToText() {
        val num = 7
        val result = this.tafqeet.doTafqeet(num)
        assert("سبعة" == result)
    }

    @Test
    fun test8NumberToText() {
        val num = 8
        val result = this.tafqeet.doTafqeet(num)
        assert("ثمانية" == result)
    }

    @Test
    fun test9NumberToText() {
        val num = 9
        val result = this.tafqeet.doTafqeet(num)
        assert("تسعة" == result)
    }
}