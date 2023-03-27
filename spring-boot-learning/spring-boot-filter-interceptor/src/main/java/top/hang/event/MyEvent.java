package top.hang.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Ahang
 * @version 1.0
 * @description 自定义事件 继承ApplicationEvent 重写构造方法
 * @date 2023/3/27 18:06
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
