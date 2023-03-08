package org.example.controller.model;

import org.example.controller.model.entity.LoginUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahang
 * @version 1.0
 * @description 通过传递实体类来绑定数据
 * @date 2023/3/8 19:29
 */
@RestController
public class modelUserController {
    @PostMapping("/m3")
    public String test3( LoginUser loginUser) {
        System.out.println("id:" + loginUser.getId());
        System.out.println("name:" + loginUser.getName());
        System.out.println("password:" + loginUser.getPassword());
        return "modelTest1";
    }
}
