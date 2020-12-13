package tech.moussa.tafqeetk

import org.junit.Test
import tech.moussa.tafqeetk.converters.Tafqeet

class OneDecimalNumbersTest {
    private val tafqeet: Tafqeet = Tafqeet.getInstance()

    @Test
    fun test1_0NumberToText() {
        val num = 1.0
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة صفر" == result)
    }

    @Test
    fun test1_1NumberToText() {
        val num = 1.1
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة واحد بالعشرة" == result)
    }

    @Test
    fun test1_2NumberToText() {
        val num = 1.2
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة اثنين بالعشرة" == result)
    }

    @Test
    fun test1_3NumberToText() {
        val num = 1.3
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ثلاثة بالعشرة" == result)
    }

    @Test
    fun test1_4NumberToText() {
        val num = 1.4
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة أربعة بالعشرة" == result)
    }

    @Test
    fun test1_5NumberToText() {
        val num = 1.5
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة خمسة بالعشرة" == result)
    }

    @Test
    fun test1_6NumberToText() {
        val num = 1.6
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ستة بالعشرة" == result)
    }

    @Test
    fun test1_7NumberToText() {
        val num = 1.7
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة سبعة بالعشرة" == result)
    }

    @Test
    fun test1_8NumberToText() {
        val num = 1.8
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ثمانية بالعشرة" == result)
    }

    @Test
    fun test1_9NumberToText() {
        val num = 1.9
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة تسعة بالعشرة" == result)
    }

    @Test
    fun test1_00NumberToText() {
        val num = 1.00
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة صفر" == result)
    }

    @Test
    fun test1_10NumberToText() {
        val num = 1.10
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة واحد بالعشرة" == result)
    }

    @Test
    fun test1_20NumberToText() {
        val num = 1.20
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة اثنين بالعشرة" == result)
    }

    @Test
    fun test1_30NumberToText() {
        val num = 1.30
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ثلاثة بالعشرة" == result)
    }

    @Test
    fun test1_40NumberToText() {
        val num = 1.40
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة أربعة بالعشرة" == result)
    }

    @Test
    fun test1_50NumberToText() {
        val num = 1.50
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة خمسة بالعشرة" == result)
    }

    @Test
    fun test1_60NumberToText() {
        val num = 1.60
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ستة بالعشرة" == result)
    }

    @Test
    fun test1_70NumberToText() {
        val num = 1.70
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة سبعة بالعشرة" == result)
    }

    @Test
    fun test1_80NumberToText() {
        val num = 1.80
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة ثمانية بالعشرة" == result)
    }

    @Test
    fun test1_90NumberToText() {
        val num = 1.90
        val result = this.tafqeet.doTafqeet(num)
        assert("واحد فاصلة تسعة بالعشرة" == result)
    }
}