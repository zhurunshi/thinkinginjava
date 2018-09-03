package pers.rush.beginner._48_持有对象_迭代器;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CrossContainerIteration {
    public static void display(Iterator<String> it) {
        while(it.hasNext()) {
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(8); // 有序
        for (int i = 0; i < 8 ; ++i) {
            al.add(i + "");
        }
        LinkedList<String> ll = new LinkedList<>(al); // 有序
        HashSet<String> hs = new HashSet<>(al); // 无序
        TreeSet<String> ts = new TreeSet<>(al); // 无序
        display(al.iterator());
        display(ll.iterator());
        display(hs.iterator());
        display(ts.iterator());
        // Iterator的next方法只能单方向移动
        // ListIterator的next方法可以双向移动,还可以指定起始点
    }
}
