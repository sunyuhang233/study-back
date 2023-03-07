package top.hang.test.io;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 12:43
 */
public class DogTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test4.xml");
        Dog dog = context.getBean("dog1", Dog.class);
        System.out.println(dog);
    }
}
