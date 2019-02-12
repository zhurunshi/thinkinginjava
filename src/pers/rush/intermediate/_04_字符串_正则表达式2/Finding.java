package pers.rush.intermediate._04_字符串_正则表达式2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while(m.find()) { // 不传参数,向前遍历输入的字符串
            System.out.print(m.group() + " ");
        }
        System.out.println();
        int i = 0;
        while(m.find(i)) { // 传入的位置作为起点
            System.out.print(m.group() + " ");
            ++i;
        }
    }
}
