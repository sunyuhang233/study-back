package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class FreemarkerController {

    @RequestMapping("/hello")
    @ResponseBody
    public ModelAndView sayHello() {
        ModelAndView mav = new ModelAndView();

        ArrayList<Item> arrayList = new ArrayList<>();
        Item item1 = new Item("Microservices", "Quickly deliver production‑grade features with independently " +
                "evolvable " +
                "microservices", "/img/1.png");
        Item item2 = new Item("Cloud Native", "Build and run applications on a modern cloud platform that is " +
                "optimized for " +
                "containers", "/img/2.svg");
        Item item3 = new Item("DevOps", "Automate the build, test, and release of your software with a fully managed " +
                "CI/CD " +
                "service", "/img/3.svg");
        Item item4 = new Item("Containers", "Package your application with all of its dependencies into a " +
                "standardized unit for " +
                "software development", "/img/4.svg");
        Item item5 = new Item("Serverless", "Run code without thinking about servers, and pay only for the time your " +
                "code is " +
                "running", "/img/5.svg");
        Item item6 = new Item("Artificial Intelligence", "Build applications that can see, hear, " +
                "speak, understand, and even take " +
                "actions", "/img/6.svg");
        Item item7 = new Item("Big Data", "Process and analyze massive amounts of data using a variety of tools and" +
                " frameworks",
                "/img/7.svg");
        arrayList.add(item1);
        arrayList.add(item2);
        arrayList.add(item3);
        arrayList.add(item4);
        arrayList.add(item5);
        arrayList.add(item6);
        arrayList.add(item7);
        mav.addObject("listData", arrayList);
        mav.setViewName("hello");
        return mav;
    }
}
 
