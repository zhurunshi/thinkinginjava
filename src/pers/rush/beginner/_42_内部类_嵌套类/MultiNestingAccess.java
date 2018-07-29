package pers.rush.beginner._42_内部类_嵌套类;

class MNA {
    private void f() {
        System.out.println("MNA.f()");
    }
    
    class A {
        private void g() {
            System.out.println("MNA.A.g()");
        }
        public class B {
            void h() {
                g(); // 存在引用外围类A
                f(); // 存在引用外围类MNA
            }
        }
    }
}

/**
 * 多重嵌套访问
 * @author Rush
 *
 */
public class MultiNestingAccess {
    /* 
     * 从多层嵌套类中访问外部类的成员
     */
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        // 有多少层写多少层
        mnaab.h();
    }
}
