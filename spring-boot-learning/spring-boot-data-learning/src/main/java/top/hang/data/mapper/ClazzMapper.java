package top.hang.data.mapper;

import top.hang.data.entity.Clazz;

/**
 * @author Ahang
 * @version 1.0
 * @description
 * @date 2023/3/21 14:29
 */
public interface ClazzMapper {
    // 根据班级号查询班级 一对一
    Clazz selectOneToMany(Integer clazzId);

    // 一对一 根据班级号查询老师
    Clazz selectOneToManyByClazzIdAndTeacherId(Integer clazzId, Integer teacherId);

}
