package pers.rush.beginner._40_内部类_this和new及向上转型;

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    
    public class Inner {
        // 在内部类的方法中得到外部类对象实例本身
        public DotThis outer() {
            return DotThis.this; // 引用外部类对象的实例
        }
    }
    
    // 得到内部类对象
    public Inner inner() {
        return new Inner();
    }
    
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dt1 = dt.inner(); // 得到内部对象
        dt1.outer().f(); // 通过内部对象拿到外部对象实例dt
    }
}
