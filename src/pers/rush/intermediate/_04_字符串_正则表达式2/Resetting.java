package pers.rush.intermediate._04_字符串_正则表达式2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while(m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        m.reset("fix the rig with rags"); // reset重置:当对新的字符串重新匹配,就要调用这个方法
        while(m.find()) {
            System.out.print(m.group() + " ");
        }
    }
}
