package top.hang.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.hang.aop.MyLog;
import top.hang.entity.LogUser;
import top.hang.service.ILogUserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger log = LogManager.getLogger(UserController.class);

    @Autowired
    private ILogUserService userService;


    /**
     * 假装登录，将用户信息存到session（方法是我之前写的懒得改，）
     * */
    @PostMapping("/login")
    public String login(@RequestBody LogUser logUser, HttpServletRequest request){
        QueryWrapper<LogUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username",logUser.getUsername()).eq("passwrod",logUser.getPasswrod());
        LogUser user = userService.getOne(wrapper);
        if(user!=null){
            request.getSession().setAttribute("user",user);
            return "登录成功";
        }
        return "登录失败";
    }

    /**记录日志*/
    @MyLog(operation = "查询用户信息",type = 1)
    @GetMapping("/log")
    public List<LogUser> insertLog(HttpServletRequest request){
        List<LogUser> users = userService.list();
        return users;
    }
}
