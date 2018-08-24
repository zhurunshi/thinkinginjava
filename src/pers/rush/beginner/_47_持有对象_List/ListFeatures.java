package pers.rush.beginner._47_持有对象_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {

    /*
     * List: ArrayList(随机访问元素,底层用数组实现,不适合中间插入/移除元素,效率低) 
     * LinkedList(链表,插入/删除开销小,随机访问比较慢) 
     * Set集 内部的数据具有唯一性
     * Map映射表 对每个元素保存一份,基于键
     * 
     * LinkedHashSet 既保持唯一性,又有顺序
     * LinkedHashMap 有顺序的map
     */
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        System.out.println(" 1: " + list);
        list.add("444");
        System.out.println(" 2: " + list);
        System.out.println(" 3: contains(\"444\") " + list.contains("444"));
        String s = list.get(2);
        System.out.println(" 4: indexOf(s) " + list.indexOf(s));
        
        String sn = new String("11");
        System.out.println(" 5: indexOf(sn) " + list.indexOf(sn));
        // remove方法返回false说明移除未成功
        System.out.println(" 6: remove(\"1111\") " + list.remove("1111"));
        System.out.println(" 7: remove(s) " + list.remove(s));
        System.out.println(" 8: " + list);
        list.add(2, "555");
        System.out.println(" 9: list.add(2, \"555\") " + list);
        List<String> sub = list.subList(1, 4);
        System.out.println(" 10: subList(1, 4)左闭右开 " + sub);
        System.out.println(" 11: list.containsAll(sub) " + list.containsAll(sub));
        // 打乱sub的顺序
        Collections.sort(sub);
        System.out.println(sub);
        // 即使打乱顺序,仍然是true,所以知道是检测元素本身是否全部包含在list中,而没有顺序
        System.out.println(" 12: list.containsAll(sub) " + list.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println(" 13: Collections.shuffle(sub, rand) " + sub);
        System.out.println("list: " + list);
        // ☆☆☆☆☆修改sub的同时也将list修改了
        List<String> copy = new ArrayList<String>(list);
        sub = Arrays.asList(list.get(1), list.get(3));
        System.out.println("copy: " + copy);
        System.out.println("sub: " + sub);
        
        // 保留所有(交集运算)
        copy.retainAll(sub);
        System.out.println("after copy.retainAll(sub) copy: " + copy);
        copy.add("444");
        System.out.println(copy);
        // 遍历sub的元素,从copy里一起移除,相同的String不管出现几次全部移除
        copy.removeAll(sub);
        System.out.println("after copy.removeAll(sub) copy: " + copy);
        
        copy.clear(); // 清空
        copy.add("222");
        System.out.println("copy: " + copy);
        copy.set(0, "111");
        System.out.println("copy: " + copy);
        copy.addAll(sub);
        System.out.println("copy: " + copy);
        sub.set(0, "222");
        System.out.println("copy: " + copy);
        /* 只有截取是修改subList的话,原list也改
         * list.addAll(sub),sub修改,list不变
         */
        System.out.println(copy.isEmpty());
        Object[] os = copy.toArray();
        System.out.println(os[2]);
        
        String[] ss = copy.toArray(new String[0]);
        System.out.println(ss[1]);
        
        copy.clear();
        System.out.println("after copy.clear() copy: " + copy.isEmpty());
    }
}
