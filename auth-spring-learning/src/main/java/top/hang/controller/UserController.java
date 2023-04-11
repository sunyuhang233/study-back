package top.hang.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import top.hang.auths.MyLog;
import top.hang.common.Common;
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
    @MyLog(value = "用户登录")
    public Result login(@RequestBody User user)  {
        UserLoginVo loginUser = userService.login(user.getUsername(), user.getPassword());
        return Result.success(Common.LOGIN_SUCCESS_MSG,loginUser);
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        int id = userService.register(user);
        return Result.success(Common.REGISTER_SUCCESS_MSG,id);
    }

    @GetMapping("/{id}")
//    @CheckAuth
    public Result getUserById(@PathVariable("id") int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            return Result.error(Common.ERROR_CODE, Common.USER_NOT_EXIST_MSG);
        }
        return Result.success(Common.SUCCESS_MSG,user.get());
    }
}
