package top.hang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/29 18:51
 */
@RestController
@Slf4j
public class LogTestController {

    @GetMapping("/log")
    public void log() {
        log.info("info 日志");
        log.debug("debug 日志");
        log.error("error 日志");
        log.warn("warn 日志");
        log.trace("trace 日志");
    }
}
