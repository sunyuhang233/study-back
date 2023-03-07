package top.hang.test.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 23:11
 */
public class UserDaoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test1.xml");
        UserDao dao = context.getBean(UserDao.class);
        System.out.println(dao);
        dao.run();
    }
}
