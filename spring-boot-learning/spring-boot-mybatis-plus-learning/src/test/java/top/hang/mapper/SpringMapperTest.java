package top.hang.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SpringMapperTest {
@Resource
private SpringMapper springMapper;
   @Test
    void selectAll(){
         System.out.println(springMapper.findAll());
   }
}