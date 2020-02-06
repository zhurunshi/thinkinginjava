 package pers.rush.intermediate._19_泛型_通配符一;

import java.util.ArrayList;
import java.util.List;

public class SuperTypeWildcards {
     // 传入的类型必须是Apple或者是Apple往上的
    // List<? extends T>表示该集合中存在的都是类型T的子类，包括T自己
    // List<? super T>表示该集合中存的都是类型T的父类，包括T自己
     static void WriteTo(List<? super Apple> list) {
         list.add(new Apple());
         list.add(new Jonathan());
         // list里面的类型只能是Apple或者其子类
//         list.add(new Fruit());
     }
     public static void main(String[] args) {
        List<Apple> alist = new ArrayList<>();
        WriteTo(alist);
        List<Fruit> flist = new ArrayList<>();
        WriteTo(flist);
        List<Jonathan> jlist = new ArrayList<>();
        // 这里有限制,只能是Apple或其父类
//        WriteTo(jlist);
    }
}
