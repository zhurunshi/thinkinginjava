package pers.rush.beginner._54_持有对象_Foreach和迭代器;

import java.util.Arrays;

public class ArrayIsNotIterable {

    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t + "  ");
        }
    }
    
    public static void main(String[] args) {
        /*
         * 数组是特殊的容器，不能用for-each
         */
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C", "D"};
//        test(strings); // 原因是数组对象没有实现Iterable接口，而是进行了特殊处理，使其可以使用for-each
        test(Arrays.asList(strings));
    }

}
