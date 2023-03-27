package top.hang.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 18:22
 */
@Component
@Slf4j
public class AppStartupRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        log.info("ApplicationRunner参数名称: {}", args.getOptionNames());
        log.info("ApplicationRunner参数值: {}", args.getOptionValues("age"));
        log.info("ApplicationRunner参数: {}", Arrays.toString(args.getSourceArgs()));
    }
}
