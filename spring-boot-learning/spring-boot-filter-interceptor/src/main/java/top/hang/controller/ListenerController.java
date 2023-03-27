package top.hang.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author Ahang
 * @version 1.0
 * @description 自定义监听器
 * @date 2023/3/27 14:44
 */
@RestController
@RequestMapping("/api")
public class ListenerController {
    @GetMapping("/listener")
    public void listener() {
        // RequestContextHolder.currentRequestAttributes()获取当前线程的request 但是这个request是一个代理对象
        // 类型转换为ServletRequestAttributes 从而获取真正的request
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        request.setAttribute("name", "ahang");
        request.setAttribute("name", "ahang1");
        request.removeAttribute("name");
        System.out.println("listener");
    }
}
