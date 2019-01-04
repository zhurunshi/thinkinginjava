package pers.rush.intermediate._02_字符串_无意识递归及格式化输出;

public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        System.out.println("Row 1:[" + x + " " + y + "]");
        System.out.format("Row 1:[%d %f]\n", x, y);
        System.out.printf("Row 1:[%d %f]\n", x, y);
        // 所有新的格式化功能都是由java.util.Formatter类处理的
    }
}
