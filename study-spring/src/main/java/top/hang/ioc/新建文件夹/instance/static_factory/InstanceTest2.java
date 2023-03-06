package top.hang.ioc.instance.static_factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 18:52
 */
public class InstanceTest2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2" +
                ".xml");
        Bean2 bean2 = (Bean2) context.getBean("bean2");
        System.out.println(bean2);
    }
}
