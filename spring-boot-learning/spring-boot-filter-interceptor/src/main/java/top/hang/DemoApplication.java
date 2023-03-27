package top.hang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 13:57
 */
@SpringBootApplication
// 扫描servlet
@ServletComponentScan
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
