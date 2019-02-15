package pers.rush.intermediate._05_字符串_扫描输入和StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SimpleRead {
    public static BufferedReader input = new BufferedReader(
            new StringReader("Sir Robin of Camelot\n22 1.61803")
    );

    public static void main(String[] args) {
        /**
         * StringReader将String转化为可读的流对象
         * 然后用这个对象来构造BufferReader对象
         * 最终,我们可以使用input对象一次读取一行文本
         * readLine()方法将一行输入转为String对象,
         * 缺点是,如果两个输入值在同一行中,事情就不好办了
         */
        try {
            System.out.println("What is your name");
            String name = input.readLine();
            System.out.println(name);
            System.out.println("How old are you? What is your favorite double?");
            System.out.println("input: <age> <double>");
            String numbers = input.readLine();
            System.out.println(numbers);
            String[] numArray = numbers.split(" ");
            int age = Integer.parseInt(numArray[0]);
            double favorite = Double.parseDouble(numArray[1]);
            System.out.format("Hi %s.\n", name);
            System.out.format("In 5 years you will be %d.\n", age + 5);
            System.out.format("My favorite double is %f.", favorite / 2);
        } catch (IOException e) {
            System.err.println("I/O exception");
        }

    }
}
