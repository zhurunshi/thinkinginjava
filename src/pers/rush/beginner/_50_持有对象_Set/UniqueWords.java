package pers.rush.beginner._50_持有对象_Set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER); // 不区分大小写
        Collections.addAll(words, "apple beer pear Bear App".split(" "));
        System.out.println(words);
        
        Set<String> words2 = new TreeSet<>(); // 区分大小写
        Collections.addAll(words2, "apple beer pear Bear App".split(" "));
        System.out.println(words2);
        
        /*
         * 有序的,使用TreeSet
         * 无序的,HashSet
         * 排序时保持插入顺序的,LinkedHashSet
         */
        
    }

}
