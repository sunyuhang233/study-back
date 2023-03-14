package top.hang.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/14 13:58
 */
// @Component // 该注解会将该类注入到容器中 语义化不明确
@Component
// @ConfigurationProperties含义 该注解会将配置文件中的属性与该类中的属性进行绑定
@ConfigurationProperties(prefix = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Validated // 开启数据校验
public class Person {
    private Integer id;
    private String name;
    private List<String> hobby;

    private String[] family;
    private Map<String, Object> map;
    private Pet pet;
}
