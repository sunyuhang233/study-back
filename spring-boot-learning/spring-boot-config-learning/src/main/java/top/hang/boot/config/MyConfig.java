package top.hang.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.hang.boot.service.MyService;

/**
 * @author Ahang
 * @version 1.0
 * @description 使用Configuration 编写自定义配置类
 * @date 2023/3/14 15:05
 */
@Configuration
public class MyConfig {
    /***
     * @description  将该方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
     *
     * @return MyService
    */
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
