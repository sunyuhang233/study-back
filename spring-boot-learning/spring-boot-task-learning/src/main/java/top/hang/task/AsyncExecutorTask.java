package top.hang.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/4 14:35
 */
@Component
@Slf4j
public class AsyncExecutorTask extends AbstractTask {
    @Async("taskExecutor")
    public Future<String> doTaskOneCallBack() throws InterruptedException {
        super.doTaskOne();
        log.info("任务一执行的线程名称为：{}", Thread.currentThread().getName());
        return new AsyncResult<>("任务一完成");
    }


    @Async("taskExecutor")
    public Future<String> doTaskTwoCallBack() throws InterruptedException {
        super.doTaskTwo();
        log.info("任务二执行的线程名称为：{}", Thread.currentThread().getName());
        return new AsyncResult<>("任务二完成");
    }


    @Async("taskExecutor")
    public Future<String> doTaskThreeCallBack() throws InterruptedException {
        super.doTaskThree();
        log.info("任务三执行的线程名称为：{}", Thread.currentThread().getName());
        return new AsyncResult<>("任务三完成");
    }
}
