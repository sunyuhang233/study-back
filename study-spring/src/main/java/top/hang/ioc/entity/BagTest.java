package top.hang.ioc.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 16:33
 */
public class BagTest {
    public static void main(String[] args) {
//        准备一个 SpringApplication 测试类完成容器的初始化，并通过getBean方法从容器中获取SchoolBag 的实例对象。
//        通过实例对象调用toString方法打印对象的属性值。
        // 1. 配置文件目录
        String xmlPath="/applicationContext.xml";
        // 2.从配置文件中读取配置信息，创建对象 创建spring容器
        BeanFactory factory = new ClassPathXmlApplicationContext(xmlPath);
        // 3. 从容器中获取对象
        SchoolBag s = (SchoolBag) factory.getBean("schoolBag");
        System.out.println(s.getPencilCase());
    }
}
