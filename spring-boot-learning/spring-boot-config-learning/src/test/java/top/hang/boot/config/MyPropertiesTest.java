package top.hang.boot.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.boot.prop.MyProperties;

@SpringBootTest
class MyPropertiesTest {
    @Autowired
    private MyProperties myProperties;
    @Test
    void test(){
        System.out.println(myProperties);
    }

}