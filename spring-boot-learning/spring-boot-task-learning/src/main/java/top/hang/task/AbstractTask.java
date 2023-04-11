package top.hang.task;

import lombok.extern.slf4j.Slf4j;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

/**
 * @author Ahang
 * @version 1.0
 * @description 任务抽象类
 * @date 2023/4/4 13:46
 */
@Slf4j
public abstract class AbstractTask {
    public void doTaskOne() throws InterruptedException {
        log.info("开始做任务一");
        // 开始时间
        long start = currentTimeMillis();
        // 执行耗时时间
        sleep(10000);
        // 结束时间
        long end = currentTimeMillis();
        log.info("完成任务一，耗时：{}毫秒", end - start);
    }

    public void doTaskTwo() throws InterruptedException {
        log.info("开始做任务二");
        // 开始时间
        long start = currentTimeMillis();
        // 执行耗时时间
        sleep(5000);
        // 结束时间
        long end = currentTimeMillis();
        log.info("完成任务二，耗时：{}毫秒", end - start);
    }

    public void doTaskThree() throws InterruptedException {
        log.info("开始做任务三");
        // 开始时间
        long start = currentTimeMillis();
        // 执行耗时时间
        sleep(3000);
        // 结束时间
        long end = currentTimeMillis();
        log.info("完成任务三，耗时：{}毫秒", end - start);
    }
}
