package org.example.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/6 22:11
 */
public class TreeSetSample {
    static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public void sort(){
        TreeSet<Integer> integers = new TreeSet<>(new IntegerComparator());
        integers.add(5);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);
    }

    public static void main(String[] args) {
       new TreeSetSample().sort();
    }
}
