package top.hang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Ahang
 * @version 1.0
 * @description Sse服务端推送
 * @date 2023/4/17 13:39
 */
@Controller
@Slf4j
@CrossOrigin
public class SseController {
    /***
     * @description 服务端推送消息
     *
     */
    @RequestMapping(value = "sse/msg", method = RequestMethod.GET, produces = "text/event-stream;charset=UTF-8")
    @Scheduled(fixedRate = 5000)
    public ResponseBodyEmitter pushMsg() throws Exception {
        SseEmitter emitter = new SseEmitter();
        Random random = new Random();
        int i = random.nextInt(100);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(System.currentTimeMillis());
        String all = "当前时间为：" + time + "股票的价格为" + i + "元";
        Thread.sleep(1000);
        emitter.send(all);
        emitter.complete();
        return emitter;
    }
}
