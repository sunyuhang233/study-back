package top.hang.jobs;

import cn.hutool.http.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author Ahang
 * @version 1.0
 * @description 定时任务
 * @date 2023/4/4 14:59
 */
@Component
@Slf4j
public class ScheduledJobs {
    // 每隔五秒执行一次
//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelay() throws InterruptedException {
//        log.info("fixedDelay开始----------------->: {}", LocalDateTime.now());
//        Thread.sleep(10 * 1000);
//        log.info("fixedDelay结束----------------->: {}", LocalDateTime.now());
//    }

    // 每隔三秒执行一次
//    @Scheduled(fixedRate = 3000)
//    public void fixedRate() throws InterruptedException {
//        log.info("fixedRate开始----------------->: {}", LocalDateTime.now());
//        Thread.sleep(5 * 1000);
//        log.info("fixedRate结束----------------->: {}", LocalDateTime.now());
//    }

    // 5的倍数秒执行一次
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void fixedCorn() throws InterruptedException {
//       log.info("任务开始"+LocalDateTime.now());
//    }

    // 每年4月4号15点16分20秒执行一次
    // core表达式参数 依次为 秒 分 时 日 月 周 年
    // core表达式 写法  x/y 含义 x为开始时间 y为步长
//    @Scheduled(cron = "20 16 15 4 4 * *")
//    public void fixedCorn() throws InterruptedException {
//        log.info("生日快乐");
//    }

    // 每隔五秒请求二维码页面一次
    @Scheduled(fixedDelay = 10000)
    public void fixedDelay() throws InterruptedException {
        HttpUtil.get("http://localhost:8080/erweima/get");
        log.info("请求二维码页面一次");
    }

}
