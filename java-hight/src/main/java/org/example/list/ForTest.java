package org.example.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:03
 */
public class ForTest {
    public static void main(String[] args) {
//        遍历方式
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("小猫"));
        cats.add(new Cat("小狗"));
        cats.add(new Cat("小猪"));
        cats.add(new Cat("小猪猪"));

        //第一种 for
        for (int i = 0; i < cats.size(); i++) {
            Cat cat = cats.get(i);
            System.out.println(cat);
        }

        System.out.println("====================================");

        //第二种 for each
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println("====================================");

        //第三种 iterator
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next();
            System.out.println(cat);
        }
    }
}
