package top.hang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Ahang
 * @version 1.0
 * @description 任务
 * @date 2023/4/4 13:38
 */
@SpringBootApplication
@EnableAsync // 开启异步任务
@EnableScheduling // 开启定时任务
public class TaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }
}
