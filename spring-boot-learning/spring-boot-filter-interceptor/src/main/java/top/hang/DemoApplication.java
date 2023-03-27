package top.hang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import top.hang.event.MyEvent;
import top.hang.event.MyListener1;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 13:57
 */
@SpringBootApplication
//@ServletComponentScan // 扫描servlet
public class DemoApplication {
    public static void main(String[] args) {

//        SpringApplication.run(DemoApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        //装载监听
        context.addApplicationListener(new MyListener1());
        // 发布事件
        context.publishEvent(new MyEvent("测试事件"));
    }
}
