package top.hang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.hang.mapper")
public class SpringBootMybatisPlusLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisPlusLearningApplication.class, args);
    }

}
