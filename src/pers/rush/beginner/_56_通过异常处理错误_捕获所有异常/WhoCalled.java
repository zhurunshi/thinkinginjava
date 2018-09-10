package pers.rush.beginner._56_通过异常处理错误_捕获所有异常;

public class WhoCalled {
    
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            // 打印栈轨迹
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getLineNumber() + " : " + ste.getMethodName());
            }
        }
    }
    
    static void g() {
        f();
    }
    
    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("===============================");
        g();
        System.out.println("===============================");
        h();
    }

}
