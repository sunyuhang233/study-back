package top.hang.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import top.hang.entity.User;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/22 21:19
 */
public interface UserMapper extends BaseMapper<User> {
    // 自定义sql 通过用户名和邮箱查询
    List<User> findUser(@Param("name") String name, @Param("email") String email);


//    @Select("select * from `user` ${ew.customSqlSegment}")
//    List<User> selectAll(@Param(Constants.WRAPPER) Wrapper wrapper);

    List<User> selectAll(@Param(Constants.WRAPPER) LambdaQueryWrapper<User> wrapper);

}
