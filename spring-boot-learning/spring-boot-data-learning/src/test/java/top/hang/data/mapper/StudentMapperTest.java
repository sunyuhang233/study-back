package top.hang.data.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.data.entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    void selectStudentById() {
        Student student = studentMapper.selectStudentById(1001);
        System.out.println(student);
    }

    @Test
    void batchInsert() {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            student.setStudentId(4000 + i);
            student.setStudentName("测试" + i);
            student.setClazzId(1);
            student.setHometown("北京");
            student.setBrithday(LocalDate.now());
            students.add(student);
        }
        int i = studentMapper.batchInsert(students);
        System.out.println(i);
    }

    @Test
    void batchDelete() {
        ArrayList<Integer> idList = new ArrayList<>();
        idList.add(3005);
        idList.add(3001);
        idList.add(3002);
        int i = studentMapper.batchDelete(idList);
        System.out.println(i);
    }

    @Test
    void batchUpdate() {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setStudentId(4000 + i);
            student.setStudentName("测试121" + i);
            student.setHometown("北京");
            students.add(student);
        }
        int i = studentMapper.batchUpdate(students);
        System.out.println(i);

    }

    @Test
    void dynamicSelect() {
        Student student = new Student();
        student.setHometown("京");
        List<Student> students = studentMapper.dynamicSelect(student);
        System.out.println(students);
    }

    @Test
    void getStudent() {
        Student student = studentMapper.getStudent(1001);
        System.out.println(student);
    }
}