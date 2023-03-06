package top.hang.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 19:18
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans7.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
