package tech.moussa.tafqeetk

import org.junit.Test
import tech.moussa.tafqeetk.converters.Tafqeet

class TensNumberTest {
    private val tafqeet: Tafqeet = Tafqeet.getInstance()

    @Test
    fun test10NumberToText() {
        val num = 10
        val result = this.tafqeet.doTafqeet(num)
        assert("عشرة" == result)
    }

    @Test
    fun test20NumberToText() {
        val num = 20
        val result = this.tafqeet.doTafqeet(num)
        assert("عشرين" == result)
    }

    @Test
    fun test30NumberToText() {
        val num = 30
        val result = this.tafqeet.doTafqeet(num)
        assert("ثلاثين" == result)
    }

    @Test
    fun test40NumberToText() {
        val num = 40
        val result = this.tafqeet.doTafqeet(num)
        assert("أربعين" == result)
    }

    @Test
    fun test50NumberToText() {
        val num = 50
        val result = this.tafqeet.doTafqeet(num)
        assert("خمسين" == result)
    }

    @Test
    fun test60NumberToText() {
        val num = 60
        val result = this.tafqeet.doTafqeet(num)
        assert("ستين" == result)
    }

    @Test
    fun test70NumberToText() {
        val num = 70
        val result = this.tafqeet.doTafqeet(num)
        assert("سبعين" == result)
    }

    @Test
    fun test80NumberToText() {
        val num = 80
        val result = this.tafqeet.doTafqeet(num)
        assert("ثمانين" == result)
    }

    @Test
    fun test90NumberToText() {
        val num = 90
        val result = this.tafqeet.doTafqeet(num)
        assert("تسعين" == result)
    }
}