package pers.rush.beginner._57_通过异常处理错误_使用finally进行清理;

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception";
    }
}
/**
 * 不重要的异常
 * @author Rush
 */
class NoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    
    void dispose() throws NoHumException {
        throw new NoHumException();
    }
    
    public static void main(String[] args) {
        // try-finally 会丢失异常
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f(); // 会抛出重要的异常
            } finally {
                lm.dispose(); // 释放资源 并且抛出不重要的异常
                /* 导致catch语句中只能捕获finally块中抛出的异常
                 * try块中的异常就丢失了,后面的异常替换掉了前面的异常
                 */
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
