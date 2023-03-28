package top.hang.service;

import org.springframework.stereotype.Service;
import top.hang.entity.User;
import top.hang.entity.UserLoginVo;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 21:46
 */

public interface UserService {
    UserLoginVo login(String username, String password) ;

    int register(User user);
}
