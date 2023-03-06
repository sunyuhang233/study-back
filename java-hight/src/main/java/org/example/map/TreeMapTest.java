package org.example.map;

import java.util.TreeMap;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:20
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Object> map = new TreeMap<>();
        map.put("name", "ahang");
        map.put("sex","男");
        System.out.println(map);
    }
}
