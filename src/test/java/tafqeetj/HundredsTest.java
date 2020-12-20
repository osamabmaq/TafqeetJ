package tafqeetj;

import org.junit.Test;
import tafqeetj.converters.Tafqeet;

public class HundredsTest {
    private final Tafqeet tafqeet = Tafqeet.getInstance();

    @Test
    public void test100NumberToText() {
        int num = 100;
        String result = this.tafqeet.doTafqeet(num);
        assert("مئة".equals(result));
    }

    @Test
    public void test200NumberToText() {
        int num = 200;
        String result = this.tafqeet.doTafqeet(num);
        assert("مئتين".equals(result));
    }

    @Test
    public void test300NumberToText() {
        int num = 300;
        String result = this.tafqeet.doTafqeet(num);
        assert("ثلاثمئة".equals(result));
    }

    @Test
    public void test400NumberToText() {
        int num = 400;
        String result = this.tafqeet.doTafqeet(num);
        assert("أربعمئة".equals(result));
    }

    @Test
    public void test500NumberToText() {
        int num = 500;
        String result = this.tafqeet.doTafqeet(num);
        assert("خمسمئة".equals(result));
    }

    @Test
    public void test600NumberToText() {
        int num = 600;
        String result = this.tafqeet.doTafqeet(num);
        assert("ستمئة".equals(result));
    }

    @Test
    public void test700NumberToText() {
        int num = 700;
        String result = this.tafqeet.doTafqeet(num);
        assert("سبعمئة".equals(result));
    }

    @Test
    public void test800NumberToText() {
        int num = 800;
        String result = this.tafqeet.doTafqeet(num);
        assert("ثمانمئة".equals(result));
    }

    @Test
    public void test900NumberToText() {
        int num = 900;
        String result = this.tafqeet.doTafqeet(num);
        assert("تسعمئة".equals(result));
    }
}
