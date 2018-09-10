package pers.rush.beginner._56_通过异常处理错误_捕获所有异常;

class OneException extends Exception {
    public OneException (String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException (String s) {
        super(s);
    }
}

public class RethrowNew {

    public static void f() throws OneException {
        System.out.println("originating the Exception");
    }
    
    public static void main(String[] args) {
        
    }

}
