package top.hang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 15:51
 */
@SpringBootApplication
@MapperScan("top.hang.mapper")
public class SpringBootAopApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAopApplication.class, args);
    }
}
