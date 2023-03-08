package org.example.controller.model.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description 传递list 类型
 * @date 2023/3/8 19:35
 */
@RestController
public class ListTest {

    @GetMapping("/m5")
    public String test5(List<String> ids) {
        for (String id : ids) {
            System.out.println(id);
        }
        return "modelTest1";
    }
}
