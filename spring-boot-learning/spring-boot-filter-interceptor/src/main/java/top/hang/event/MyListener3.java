package top.hang.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @author Ahang
 * @version 1.0
 * @description MyListener3 监听器 通过application.yml 配置 content
 * @date 2023/3/27 18:10
 */
@Slf4j
public class MyListener3 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源：%s.", MyListener3.class.getName(), event.getSource()));
    }
}
