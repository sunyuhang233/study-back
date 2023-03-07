package top.hang.test.io;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 12:31
 */
public class UserTest {
    public static void main(String[] args) {

//        set方式
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test2.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);

        //        构造器方式
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("test2.xml");
        User user1 = context1.getBean("user1", User.class);
        System.out.println(user1);

    }

}
