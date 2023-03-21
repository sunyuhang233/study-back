package top.hang.data.mapper;

import top.hang.data.entity.Teacher;

/**
 * @author Ahang
 * @version 1.0
 * @description
 * @date 2023/3/21 14:01
 */
public interface TeacherMapper {
    // 根据教师id查询教师信息 一对多
    Teacher selectOneByOne(Integer teacherId);
}
