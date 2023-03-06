package top.hang.ioc.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 19:03
 */
public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans4" +
                ".xml");
        System.out.println(context.getBean("scope"));
        System.out.println(context.getBean("scope"));

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("beans5" +
                ".xml");
        System.out.println(context1.getBean("scope"));
    }
}
