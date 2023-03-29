package top.hang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/29 18:51
 */
@RestController
public class LogTestController {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/log")
    public void log() {
        logger.trace("Trace 日志...");
        logger.debug("Debug 日志...");
        logger.info("Info 日志...");
        logger.warn("Warn 日志...");
        logger.error("Error 日志...");
    }
}
