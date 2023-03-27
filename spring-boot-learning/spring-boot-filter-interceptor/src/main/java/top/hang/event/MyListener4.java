package top.hang.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Ahang
 * @version 1.0
 * @description MyListener4 通过@EventListener注解实现监听器
 * @date 2023/3/27 18:11
 */
@Slf4j
@Component
public class MyListener4 {
    @EventListener
    public void listen(MyEvent event) {
        log.info(String.format("%s监听到事件源：%s.", MyListener4.class.getName(), event.getSource()));
    }
}
