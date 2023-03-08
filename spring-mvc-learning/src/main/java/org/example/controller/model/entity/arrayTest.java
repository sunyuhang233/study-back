package org.example.controller.model.entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahang
 * @version 1.0
 * @description 传递数组
 * @date 2023/3/8 19:34
 */
@RestController
public class arrayTest {

    @RequestMapping("/m4")
    public String test4(String[] ids) {
        for (String id : ids) {
            System.out.println(id);
        }
        return "modelTest1";
    }
}
