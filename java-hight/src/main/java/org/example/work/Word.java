package org.example.work;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:34
 */
public class Word {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("orange");
        list.add("apple");
        list.add("banana");
        list.add("pear");
        list.add("grape");
        list.add("watermelon");
        list.add("strawberry");

        System.out.println("排序前：");
        System.out.println(list);

//        根据ASCII码排序
        list.sort(Comparator.comparing(String::toString));
        System.out.println("排序后：");
        System.out.println(list);

    }
}
