package top.hang.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Ahang
 * @version 1.0
 * @description 异步调用任务
 * @date 2023/4/4 13:59
 */
@Component
public class AsyncTask extends AbstractTask{
    @Override
    @Async // 该注解表示该方法是异步的 修饰方法不能是static的
    public void doTaskOne() throws InterruptedException {
        super.doTaskOne();
    }

    @Override
    @Async // 该注解表示该方法是异步的
    public void doTaskTwo() throws InterruptedException {
        super.doTaskTwo();
    }

    @Override
    @Async // 该注解表示该方法是异步的
    public void doTaskThree() throws InterruptedException {
        super.doTaskThree();
    }
}
