package top.hang.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 19:15
 */
@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public void save() {
        this.userService.save();
        System.out.println("UserController save");
    }
}
