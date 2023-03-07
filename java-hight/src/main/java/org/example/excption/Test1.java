package org.example.excption;

/**
 * @author Ahang
 * @version 1.0
 * @description ClassNotFoundException  如果在编译过程中可能出现此异常，在编译过程中必须将其抛出
 * @date 2023/3/7 22:10
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            Class.forName("test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
