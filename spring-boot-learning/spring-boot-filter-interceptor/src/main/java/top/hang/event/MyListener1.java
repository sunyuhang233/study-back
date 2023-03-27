package top.hang.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @author Ahang
 * @version 1.0
 * @description 自定义事件1监听器 实现ApplicationListener接口 重写onApplicationEvent方法
 * @date 2023/3/27 18:07
 */
@Slf4j
public class MyListener1 implements ApplicationListener<MyEvent> {


    @Override
    public void onApplicationEvent(MyEvent event) {
      log.info(String.format("%s监听到事件源：%s.", MyListener1.class.getName(), event.getSource()));
    }
}
