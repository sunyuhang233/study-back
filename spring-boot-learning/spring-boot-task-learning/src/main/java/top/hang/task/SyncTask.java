package top.hang.task;

import org.springframework.stereotype.Component;

/**
 * @author Ahang
 * @version 1.0
 * @description 同步任务调用子类
 * @date 2023/4/4 13:52
 */
@Component
public class SyncTask extends AbstractTask {
    @Override
    public void doTaskOne() throws InterruptedException {
        super.doTaskOne();
    }

    @Override
    public void doTaskTwo() throws InterruptedException {
        super.doTaskTwo();
    }

    @Override
    public void doTaskThree() throws InterruptedException {
        super.doTaskThree();
    }
}
