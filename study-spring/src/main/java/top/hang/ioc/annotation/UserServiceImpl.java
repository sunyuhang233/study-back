package top.hang.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 19:14
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void save() {
        this. userDao.save();
        System.out.println("UserServiceImpl save");
    }

}
