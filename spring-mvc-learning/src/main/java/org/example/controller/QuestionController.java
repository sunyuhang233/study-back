package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 16:31
 */
@RestController
public class QuestionController {
    @PostMapping("/question")
    public void test(@RequestParam("name") String name, @RequestParam("course") String course, @RequestParam("hobby"
    ) List<Integer> hobby, HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        System.out.println(name);
        System.out.println(course);
        System.out.println(hobby);
        String hobbyStr = "";
        for (Integer integer : hobby) {
            if (integer == 1) {
                hobbyStr += "篮球";
            }
            if (integer == 2) {
                hobbyStr += "足球";
            }
            if (integer == 3) {
                hobbyStr += "乒乓球";
            }

        }
//        页面展示html
        response.setContentType("text/html;charset=utf-8");
//        输出你选择的是 你的姓名 什么课程 什么爱好 什么爱好


        String msg = "感谢你使用调查问卷，" + name + "你选择的是" + course + "课程，你的爱好是" + hobbyStr;
        response.getWriter().write(msg);
    }
}
