package pers.rush.intermediate._08_类型信息_反射;

public class Test {
    public static void main(String[] args) {
        // 两种方式判断对象是否属于某个类的家族(只能往上判断,不能往下判断)
        System.out.println("" instanceof String);
        System.out.println(String.class.isInstance(""));
    }
}
