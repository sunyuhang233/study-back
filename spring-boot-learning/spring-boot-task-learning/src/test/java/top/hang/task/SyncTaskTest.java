package top.hang.task;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SyncTaskTest {
    @Resource
    private SyncTask syncTask;

    @Test
    void doTaskOne() throws InterruptedException {
        long start = System.currentTimeMillis();
        syncTask.doTaskOne();
        syncTask.doTaskTwo();
        syncTask.doTaskThree();
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }

    @Test
    void doTaskTwo() {
    }

    @Test
    void doTaskThree() {
    }
}