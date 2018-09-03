package pers.rush.beginner._48_持有对象_迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {

    /*
     * 迭代器Iterator也被称为轻量级对象,创建的代价非常小
     * Java的迭代器只能单向移动
     * .Iterator() 会返回一个迭代器
     * 默认就准备好可以返回第一个元素
     * .next() 返回序列中的下一个元素
     * .hasNext() 判断后面还有没有
     * .remove()
     * 
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(12);
        Iterator<String> it = list.iterator(); // 普通迭代器
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        for (String string : list) {
            System.out.println(string);
        }
        it = list.iterator();
        for(int i = 0; i < 6; ++i) {
            it.next();
            it.remove();
        }
        System.out.println(list);
    }
}
