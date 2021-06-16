package com.poc.utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathsUtilTest {

    public static final MathsUtil util;

    @BeforeAll
    public static void init() {
        util = new MathsUtil();
    }

    @Test
    public void sumTest() {
        System.out.println("----");
        Assertions.assertEquals(5, util.sum(3,2));
    }

    @Test
    public void substractTest() {
        Assertions.assertEquals(1, util.substract(3,2));
    }

    @Test
    public void multiplyTest() {
        Assertions.assertEquals(6, util.multiply(3,2));
    }
}
