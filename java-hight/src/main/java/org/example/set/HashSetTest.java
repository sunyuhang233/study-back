package org.example.set;

import java.util.HashSet;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:06
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        // 重复添加 返回false
       boolean a= strings.add("a");
        System.out.println(a);

        // size
        int size = strings.size();
        System.out.println(size);

        // 是否包含
        boolean a1 = strings.contains("a");
        System.out.println(a1);
    }
}
