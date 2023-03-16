package top.hang.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/16 16:06
 */
@Configuration
@PropertySource("classpath:aliyun-oss.properties")
@ConfigurationProperties(prefix = "aliyun-oss")
@Data
public class OssConfig {
    private String endpoint;
   private String bucket;
   private String dir;
   private String host;
   private String ak;
   private String secret;
}
