package pers.rush.beginner;

class Soup1 {
    private Soup1() { }
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private static Soup2 soup2 = new Soup2();
    // 饿汉式单例模式
    private Soup2() {}
    public static Soup2 getInstance() {
        return soup2;
    }
}

public class _25_访问权限控制_类的访问权限 {

    void testPrivate() {
//        Soup1 soup1 = new Soup1();
    }
    void testStatic() {
        Soup1 soup1 = Soup1.makeSoup();
    }
    void testSingleton() {
        Soup2 soup2 = Soup2.getInstance();
        Soup2 soup3 = Soup2.getInstance();
        System.out.println(soup2);
        System.out.println(Integer.toHexString(soup3.hashCode()));
    }
    
    public static void main(String[] args) {
        /* 
         * 一个编译单元只能有一个public修饰的类,而且名字要和文件名相同
         * 可以有很多class,但是只能有一个public类
         * 缺省定义class 代表包内可以访问
         */
        new _25_访问权限控制_类的访问权限().testSingleton();
    }

}
