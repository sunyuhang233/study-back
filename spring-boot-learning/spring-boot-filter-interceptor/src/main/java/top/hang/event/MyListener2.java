package top.hang.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Ahang
 * @version 1.0
 * @description 自定义事件2监听器 实现ApplicationListener接口 重写onApplicationEvent方法 通过@Component注解将其注入到spring容器中
 * @date 2023/3/27 18:09
 */
@Component
@Slf4j
public class MyListener2 implements ApplicationListener<MyEvent> {
        @Override
        public void onApplicationEvent(MyEvent event) {
            log.info(String.format("%s监听到事件源：%s.", MyListener2.class.getName(), event.getSource()));
        }
}
