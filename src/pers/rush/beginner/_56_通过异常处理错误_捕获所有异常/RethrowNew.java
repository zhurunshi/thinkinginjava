package pers.rush.beginner._56_通过异常处理错误_捕获所有异常;

class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String s) {
        super(s);
    }
}

public class RethrowNew {

    public static void f() throws OneException {
        System.out.println("originating the Exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException ex) {
            System.out.println("Caught in outer try, e.printStackTrace()");
            ex.printStackTrace(System.out);
        }
        /*
         * 异常链:捕获一个异常,再抛出另外一个异常
         * 把原始的信息保存下来,还要抛出一个新的异常,把它们链接起来
         * 这就被称为异常链.
         */
    }

}
