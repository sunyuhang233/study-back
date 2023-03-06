package top.hang.ioc;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 15:23
 */
public class UserNameImpl implements UserNameService {
    private String name;
    private UserDao userDao;

    public UserNameImpl() {
    }

    public UserNameImpl(String name) {
        this.name = name;
    }

    public UserNameImpl(String name, UserDao userDao) {
        this.name = name;
        this.userDao = userDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        System.out.println("hello " + name);
        userDao.say();
    }

    public void setUserName(String userName) {
        this.name = userName;
    }
}
