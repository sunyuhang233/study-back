package top.hang.data.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.data.entity.Clazz;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClazzMapperTest {

    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void selectOneToMany() {
        Clazz clazz = clazzMapper.selectOneToMany(3);
        System.out.println(clazz);
    }

    @Test
    void selectOneToManyByClazzIdAndStudentId(){
        Clazz clazz = clazzMapper.selectOneToManyByClazzIdAndTeacherId(1, 1);
        System.out.println(clazz);
    }
}