package pers.rush.beginner;

class InitialValue {
    
}

public class _19_成员初始化 {
    int i; // 类里面的成员都默认赋初始值,int->0
    char c;
    byte b;
    short s;
    long l;
    float f;
    double d;
    boolean bool;
    InitialValue reference;
    public static void main(String[] args) {
        new _19_成员初始化().test();
        new _19_成员初始化().testPrint();
    }  

    public void test() {
        // 如果在这里声明变量,是局部变量,则需要初始化
        // 为什么局部变量没有初始值呢?原因是避免程序员犯错误,会编写许多局部变量
        // 局部变量可能因为疏忽忘记赋值,而导致错误的结果.
        int j;
        System.out.println("i=" + i);
//        System.out.println(j); // 报错
    }
    
    public void testPrint() {
        System.out.println("int:" + i);
        System.out.println("char:" + "[" + c + "]");
        System.out.println("byte:" + b);
        System.out.println("short:" + s);
        System.out.println("long:" + l);
        System.out.println("float:" + f);
        System.out.println("double:" + d);
        System.out.println("bool:" + bool);
        System.out.println("对象:" + reference);
    }
    
}
