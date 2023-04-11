package top.hang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Ahang
 * @version 1.0
 * @description 异步任务线程池配置
 * @date 2023/4/4 14:24
 */
@Configuration
public class TaskConfig {
    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 核心线程数
        executor.setCorePoolSize(12);
        // 最大线程数
        executor.setMaxPoolSize(26);
        // 队列大小
        executor.setQueueCapacity(2000);
        // 线程最大空闲时间
        executor.setKeepAliveSeconds(120);
        // 线程名称前缀
        executor.setThreadNamePrefix("taskExecutor-");
        // 线程池关闭时等待所有任务完成再继续销毁其他的Bean
        executor.setWaitForTasksToCompleteOnShutdown(true);
        // 等待时长
        executor.setAwaitTerminationSeconds(60);
        // 拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 初始化
        executor.initialize();
        return executor;
    }
}
