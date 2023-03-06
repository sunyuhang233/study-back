package top.hang.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 15:24
 */
public class UserNameTest {
    public static void main(String[] args) {
        // 1. 配置文件目录
        String xmlPath="/applicationContext.xml";
        // 2.从配置文件中读取配置信息，创建对象 创建spring容器
        BeanFactory factory = new ClassPathXmlApplicationContext(xmlPath);
        // 3. 从容器中获取对象
        UserNameService userName = (UserNameService) factory.getBean("userName");
        // 4. 调用方法
        userName.say();
    }
}
