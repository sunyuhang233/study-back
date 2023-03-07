package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 19:28
 */
@Controller
public class Test1 {
    @GetMapping("/test1")
    @ResponseBody
    public ModelAndView test1() {
        ModelAndView mav = new ModelAndView();
        Student ahang = new Student("ahang", 18);
        mav.addObject("userList", ahang);
        mav.setViewName("/WEB-INF/ftl/first.ftl");
        return mav;
    }
}
