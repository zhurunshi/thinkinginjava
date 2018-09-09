package pers.rush.beginner._55_通过异常处理错误_捕获异常和创建自定义异常;

class MyException extends Exception {
    public MyException(){}
    
    public MyException(String msg) {
        super(msg);
    }
}

public class FullConstructors {
    
    public static void f() throws MyException {
        System.out.println("Throw MyException from f()");
        throw new MyException();
    }
    
    public static void g() throws MyException {
        System.out.println("Throw MyException from g()");
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out); // 打印栈跟踪到输出流中
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        /*
         * 异常与记录日志
         * java工具包有一个logging工具，可以将输出记录到日志中
         */
    }

}
