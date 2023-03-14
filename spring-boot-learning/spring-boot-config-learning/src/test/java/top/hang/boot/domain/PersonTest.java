package top.hang.boot.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class PersonTest {
    @Autowired
    private Person person;

    @Test
    void test(){
        System.out.println(person);
    }
}