package top.hang.test.io;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 12:38
 */
public class CatTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test3.xml");
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);
    }
}
