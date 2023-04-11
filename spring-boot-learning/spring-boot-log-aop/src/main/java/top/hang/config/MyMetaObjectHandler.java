package top.hang.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 15:54
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.setFieldValByName("createTime", LocalDateTime.now(),metaObject);
        this.setFieldValByName("updateTime", LocalDateTime.now(),metaObject);
    }
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.setFieldValByName("updateTime",LocalDateTime.now(),metaObject);
    }
}