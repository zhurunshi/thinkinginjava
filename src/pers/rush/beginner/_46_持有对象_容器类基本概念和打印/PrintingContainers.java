package pers.rush.beginner._46_持有对象_容器类基本概念和打印;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class PrintingContainers {
    
    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(new LinkedList<String>());
        System.out.println(new HashSet<String>());
        System.out.println(new TreeSet<String>());
        System.out.println(new LinkedHashSet<String>());
        System.out.println(new HashMap<String, String>());
    }
    
    static Collection fill(Collection<String> collection) {
        collection.add("ret"); // 老鼠
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    
    static Map fill(Map<String, String> map) {
        // 键不允许重复
        map.put("ret", "fuzzy"); // 老鼠，有毛的
        map.put("cat", "rags"); // 可以嬉闹玩耍的
        map.put("dog", "bosco");
        map.put("dog", "spot"); // 侦查
        return map;
    }
        
}
