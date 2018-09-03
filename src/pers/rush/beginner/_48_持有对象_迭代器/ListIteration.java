package pers.rush.beginner._48_持有对象_迭代器;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteration {
    
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(8); // 有序
        for (int i = 0; i < 8 ; ++i) {
            al.add(i + "");
        }
        ListIterator<String> it = al.listIterator();
        while(it.hasNext()) { // 有没有下一个元素
            System.out.print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
        }
        System.out.println();
        while(it.hasPrevious()) { // 有没有前一个元素
            System.out.print(it.previous() + " ");
        }
        System.out.println();
        System.out.println(al);
        
        it = al.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.set("change"); // 从index3开始全部替换成change
        }
        System.out.println(al);
    }
}
