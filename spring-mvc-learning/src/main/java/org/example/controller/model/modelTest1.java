package org.example.controller.model;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahang
 * @version 1.0
 * @description 绑定默认数据类型
 * @date 2023/3/8 19:15
 */
@RestController
public class modelTest1 {
    @RequestMapping("/m1")
    public String test1(HttpServletRequest request) {
        String id = request.getParameter("id");
        System.out.println(id);
        return "modelTest1";
    }

    @RequestMapping("/m2")
    public String test2(String id) {
        System.out.println("id"+id);
        return "modelTest1";
    }
}
