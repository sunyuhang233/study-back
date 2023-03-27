package top.hang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import top.hang.entity.Spring;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/23 15:42
 */
public interface SpringMapper extends BaseMapper<Spring> {

    @Select("select * from spring")
    List<Spring> findAll();
}
