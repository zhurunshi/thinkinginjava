package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象;

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        // 先上类加载器中找,如果找不到,再上名字.class文件,找到就加载进去
        Class initable = Initable.class; // 类字面常量,会执行静态初始化块
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal); // 这里会先执行静态初始化块,再执行打印操作
        Class initable3 = Class.forName("pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);

    }
}
