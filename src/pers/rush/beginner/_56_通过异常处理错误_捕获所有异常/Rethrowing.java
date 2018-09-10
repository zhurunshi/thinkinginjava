package pers.rush.beginner._56_通过异常处理错误_捕获所有异常;

public class Rethrowing {
    
    public static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("thrown from f()");
    }
    
    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }
    
    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(), e.printStackTrace()");
            e.printStackTrace(System.out);
//            throw e; // 若直接抛出异常，栈信息不显示此处的位置。
            /* 调用填充跟踪栈的方法，把此处的信息也加入到跟踪栈里面
             * 为了把Throwable转换成Exception，需要强制转型。
             */
            throw (Exception) e.fillInStackTrace(); // 覆盖栈信息
        }
    }

    public static void main(String[] args) {
        // 重抛异常
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        System.out.println("=======================");
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }

}
