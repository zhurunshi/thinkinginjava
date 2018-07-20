package pers.rush.beginner._38_接口_嵌套接口及接口与工厂;

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {

    Implementation1(){} // 不加也可以
    
    @Override
    public void method1() {
        System.out.println("Implemention1.method1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention1.method2");
    }
    
}

class Implementation2 implements Service {

    Implementation2(){} // 不加也可以
    
    @Override
    public void method1() {
        System.out.println("Implemention2.method1");
    }

    @Override
    public void method2() {
        System.out.println("Implemention2.method2");
    }
    
}

class Implementation1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1();
    }
    
}

class Implementation2Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation2();
    }
    
}

public class Factories {
    /*
     * 接口与工厂:
     * 接口是实现多重继承的途径.
     * 生成遵循某个接口的对象是利用工厂方法.
     */
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    
    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }
}
