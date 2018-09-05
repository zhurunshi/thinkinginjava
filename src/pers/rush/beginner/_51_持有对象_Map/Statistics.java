package pers.rush.beginner._51_持有对象_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

    public static void main(String[] args) {
        /*
         * Map 映射表
         * 键(对象)--值(对象)
         * 键:如果是自定义的class,必须重写hashCode和equals方法
         * 如果没有重写,则检索不到内容
         * 值:任何对象
         * HashMap 散列表
         * TreeMap 
         */
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>(); // 键不允许重复,后赋值会将原先的覆盖掉
        for(int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20); // [0,20)
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : ++freq);
        }
        System.out.println(m);
    }

}
