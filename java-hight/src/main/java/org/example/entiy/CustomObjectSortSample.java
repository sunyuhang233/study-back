package org.example.entiy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:26
 */
public class CustomObjectSortSample {
    private static class CustomComparator implements Comparator<Goods> {
        @Override
        public int compare(Goods o1, Goods o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
    public List<Goods> sort(List<Goods> list){
        CustomComparator customComparator = new CustomComparator();
        list.sort(customComparator);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Goods> goods = new ArrayList<>();
        goods.add(new Goods("1", "e"));
        goods.add(new Goods("2", "b"));
        goods.add(new Goods("3", "c"));
        System.out.println("排序前：");
        System.out.println(goods);

        CustomObjectSortSample customObjectSortSample = new CustomObjectSortSample();
        List<Goods> sort = customObjectSortSample.sort(goods);
        System.out.println("排序后：");
        System.out.println(sort);
    }
}
