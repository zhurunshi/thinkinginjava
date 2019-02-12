package pers.rush.intermediate._04_字符串_正则表达式2;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        // Only do the first
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3))); // 只拆分成3个
    }
}
