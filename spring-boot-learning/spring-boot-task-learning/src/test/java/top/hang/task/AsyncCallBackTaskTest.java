package top.hang.task;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Future;

@SpringBootTest
class AsyncCallBackTaskTest {
    @Resource
    private AsyncCallBackTask asyncCallBackTask;

    @Test
    public void test() throws InterruptedException {
        long start = System.currentTimeMillis();
        // 返回Future对象 未来的某个时间点会返回一个String类型的值
        Future<String> task1 = asyncCallBackTask.doTaskThreeCallBack();
        Future<String> task2 = asyncCallBackTask.doTaskTwoCallBack();
        Future<String> task3 = asyncCallBackTask.doTaskOneCallBack();
        // 三个任务都调用完成，才会继续往下执行
        while (true) {
            if (task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }

}