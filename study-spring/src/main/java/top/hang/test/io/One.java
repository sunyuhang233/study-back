package top.hang.test.io;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/7 12:47
 */
public class One {
    private String[] hobbies;

    public One(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public One() {
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "One{" +
                "hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test5.xml");
        One one = context.getBean("one", One.class);
        System.out.println(one);
    }
}
