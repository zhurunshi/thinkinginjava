package pers.rush.intermediate._05_字符串_扫描输入和StringTokenizer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I'm not dead yet! I feel happy!";
        StringTokenizer stoke = new StringTokenizer(input); // 默认是用空白拆分
        while(stoke.hasMoreElements()) {
            System.out.println(stoke.nextToken() + " ");
        }
        System.out.println("============================");
        System.out.println(Arrays.toString(input.split(" ")));
        System.out.println("============================");
        Scanner scanner = new Scanner(input);
        while(scanner.hasNext()) {
            System.out.print(scanner.next() + " ");
        }
        // 用扫描仪的好处是:如果你拿到的字符串是其他数据类型,就不需要再去转换
    }
}
