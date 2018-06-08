package pers.rush.beginner._28_复用类_final关键字;

class WithFinals{
    private final void f() {
        // final修饰私有方法,没什么意义
        System.out.println("WithFinals.f()");
    }
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    // 并不是重写,只是碰巧名字一样,访问不到父类方法
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverringIllusion {

    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
//        op.f(); // 不行 私有的
        WithFinals wf = new WithFinals();
//        wf.f(); // 还找不到 私有的
    }

}
