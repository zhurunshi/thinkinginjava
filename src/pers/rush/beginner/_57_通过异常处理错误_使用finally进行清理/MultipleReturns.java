package pers.rush.beginner._57_通过异常处理错误_使用finally进行清理;
public class MultipleReturns {

    public static void f(int i) {
        System.out.println("Initiallzation that requires cleanup");
        try {
            System.out.println("Point 1");
            if (i == 1) {
                return ; // 代表退出方法
            }
            System.out.println("Point 2");
            if (i == 2) {
                return;
            }
            System.out.println("Point 3");
            if (i == 3) {
                return;
            }
            System.out.println("Point 4");
            return;
        } finally { // 即使有return也会执行finally
            System.out.println("Performing cleanup");
        }
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 4; ++i) {
            f(i);
        }
        // try-finally 会丢失异常
    }

}
