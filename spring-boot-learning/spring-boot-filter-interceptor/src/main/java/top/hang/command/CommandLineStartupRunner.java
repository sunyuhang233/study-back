package top.hang.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Ahang
 * @version 1.0
 * @description CommandLineStartupRunner
 * 实现CommandLineRunner接口，重写run方法，可以在springboot启动时执行一些操作
 * 将系统常用的数据加载到内存中，提高系统的访问速度
 * 应用上一次运行的垃圾数据清理
 * 系统启动时，检查系统的配置文件，如果配置文件有问题，可以在这里进行处理
 * @date 2023/3/27 18:19
 */
@Component
@Slf4j
public class CommandLineStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("CommandLineStartupRunner传入参数：{}", Arrays.toString(args));
    }
}

