package com.poc.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Test
    public void greetTest() {
        User user = new User();
        Assertions.assertEquals("hello",user.greet(null));
    }
}
