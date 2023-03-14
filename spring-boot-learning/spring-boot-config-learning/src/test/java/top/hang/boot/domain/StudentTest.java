package top.hang.boot.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentTest {
    @Autowired
    private Student student;
    @Test
    void test(){
        // 打印结果
        System.out.println(student);
    }
}