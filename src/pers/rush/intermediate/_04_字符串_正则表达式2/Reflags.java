package pers.rush.intermediate._04_字符串_正则表达式2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reflags {
    public static void main(String[] args) {
        // 寻找开头是java的, 设置不区分大小写(默认情况下是区分大小写的)和多行模式匹配
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has regex\nJava has regex\n" +
                        "JAVA has pretty good regular expressions\n" +
                        "Regular expressions are in Java"); // 最后一个不符合,末尾是java
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
