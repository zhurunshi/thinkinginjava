package pers.rush.beginner._50_持有对象_Set;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {

    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<>();
        for(int i = 0; i < 10000; ++i) {
            intset.add(rand.nextInt(30)); // [0,30)
        }
        System.out.println(intset);
        /*
         * 实际上TreeSet也比较快,但是HashSet插入更快
         * TreeSet插入时需要调整,而且占用内存量比较大
         */
    }

}
