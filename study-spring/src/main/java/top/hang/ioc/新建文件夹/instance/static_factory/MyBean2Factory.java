package top.hang.ioc.instance.static_factory;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 18:52
 */
public class MyBean2Factory {
    public static Bean2 createBean2() {
        System.out.println("MyBean2Factory的静态方法被调用了");
        return new Bean2();
    }
}
