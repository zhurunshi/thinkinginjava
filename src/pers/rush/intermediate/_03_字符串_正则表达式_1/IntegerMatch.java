package pers.rush.intermediate._03_字符串_正则表达式_1;

public class IntegerMatch {
    public static void main(String[] args) {
        // ?是量词,控制匹配前面的字符0次或1次,但是不可以出现多次
        // +是量词,表示前面的表达式至少出现1次或以上
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+")); // ()表示是一个子表达式
    }
}
