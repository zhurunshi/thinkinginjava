package pers.rush.beginner._57_通过异常处理错误_使用finally进行清理;

class FourException extends Exception {
    
}

public class AlwaysFinally {

    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new FourException(); // 即使发生异常,也得先执行finally
            } finally { // 永远会执行
                System.out.println("finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println("Caught FourException in 1st try block");
        } finally {
            System.out.println("finally in 1st try block");
        }
    }

}
