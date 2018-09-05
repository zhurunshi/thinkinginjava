package pers.rush.beginner._54_持有对象_Foreach和迭代器;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForeachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for(String s : cs) {
            System.out.print("'" + s + "' ");
        }
        /*
         * 之所以可以用for-each循环，是因为Java5引入了一个可迭代的接口Iterable
         * java.util.Iterable
         * 能用for-each循环，必须实现了Iterable中的iterator方法
         */
    }
}
