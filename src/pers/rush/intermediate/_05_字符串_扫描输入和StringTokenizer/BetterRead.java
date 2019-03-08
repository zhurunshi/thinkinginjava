package pers.rush.intermediate._05_字符串_扫描输入和StringTokenizer;

import java.util.Scanner;

public class BetterRead {
    public static void main(String[] args) {
        /**
         * 所有的next方法,只有在找到一个完整的分词之后才会返回
         * Scanner还有相应的hasNext方法,用以判断下一个输入分词是否所需的类型
         */
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println("name = " + name);
        System.out.println("How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>)");
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s.\n", name);
        System.out.format("In 5 years you will be %d.\n", age + 5);
        System.out.format("My favorite double is %f.", favorite / 2);
    }
}
