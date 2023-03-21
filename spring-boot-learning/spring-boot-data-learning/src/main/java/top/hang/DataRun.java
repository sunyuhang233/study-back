package top.hang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/20 13:21
 */
@SpringBootApplication
@MapperScan("top.hang.data.mapper")
public class DataRun {
    public static void main(String[] args) {
        SpringApplication.run(DataRun.class, args);
    }
}
