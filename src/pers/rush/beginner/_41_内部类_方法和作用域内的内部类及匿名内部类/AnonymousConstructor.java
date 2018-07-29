package pers.rush.beginner._41_内部类_方法和作用域内的内部类及匿名内部类;

abstract class Base {
    public Base(int i) {
        System.out.println("Base Constructor, i = " + i);
    }
    
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        // 抽象类本不能new,所以这里创建的是子类
        return new Base(i) {
            // 实例初始化代码块
            {
                System.out.println("在实例初始化内部");
            }

            @Override
            public void f() {
                System.out.println("执行了匿名子类的f方法");
            }
        };
    }
    
    public static void main(String[] args) {
        Base b = getBase(47);
        b.f();
    }
}
