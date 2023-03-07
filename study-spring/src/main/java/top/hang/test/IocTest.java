package top.hang.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description 三种获取bean的方式
 * @date 2023/3/6 23:03
 */
public class IocTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test1.xml");

        // 第一种获取
        User user1 =(User) context.getBean("user");
        System.out.println("第一种"+user1);

        // 第二种获取
        User user2 = context.getBean(User.class);
        System.out.println("第二种"+user2);

        // 第三种获取
        User user3 = context.getBean("user", User.class);
        System.out.println("第三种"+user3);
    }
}
