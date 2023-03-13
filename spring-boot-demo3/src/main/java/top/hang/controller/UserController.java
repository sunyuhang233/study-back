package top.hang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hang.common.Result;
import top.hang.entity.User;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/13 15:36
 */

@RestController
public class UserController {
    @GetMapping("/user")
    public Result getUser(){
        User user = new User();
        user.setName("Ahang");
        user.setAge(18);
        return Result.success(user);
    }
}
