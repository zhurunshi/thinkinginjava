package pers.rush.intermediate._09_类型信息_动态代理;

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

/**
 * 真实对象
 */
class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse");
    }
}

/**
 * 简单代理类
 */
class SimpleProxy implements Interface {
    /*
     * 代理对象不重新写方法
     *
     */
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse");
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println("=========================");
        consumer(new SimpleProxy(new RealObject()));
    }
}
