package pers.rush.beginner._44_内部类_内部类的继承和局部内部类;

/**
 * 外围类
 * @author Rush
 *
 */
class WithInner {
    /**
     * 内部类
     * @author Rush
     *
     */
    class Inner {
        
    }
}

public class InheritInner extends WithInner.Inner {
    // 需要封闭内部类的实例,写一个构造器
    // 构造器里面把外围包含的类对象传进来,然后调用
    InheritInner(WithInner wi) {
        wi.super();
    }
    /*
     * 构造器要求传过来外部类
     * 在构造器中调用外围类的super方法
     * 封闭类引用的构造器的调用
     * 这样才能提供必要的引用
     * 程序才能编译通过
     * 
     * 内部类Inner的子类InheritInner只继承Inner
     * 默认的构造器不可以,
     * 必须调用外部类的引用
     * 程序才能编译通过
     */
    
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        // 这样内部类才能操作外围类
    }
}
