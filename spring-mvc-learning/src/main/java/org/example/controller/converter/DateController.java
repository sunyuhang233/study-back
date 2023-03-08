package org.example.controller.converter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Ahang
 * @version 1.0
 * @description 日期控制器
 * @date 2023/3/7 22:36
 */
@Controller
public class DateController {
    @RequestMapping("/customDate")
    public String customDate(Date date) {
        System.out.println(date);
        return date.toString();
    }
}
