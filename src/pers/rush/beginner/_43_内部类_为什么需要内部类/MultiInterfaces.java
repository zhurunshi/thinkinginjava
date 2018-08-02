package pers.rush.beginner._43_内部类_为什么需要内部类;

interface A {
    
}

interface B {
    
}

class X implements A, B {
    
}

class Y implements A {
    B makeB() {
        return new B() {
            
        };
    }
}

public class MultiInterfaces {
    /*
     * 最吸引人的原因:每个内部类都能独立地继承自一个接口的实现
     * 无论外围类是否继承某个接口,内部类都没有影响
     * 
     * 需求:
     * 必须要在一个类以某种方式实现两个接口
     * 要么用单一类,要么内部类
     */
    static void takesA(A a) {
        
    }
    
    static void takesB(B a) {
        
    }
    
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
        /*
         * 都能正常运行
         * 换个环境的话:比如拥有的不是接口,而是具体的类
         * 这种情况只能使用内部类
         */
    }
}
