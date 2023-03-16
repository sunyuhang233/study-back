package top.hang.boot.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OssConfigTest {
    @Autowired
    private OssConfig ossConfig;
    @Test
    void test(){
        System.out.println(ossConfig);
    }

}