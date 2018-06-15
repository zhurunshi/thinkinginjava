package pers.rush.beginner._31_多态_转机;

class StaticSuper{
    public static String staticGet() {
        return "Base staticGet()";
    }
    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper{
    public static String staticGet() {
        return "Derived staticGet()";
    }
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}

/**
 * 静态多态性
 * @author Rush
 *
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet()); // 声明什么类型就调用什么类型
        System.out.println(sup.dynamicGet());
    }
}
