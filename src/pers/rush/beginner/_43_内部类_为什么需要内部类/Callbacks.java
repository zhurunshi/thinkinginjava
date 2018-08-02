package pers.rush.beginner._43_内部类_为什么需要内部类;

interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable{
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
    
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }
    
    static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;
    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    /**
     * 闭包类
     */
    private class Closure implements Incrementable {

        @Override
        public void increment() {
            Callee2.this.increment();
        }
        
    }
    
    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }
    void go() {
        callbackReference.increment();
    }
}

public class Callbacks {
    /*
     * 闭包与回调
     * 闭包:一个可调用的对象,记录了一些信息,这些信息来自创建它的对象域
     * 内部类是面向对象的闭包,因为不仅包含外围类对象的信息,还自动拥有指向外围类对象的引用
     * 内部类有权操作外围类的所有成员,包括private的成员
     * java没有指针,如果需要回调的功能,就可以使用内部类闭包的功能来解决问题
     * 用闭包解决回调,更灵活更安全
     */
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2); //i = 1 ~
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go(); //i = 1 `
        caller1.go(); //i = 2 ` 
        caller2.go(); //i = 2 ~
        caller2.go(); //i = 3 ~
    }
    
}
