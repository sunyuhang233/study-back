package top.hang.task;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class AsyncExecutorTaskTest {
    @Resource
    private AsyncExecutorTask asyncExecutorTask;

    @Test
    void doTaskOneCallBack() throws InterruptedException {
        long start = System.currentTimeMillis();
        asyncExecutorTask.doTaskOneCallBack();
        asyncExecutorTask.doTaskTwoCallBack();
        asyncExecutorTask.doTaskThreeCallBack();
        long end = System.currentTimeMillis();
        log.info("任务全部完成，总耗时：{}毫秒", end - start);
    }

}