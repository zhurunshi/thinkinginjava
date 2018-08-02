package pers.rush.beginner._43_内部类_为什么需要内部类;

class D {
    
}

abstract class E {
    
}

class Z extends D {
    // 利用内部类来实现多重继承
    E makeE() {
        return new E() {
            
        };
    }
}

public class MultiImplementation {
    
    static void takesD(D d) {
        
    }
    
    static void takesE(E ae) {
        
    }
    
    public static void main(String[] args) {
        Z z = new Z();
        
        takesD(z);
        takesE(z.makeE());
        
    }
}
