package pers.rush.beginner._59_通过异常处理错误_异常匹配和其他可选方式;

import java.io.FileInputStream;
import java.io.IOException;

public class MainException {

    // 把异常传递给控制台
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("MainException.java");
        file.close();
        // 把受检异常转换为非受检异常
    }

}
