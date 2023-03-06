package top.hang.ioc.instance.factory;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 18:56
 */
public class Mybean3Factory {
    public Mybean3Factory() {
        System.out.println("Mybean3Factory的构造方法被调用了");
    }
    public Bean3 createBean3() {
        return new Bean3();
    }
}
