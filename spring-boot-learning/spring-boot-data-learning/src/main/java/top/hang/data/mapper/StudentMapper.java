package top.hang.data.mapper;

import org.apache.ibatis.annotations.Param;
import top.hang.data.entity.Student;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/21 14:38
 */
public interface StudentMapper {
    // 根据学生id 查询班级 多对一
    Student selectStudentById(Integer studentId);

    // 批量新增学生 @Param("") 为了让mybatis知道是哪个参数
    int batchInsert(@Param("students") List<Student> students);

    // 批量删除学生id
    int batchDelete(@Param("idList") List<Integer> idList);

    // 批量修改学生信息
    int batchUpdate(@Param("students") List<Student> students);

    // 动态sql
    List<Student> dynamicSelect(Student student);

    // 查询学生
    Student getStudent(Integer studentId);
}
