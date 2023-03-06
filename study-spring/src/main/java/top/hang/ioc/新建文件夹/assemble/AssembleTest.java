package top.hang.ioc.assemble;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 19:11
 */
public class AssembleTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans6" +
                ".xml");
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
    }
}
