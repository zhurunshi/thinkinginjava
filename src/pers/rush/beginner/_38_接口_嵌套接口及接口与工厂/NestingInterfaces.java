package pers.rush.beginner._38_接口_嵌套接口及接口与工厂;

class A {
    // 嵌套接口
    interface B {
        void f();
    }
    public class BImp implements B {
        public void f() {}
    }
    private class BImp2 implements B {
        public void f() {}
    }
    public interface C {
        void f(); 
    }
    class CImp implements C {
        public void f() {}
    }
    private class CImp2 implements C {
        public void f() {}
    }
    private interface D {
        void f();
    }
    private class DImp implements D {
        public void f() {}
    }
    public class DImp2 implements D {
        public void f() {}
    }
    public D getD() {
        return new DImp2();
    }
    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G{
        void f();
    }
    public interface H{
        void f();
    }
    void g();
}

public class NestingInterfaces {
    public class BImp implements A.B {

        @Override
        public void f() {}
        
    }
    
    public class CImp implements A.C {

        @Override
        public void f() { }
        
    }
    
    class EImp implements E {

        @Override
        public void g() { }
        
    }
    
    class EGImp implements E.G {

        @Override
        public void f() {}
        
    }
    class EImp2 implements E {

        @Override
        public void g() { }
        class EG implements E.G {

            @Override
            public void f() {}
            
        }
    }
    
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        a2.receiveD(a.getD());
    }
    
}
