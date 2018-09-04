package pers.rush.beginner._50_持有对象_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {

    /*
     * Set 不允许有重复元素
     * 比如:过滤容器类的元素
     * HashSet 无序 顺序由Hash算法决定,查找速度快 底层用散列函数
     * LinkedHashSet 有序(保持存放顺序) 底层用散列函数+链表
     * TreeSet 无序(自然排序和定制排序) 底层用红黑树
     */
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for(int i = 0; i < 10000; ++i) {
            intset.add(rand.nextInt(30)); // [0,30)
        }
        System.out.println(intset);
    }

}
