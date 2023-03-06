package top.hang.ioc;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 15:17
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("我是第一个spring程序,userService");
    }
}
