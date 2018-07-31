package pers.rush.beginner._45_持有对象_泛型和类型安全的容器;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<String> alstrs = new ArrayList<String>();
        alstrs.add("123");
        alstrs.add("abc");
        alstrs.add("中国");
        for (int i = 0; i < alstrs.size(); ++i) {
            System.out.println(alstrs.get(i));
        }
        System.out.println("======================");
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; ++i) {
            apples.add(new Apple());
        }
//        apples.add(new Orange()); // 会报错
        for (int i = 0; i < apples.size(); ++i) {
            System.out.println(apples.get(i).id());
        }
        System.out.println("**************************");
        for (Apple a : apples) {
            System.out.println(a.id());
        }
        /*
         * 使用泛型容器,指定某个类型作为参数
         * 可以放子类,类型可以向上转型
         */
    }
}
