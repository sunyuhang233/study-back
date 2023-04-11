package top.hang.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author Ahang
 * @version 1.0
 * @description 异步调用任务 回调函数
 * @date 2023/4/4 14:05
 */
@Component
public class AsyncCallBackTask extends AbstractTask {

    @Async
    // @Async 该注解表示该方法是异步的 修饰方法不能是static的
    // Future<String> 表示该方法有返回值 且返回值类型为String 未来的某个时间点会返回一个String类型的值
    public Future<String> doTaskOneCallBack() throws InterruptedException {
        super.doTaskOne();
        return new AsyncResult<>("任务一完成");
    }


    @Async
    public Future<String> doTaskTwoCallBack() throws InterruptedException {
        super.doTaskTwo();
        return new AsyncResult<>("任务二完成");
    }


    @Async
    public Future<String> doTaskThreeCallBack() throws InterruptedException {
        super.doTaskThree();
        return new AsyncResult<>("任务三完成");
    }
}
