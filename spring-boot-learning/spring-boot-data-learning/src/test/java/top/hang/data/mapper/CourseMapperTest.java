package top.hang.data.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.hang.data.entity.Course;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMapperTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    void selectCourseById() {
        Course course = courseMapper.selectCourseById(20001);
        System.out.println(course);
    }

    @Test
    void insertCourse() {
        Course course = new Course();
        course.setCourseId(20004);
        course.setCourseName("Java");
        course.setStudentId(1);
        int i = courseMapper.insertCourse(course);
        System.out.println(i);
    }

    @Test
    void updateCourse() {
        Course course = new Course();
        course.setCourseId(20004);
        course.setCourseName("修改后的Java");
        int updateCourse = courseMapper.updateCourse(course);
        System.out.println(updateCourse);
    }

    @Test
    void deleteCourse() {
        int i = courseMapper.deleteCourse(20003);
        System.out.println(i);
    }

    @Test
    void selectAll() {
        System.out.println(courseMapper.selectAll());
    }

    @Test
    void selectCourseAndStudentId() {
        courseMapper.selectCourseAndStudentId(1).forEach(System.out::println);
    }
}