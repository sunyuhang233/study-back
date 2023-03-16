package top.hang.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/14 16:12
 */
@Configuration
@Profile("test")
public class TestConfig implements TestConfigIn {

    @Override
    public String sayHello() {
        return "测试环境";
    }
}
