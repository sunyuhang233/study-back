package org.example.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:08
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        System.out.println(strings);

    }
}
