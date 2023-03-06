package org.example.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:13
 */
public class HashMapTest {
    public static void main(String[] args) {
        // key value
        HashMap<String, Object> map = new HashMap<>();

        // map -> put 添加信息
        map.put("name", "ahang");
        map.put("age",19);

        // map -> get 获取信息
        String name =(String) map.get("name");
        System.out.println(name);

        //map -> put修改信息
        String name1 =(String) map.put("name", "ahang2");
        System.out.println(name1);


        //map -> containsKey 判断是否存在key
        boolean b = map.containsKey("name");
        System.out.println(b);

        //map -> containsValue 判断是否存在value
        boolean b1 = map.containsValue("ahang");
        System.out.println(b1);

        //map -> size 获取长度
        int size = map.size();
        System.out.println(size);


        //map -> remove 删除信息
        String name2 =(String) map.remove("name");

        //map -> clear 清空信息
        map.clear();
    }
}
