package top.hang.boot.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.boot.service.MyService;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MyConfigTest {

    @Autowired
    private MyConfig myConfig;

    @Test
    void test(){
        System.out.println(myConfig.myService().sayHello());

    }

}