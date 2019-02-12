package pers.rush.intermediate._03_字符串_正则表达式1;

public class Replacing {

    static String s = Splitting.knights;

    public static void main(String[] args) {
        // "\w"代表0-9a-zA-Z
        System.out.println(s.replaceFirst("f\\w+", "Located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
    }

}
