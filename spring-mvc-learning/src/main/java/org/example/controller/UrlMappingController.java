package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 15:31
 */
@Controller
public class UrlMappingController {

    //    get 传参 /url/test?name=xxx
    @GetMapping("test")
    public String test(String name) {
        return name;
    }

    //    post 传参 /url/test  name:m8 password:test
    @PostMapping("test")
    public String test2(String name, String password) {
        System.out.println("name:" + name + " password:" + password);
        return "name:" + name + " password:" + password;
    }

    //    post 传参 /url/test  name:m8 password:test
    @PostMapping("test3")
    public void test3(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        System.out.println("name:" + user.getName() + " password:" + user.getPassword());
        // 返回success.jsp
        response.sendRedirect("success.html");
    }
}
