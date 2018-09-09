package pers.rush.beginner._55_通过异常处理错误_捕获异常和创建自定义异常;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException2 {

    private static Logger logger = Logger.getLogger("LoggingException2");
    
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }

}
