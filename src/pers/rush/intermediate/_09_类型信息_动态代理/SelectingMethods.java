package pers.rush.intermediate._09_类型信息_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class MethodSelector implements InvocationHandler {
    private Object proxide;

    public MethodSelector(Object proxide) {
        this.proxide = proxide;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("interesting")) {
            System.out.println("Proxy deteted interesting method");
        }
        return method.invoke(proxide, args);
    }
}

interface SomeMethods {
    void boring1();
    void boring2();
    void interesting(String arg);
    void boring3();
}

class Implementation implements SomeMethods {

    @Override
    public void boring1() {
        System.out.println("boring1");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public void interesting(String arg) {
        System.out.println("interesting: " + arg);
    }

    @Override
    public void boring3() {
        System.out.println("boring3");
    }
}

public class SelectingMethods {
    public static void main(String[] args) {
        SomeMethods methods = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(), new Class[]{SomeMethods.class}, new MethodSelector(new Implementation()));
        methods.boring1();
        methods.boring2();
        methods.interesting("rush");
        methods.boring3();
    }
}
