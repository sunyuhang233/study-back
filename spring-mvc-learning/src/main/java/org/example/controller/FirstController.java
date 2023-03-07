package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
public class FirstController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //创建模型对象
        ModelAndView mav = new ModelAndView();
        //向模型中添加数据
        mav.addObject("msg","我的第一个SpringMVC应用");
//        mav.addObject("msg","我的第一个SpringMVC应用");
        //设置视图名称
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }
}