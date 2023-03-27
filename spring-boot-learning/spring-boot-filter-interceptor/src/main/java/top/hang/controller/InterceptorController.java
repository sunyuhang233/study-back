package top.hang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 16:06
 */
@Controller
@RequestMapping("/api")
public class InterceptorController {
    @GetMapping("/interceptor")
    public String interceptor(Model model) {
        model.addAttribute("name", "ahang");
        return "index";
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/login")
    public String interceptor2(Model model) {
        model.addAttribute("login", "login");
        return "login";
    }
}
