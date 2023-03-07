package org.example.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/test1")
    public ModelAndView test1(HttpSession session, Model model) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.addObject("users", "hell : zoro");
        return mv;
    }
}
