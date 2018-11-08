package pers.rush.intermediate._01_字符串_不可变String和StringBuilder;
public class Immutable {
    
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy"; // 先在字符串池搜索有没有howdy,如果有,直接拿出来给q;如果没有,就会创建出来
        System.out.println("q=" + q);
        String qq = upcase(q); // 转大写,实际上是创建了一个新的字符串
        System.out.println("qq=" + qq);
        System.out.println("q=" + q);
    }

}
