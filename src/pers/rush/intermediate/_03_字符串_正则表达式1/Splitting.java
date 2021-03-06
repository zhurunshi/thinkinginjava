package pers.rush.intermediate._03_字符串_正则表达式1;

import java.util.Arrays;

public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+"); // "\W"表示非字母和数字,非a-zA-Z0-9
        split("n\\W+"); // "Then, "  "when " "you have found the shrubbery, you must cut down " "the mightiest tree in " "the forest... with... a herring!"
    }
}
