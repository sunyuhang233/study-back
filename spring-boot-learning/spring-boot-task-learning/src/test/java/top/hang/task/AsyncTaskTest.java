package top.hang.task;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AsyncTaskTest {
    @Resource
    private AsyncTask asyncTask;
    @Test
    public void test() throws InterruptedException {
        long start = System.currentTimeMillis();
        asyncTask.doTaskOne();
        asyncTask.doTaskTwo();
        asyncTask.doTaskThree();
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }
}