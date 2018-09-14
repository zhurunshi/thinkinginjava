package pers.rush.beginner._57_通过异常处理错误_使用finally进行清理;

class ThreeException extends Exception {
    static int count = 0;
}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        /*
         * finally子句 无论如何都会执行的代码块 "固定出口"
         * 把catch里面重复代码放到finally子句中
         */
        while (true) {
            try {
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No Exception");
            } catch(ThreeException e) {
                System.out.println("Exception");
            } finally { // 无论如何(即使try里面没有异常,即使try里面return了),也会执行!!
                System.out.println("In finally clause");
                if (count == 2) {
                    break;
                }
            }
        }
    }

}
