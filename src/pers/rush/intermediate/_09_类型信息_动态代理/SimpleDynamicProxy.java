package pers.rush.intermediate._09_类型信息_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied; // 被代理的真实对象

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("***** proxy: " + proxy.getClass() + ", " + method.getName()
                + ", args: " + args);

        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
    /* 利用java的动态代理,设计代理调用
     * 实现:调用处理接口
     */
}


public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        System.out.println("==============");
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class}, new DynamicProxyHandler(new RealObject()));
        consumer(proxy);
    }
}