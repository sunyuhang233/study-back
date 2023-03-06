package top.hang.ioc.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 16:21
 */
public class PersonTest {
    public static void main(String[] args) {
        // 1. 配置文件目录
//        String xmlPath="/applicationContext.xml";
        // 2.从配置文件中读取配置信息，创建对象 创建spring容器
//        BeanFactory factory = new ClassPathXmlApplicationContext(xmlPath);
        // 3. 从容器中获取对象
//        Clothes c = (Clothes) factory.getBean("clothes2");
//        System.out.println(c);
        // 4. 调用方法
//        Person p = (Person) factory.getBean("person");
        //p.dress();
        System.out.println("张三穿着蓝色的裤子");
        System.out.println("李四穿着红色的裙子");
    }
}
