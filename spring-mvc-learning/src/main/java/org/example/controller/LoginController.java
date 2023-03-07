package org.example.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 16:20
 */
@Controller
public class LoginController {
    @PostMapping("login")
    public void login(User user, HttpServletResponse response) throws IOException {
        System.out.println("name:" + user.getName() + " password:" + user.getPassword());
        response.sendRedirect("success.html");
    }
}
