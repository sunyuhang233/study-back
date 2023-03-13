package top.hang.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HelloControllerTest {

    @Autowired
    private  HelloController helloController;
    @Test
    void hello() {
        helloController.hello();
    }
}