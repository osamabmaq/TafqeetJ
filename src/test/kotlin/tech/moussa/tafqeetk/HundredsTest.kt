package tech.moussa.tafqeetk

import org.junit.Test
import tech.moussa.tafqeetk.converters.Tafqeet

class HundredsTest {
    private val tafqeet: Tafqeet = Tafqeet.getInstance()

    @Test
    fun test100NumberToText() {
        val num = 100
        val result = this.tafqeet.doTafqeet(num)
        assert("مئة" == result)
    }

    @Test
    fun test200NumberToText() {
        val num = 200
        val result = this.tafqeet.doTafqeet(num)
        assert("مئتين" == result)
    }

    @Test
    fun test300NumberToText() {
        val num = 300
        val result = this.tafqeet.doTafqeet(num)
        assert("ثلاثمئة" == result)
    }

    @Test
    fun test400NumberToText() {
        val num = 400
        val result = this.tafqeet.doTafqeet(num)
        assert("أربعمئة" == result)
    }

    @Test
    fun test500NumberToText() {
        val num = 500
        val result = this.tafqeet.doTafqeet(num)
        assert("خمسمئة" == result)
    }

    @Test
    fun test600NumberToText() {
        val num = 600
        val result = this.tafqeet.doTafqeet(num)
        assert("ستمئة" == result)
    }

    @Test
    fun test700NumberToText() {
        val num = 700
        val result = this.tafqeet.doTafqeet(num)
        assert("سبعمئة" == result)
    }

    @Test
    fun test800NumberToText() {
        val num = 800
        val result = this.tafqeet.doTafqeet(num)
        assert("ثمانمئة" == result)
    }

    @Test
    fun test900NumberToText() {
        val num = 900
        val result = this.tafqeet.doTafqeet(num)
        assert("تسعمئة" == result)
    }
}