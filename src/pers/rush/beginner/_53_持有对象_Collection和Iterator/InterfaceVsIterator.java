package pers.rush.beginner._53_持有对象_Collection和Iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InterfaceVsIterator {
    
    public static void display(Iterator<String> it) {
        while(it.hasNext()) {
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    public static void display(Collection<String> strings) { // 更方便
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
         * Collection 是一个接口,是描述所有序列容器的父类根接口
         * java.util.AbstractCollection 提供了Collection的默认实现
         * public static void abc (Collection<?> c) {
         *      // 不一定写出具体的容器或集合,易于维护和扩展
         * }
         */
        
        List<String> stringList = Arrays.asList("4 1 3 2 6 5 8 7".split(" "));
        Set<String> stringSet = new HashSet<>(stringList);
        Map<String, String> stringMap = new LinkedHashMap<>();
        String[] names = ("Ralph,Eric,Robin,Lacey,Britney,Sam,Spot,Fiuffy".split(","));
        for (int i = 0; i < names.length; ++i) {
            stringMap.put(names[i], stringList.get(i));
        }
        display(stringList);
        display(stringSet);
        display(stringList.iterator());
        display(stringSet.iterator());
        System.out.println(stringMap);
        System.out.println(stringMap.keySet());
        display(stringMap.values());
        display(stringMap.values().iterator());
    }

}
