package org.example.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 16:55
 */
public class TestArrayListCat {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
//        初始化 两条数据
        cats.add(new Cat("小猫"));
        cats.add(new Cat("小狗"));
        System.out.println(cats);

//        获取第一条数据
        Cat cat = cats.get(0);
        System.out.println(cat);

        //向 序号为1的位置插入一条数据
        cats.add(1, new Cat("小猪"));
        System.out.println(cats);

        //更新 序号为1的数据
        cats.set(1, new Cat("小猪猪"));
        System.out.println(cats);

        //删除 序号为1的数据
        cats.remove(1);
        System.out.println(cats);

        //获取长度
        int size = cats.size();
        System.out.println(size);

        //更新最后一个
        cats.set(cats.size() - 1, new Cat("小猪猪123"));
        System.out.println(cats);

        //删除最后一个
        cats.remove(cats.size() - 1);
        System.out.println(cats);
    }
}
