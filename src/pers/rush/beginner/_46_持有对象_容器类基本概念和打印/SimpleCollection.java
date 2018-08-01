package pers.rush.beginner._46_持有对象_容器类基本概念和打印;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    /*
     * Set不允许有重复元素
     * Map是一组成对的键值对
     * ArrayList允许使用数字查找值
     * Map允许用一个对象来查找另一个对象,他们两被关联起来
     * 也被称为叫关联数组和字典
     * ArrayList可以动态扩展
     */
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>(); // 实际new的是子类
        for (int i = 0; i < 10; ++i) {
            c.add(i); // 添加一个元素
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
