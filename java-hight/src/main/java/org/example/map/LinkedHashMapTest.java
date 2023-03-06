package org.example.map;

import java.util.LinkedHashMap;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:18
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name", "ahang");
        linkedHashMap.put("age", 19);

        System.out.println(linkedHashMap);
    }
}
