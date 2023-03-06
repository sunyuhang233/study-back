package top.hang.ioc.instance.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hang.ioc.instance.constructor.Bean1;
import top.hang.ioc.instance.static_factory.Bean2;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 18:55
 */
public class InstanceTest3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3" +
                ".xml");
        Bean3 bean3 = (Bean3) context.getBean("bean3");
        System.out.println(bean3);
    }
}
