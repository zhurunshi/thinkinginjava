package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象;

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            // 必须写全限定名
            Class clazz = Class.forName("pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象.Gum");
            System.out.println("clazz = [" + clazz + "]");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
