package pers.rush.beginner._57_通过异常处理错误_使用finally进行清理;
public class NeverCaught {
    
    static void f() {
        throw new RuntimeException("From f()");
    }
    
    static void g() {
        f();
    }

    public static void main(String[] args) {
        /*
         * 所有异常都继承Exception的类,这个类上面还有一个父类Throwable
         * Throwable 有两个子类 Error 和 Exception
         * e.printStackTrace(); 可以打印异常调用关系 实际上是继承Throwable 里面的方法
         * Error里面有很多子类,都是以Error结尾
         * Exception 也是,分为两类:需要捕获的异常(不捕获的话编译器不通过)
         * 和运行时异常(RuntimeException),这类异常是不需要捕获的异常,会自动被JVM抛出
         * RuntimeException有很多子类型:空指针异常,这类异常不需要捕获,直接输出给System.Err
         * 意味着,其他非运行时异常都是由编译器强制实施捕获的,而运行时异常表示编程时的错误.
         * Error是Throwable的子类,是由JVM生成并抛出的
         * 程序不需要对这种错误进行处理.
         */
        g();
    }

}
