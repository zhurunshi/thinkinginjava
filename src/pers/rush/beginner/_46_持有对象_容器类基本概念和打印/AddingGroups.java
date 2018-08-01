package pers.rush.beginner._46_持有对象_容器类基本概念和打印;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> c = 
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        c.addAll(Arrays.asList(moreInts));
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
        System.out.println();
        // Collection是接口,Collections是工具类
        Collections.addAll(c, 11, 12, 13, 14, 15);
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
        System.out.println();
        Integer[] moreInts2 = {16, 17, 18, 19, 20};
        Collections.addAll(c, moreInts2);
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
        System.out.println();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.set(1, 99);
        for (Integer i : list) {
            System.out.print(i + ", ");
        }
    }
}
