package top.hang.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.hang.common.Result;
import top.hang.entity.User;
import top.hang.entity.UserLoginVo;
import top.hang.repository.UserRepository;
import top.hang.service.UserService;

import java.util.Optional;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 21:54
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private UserService userService;

    @Resource
    private UserRepository userRepository;
    @PostMapping("/login")
    public Result login(@RequestBody User user)  {
        UserLoginVo loginUser = userService.login(user.getUsername(), user.getPassword());
        return Result.success("登录成功",loginUser);
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        int id = userService.register(user);
        return Result.success("注册成功",id);
    }

    @GetMapping("/{id}")
    public Result getUserById(@PathVariable("id") int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            return Result.error("用户不存在");
        }
        return Result.success("查询成功",user.get());
    }


}
