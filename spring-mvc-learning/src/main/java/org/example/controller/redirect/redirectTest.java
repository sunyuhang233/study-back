package org.example.controller.redirect;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahang
 * @version 1.0
 * @description 重定向练习
 * 重定向的两种方式
 * :后面直接接地址
 * 1. "redirect:sendMessage";
 * 2. forward:sendMessage
 * @date 2023/3/8 19:00
 */
@RestController
public class redirectTest {
    @RequestMapping("/redirect1")
    public String update(HttpServletRequest request, HttpServletResponse response) {
        return "redirect:http://localhost:8888/sendMessage";
    }

    @RequestMapping("/redirect2")
    public String update1(HttpServletRequest request, HttpServletResponse response) {
        return "forward:http://localhost:8888/sendMessage";
    }

    @RequestMapping("/sendMessage")
    public String update2(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("重定向成功");
        return "success";
    }

}
