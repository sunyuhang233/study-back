package top.hang.data.mapper;

import top.hang.data.entity.Course;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/21 15:52
 */
public interface CourseMapper {
    // 根据课程编号查
    Course selectCourseById(Integer courseId);

    // 新增课程
    int insertCourse(Course course);

    // 修改课程
    int updateCourse(Course course);

    // 删除课程
    int deleteCourse(Integer courseId);

    // 查询全部
    List<Course> selectAll();

    // 多对多 查询课程下的所有学生
    List<Course> selectCourseAndStudentId(Integer studentId);
}
