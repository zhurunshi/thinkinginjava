package pers.rush.beginner._59_通过异常处理错误_异常匹配和其他可选方式;

import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckedException {
    void throwRuntimeException(int type) {

        try {
            switch (type) {
            case 0:
                throw new FileNotFoundException();
            case 1:
                throw new IOException();
            case 2:
                throw new RuntimeException("Where am I?");
            default:
                return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e); // 非受检异常,不用显式捕获
        }
    }
}

class SomeOtherException extends Exception {}

public class TurnOffChecking {

    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        wce.throwRuntimeException(3);
        for (int i = 0; i < 4; ++i) {
            try {
                if (i < 3) {
                    wce.throwRuntimeException(i);
                } else {
                    throw new SomeOtherException();
                }
            } catch (SomeOtherException e) {
                System.out.println("SomeOtherException: " + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause(); // 利用这个方法可以拿到原始的异常
                    // 有getCause,外面必须有catch (Throwable e)
                } catch (FileNotFoundException e) {
                    System.out.println("FileNotFoundException: " + e);
                } catch (IOException e) {
                    System.out.println("IOException: " + e);
                } catch (Throwable e) {
                    System.out.println("RuntimeExceptioin: " + e);
                }
            }
        }
    }

}
