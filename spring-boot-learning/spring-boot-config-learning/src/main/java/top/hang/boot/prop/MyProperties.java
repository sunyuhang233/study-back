package top.hang.boot.prop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/14 14:56
 */
@Configuration // 该注解标注为配置类
@PropertySource(value = "classpath:my.properties") // 加载指定的配置文件
@ConfigurationProperties(prefix = "my") // 该注解会将配置文件中的属性与该类中的属性进行绑定
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyProperties {
    private String username;
    private String password;
    private String url;
}
