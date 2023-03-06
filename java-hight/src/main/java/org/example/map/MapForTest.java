package org.example.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:21
 */
public class MapForTest {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("city","南京");
        map.put("name","ahang");
        map.put("sex","男");

        // map 遍历
        // 1. keySet
        for (String key : map.keySet()) {
            System.out.println("key: " + key + " value: " + map.get(key));
        }
        System.out.println("=====================================");
        // 2. entrySet
        for (HashMap.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        System.out.println("=====================================");
        // 3. lambda
        map.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
        System.out.println("=====================================");
        // 4.迭代器
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
